package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class BookForm {

    private Long id;

    //상품 공통 속성
    @NotEmpty(message = "상품명을 입력해주세요")
    private String name;

    @NotNull(message = "책 가격을 1원 이상 입력해주세요")
    @Min(value = 1, message = "책 가격을 1원 이상 입력해주세요")
    private int price;

    @NotNull(message = "책 수량을 1권 이상 입력해주세요")
    @Min(value = 1, message = "책 수량을 1권 이상 입력해주세요")
    private int stockQuantity;

    //책 관련 속성
    private String author;
    private String isbn;

}
