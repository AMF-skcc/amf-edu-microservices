package com.example.amf.edu.admin.controller.mapper;

import org.mapstruct.Mapper;

import com.example.amf.edu.admin.app.util.EntityMapper;
import com.example.amf.edu.admin.domain.admin.dto.AdminDto;
import com.example.amf.edu.admin.domain.admin.entity.Admin;

@Mapper
public interface AdminMapper extends EntityMapper<AdminDto, Admin> {
}
