package com.example.amf.edu.member.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.amf.edu.member.domain.member.entity.Member;
import com.example.amf.edu.member.domain.member.entity.Team;
import com.example.amf.edu.member.domain.member.repository.MemberRepository;
import com.example.amf.edu.member.domain.member.repository.TeamRepository;
import com.example.amf.edu.member.service.MemberService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {
	private final MemberRepository memberRepository;
	private final TeamRepository teamRepository;
	
	@Override
	public List<Member> findAllMemberByTeamId(Long id) {
		return memberRepository.findAllMemberByTeamId(id);
	}

	@Override
	public Member saveMember(Member member, Long teamId) {
		Optional<Team> team = teamRepository.findById(teamId);
		team.ifPresent(saveTeam -> {
			member.setTeam(saveTeam);
		});

		return memberRepository.save(member);
	}

}
