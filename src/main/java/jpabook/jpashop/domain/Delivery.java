package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@Setter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;

    @Embedded
    private Address address;

    /*EnumType 의 default 값은 ORDINAL */
    /*ORDINAL 은 컬럼 값을 순차적 숫자로 매겨줌*/
    /*그러나 중간에 새로운 값 추가가 되면 순서가 밀려 문제가 됨 */
    /* 이럴때는 꼭 STRING 값 사용*/
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status; //READY(배송 준비), COMP(배송)

}
