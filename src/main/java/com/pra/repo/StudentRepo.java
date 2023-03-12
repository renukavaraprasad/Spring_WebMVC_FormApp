package com.pra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pra.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

}
