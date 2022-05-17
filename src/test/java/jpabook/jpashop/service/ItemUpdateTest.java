package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemUpdateTest {

    @Autowired
    EntityManager em;

    @Test
    public void updateTest() throws Exception {
        Book book = em.find(Book.class, 1L);

        //TX
        book.setName("abcd");
        //트랜잭션안에서 변경 후 commit 시점에
        //JPA가 변경문을 감지해서 update 쿼리를 자동 생성하여 DB에 반영
        //==> 더티 체킹 ( 변경감지 )

        //변경감지 == dirty checking
        //TX commit


    }
}
