package jpabook.jpashop.service;


import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    //@Autowired
    private final MemberRepository memberRepository;

    /* 회원가입 */
    @Transactional
    public Long join(Member member) {
        validateDuplicatedMember(member); //중복 회원 검증
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicatedMember(Member member) {
        // 동시 DB insert 문제 예방
        // 멀티쓰레드 상황 고려하여 유니크 제약 조건 추가
        List<Member> findMembers = memberRepository.findByName(member.getName());
        if (!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다");
        }

    }

    //회원 전체 조회
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    //회원 한명 조회
    public Member findOne(Long memberId) {
        return memberRepository.findOne(memberId);
    }

}
