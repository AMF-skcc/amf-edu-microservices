package com.example.amf.edu.member.domain.member.dto;

import com.example.amf.edu.member.domain.member.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String name;
    private String password;
    private Long teamId;
    private Role role;
    private ContactDto contact;
}
