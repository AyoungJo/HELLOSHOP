package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    //특정 id 회원 조회
    //find(entityClass, pk)
    public Member findOne(Long id) {
        return em.find(Member.class, id);
    }

    //전체 회원 조회
    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }

    //특정 name 회원 조회
    public List<Member> findByName(String name) {
        return em.createQuery("select m from Member m where m.name = :name ", Member.class).setParameter("name", name).getResultList();
    }

}
