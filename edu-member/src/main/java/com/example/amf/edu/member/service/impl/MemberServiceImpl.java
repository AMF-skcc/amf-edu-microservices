package com.example.amf.edu.member.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.amf.edu.member.domain.member.entity.Member;
import com.example.amf.edu.member.domain.member.repository.MemberRepository;
import com.example.amf.edu.member.service.MemberService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {
	private final MemberRepository memberRepository;
	
	@Override
	public List<Member> findAllMemberByTeamId(Long id) {
		return memberRepository.findAllMemberByTeamId(id);
	}

	@Override
	public Member saveMember(Member member) {
		return memberRepository.save(member);
	}

}
