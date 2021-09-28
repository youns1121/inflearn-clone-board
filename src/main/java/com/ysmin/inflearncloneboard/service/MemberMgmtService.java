package com.ysmin.inflearncloneboard.service;

import com.ysmin.inflearncloneboard.dto.MemberDto;
import com.ysmin.inflearncloneboard.entity.Member;
import com.ysmin.inflearncloneboard.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberMgmtService {

    private final MemberRepository memberRepository;


    @Transactional
    public Long createMember(MemberDto memberDto){

        Member member = new Member();
        member.createMember(memberDto);

        return memberRepository.save(member).getMemberSeq();
    }
}
