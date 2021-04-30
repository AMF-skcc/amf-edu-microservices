package com.example.amf.edu.member.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.amf.edu.member.domain.member.entity.Member;
import com.example.amf.edu.member.service.MemberService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class MemberController {
	private final MemberService memberService;
	
	@GetMapping("/teams/{teamId}/members")
	public ResponseEntity<List<Member>> findAllMemberByTeamId(@PathVariable Long teamId) {
		return ResponseEntity.ok().body(memberService.findAllMemberByTeamId(teamId));
	}
	
	@PostMapping("/teams/{teamId}/members")
	public ResponseEntity<Member> saveMember(@RequestBody Member member, @PathVariable Long teamId){
		return ResponseEntity.ok().body(memberService.saveMember(member, teamId));
	}
}
