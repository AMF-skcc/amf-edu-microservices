package com.example.amf.edu.member.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.amf.edu.member.app.util.EntityMapper;
import com.example.amf.edu.member.domain.member.dto.MemberDto;
import com.example.amf.edu.member.domain.member.entity.Member;

@Mapper(componentModel = "spring")
public interface MemberMapper extends EntityMapper<MemberDto, Member>{
	@Mapping(source = "team.id", target = "teamId")
	@Mapping(target = "password", ignore = true)
	MemberDto toDto(Member member);

    @Mapping(source = "teamId", target = "team.id")
    Member toEntity(MemberDto memberDto);
}
