package com.example.amf.edu.attendance.domain.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amf.edu.attendance.domain.attendance.entity.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
