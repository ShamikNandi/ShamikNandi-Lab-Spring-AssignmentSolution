package com.greatLearning.SMSspringLabproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.SMSspringLabproj.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
