package com.zerobase.fastlms.member.service;

import com.zerobase.fastlms.member.entity.Member;
import com.zerobase.fastlms.member.model.MemberInput;
import com.zerobase.fastlms.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    /**
     * 회원가입
     * @param parameter = 입력 정보
     * @return
     */
    @Override
    public boolean register(MemberInput parameter) {

        Optional<Member> optionalMember = memberRepository.findById(parameter.getUserId());

        if (optionalMember.isPresent()) {
            // 현재 userId에 해당하는 데이터 존재
            return false;
        }

        Member member = new Member();
        member.setUserId(parameter.getUserId());
        member.setUserName(parameter.getUserName());
        member.setPhone(parameter.getPhone());
        member.setPassword(parameter.getPassword());
        member.setRegDt(LocalDateTime.now());

        memberRepository.save(member);

        return true;
    }
}
