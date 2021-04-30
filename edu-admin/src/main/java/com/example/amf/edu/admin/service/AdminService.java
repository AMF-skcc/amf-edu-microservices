package com.example.amf.edu.admin.service;

import com.example.amf.edu.admin.domain.admin.entity.Admin;

public interface AdminService {
	Admin selectAdminByEmail(String email);
}
