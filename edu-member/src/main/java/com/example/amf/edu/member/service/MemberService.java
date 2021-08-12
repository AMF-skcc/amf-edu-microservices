package com.example.amf.edu.member.service;

import java.util.List;

import com.example.amf.edu.member.domain.member.entity.Member;

public interface MemberService {
	List<Member> findAllMemberByTeamId(Long id);
	Member saveMember(Member member);
}
