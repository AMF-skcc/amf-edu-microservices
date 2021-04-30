package com.example.amf.edu.member.domain.member.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amf.edu.member.domain.member.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	List<Member> findAllMemberByTeamId(Long id);
}
