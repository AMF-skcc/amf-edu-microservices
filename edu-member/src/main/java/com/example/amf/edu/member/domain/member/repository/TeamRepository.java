package com.example.amf.edu.member.domain.member.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amf.edu.member.domain.member.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
	Set<Team> findAllTeamByName(String name);
}
