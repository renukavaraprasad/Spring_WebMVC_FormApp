package com.pra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pra.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
