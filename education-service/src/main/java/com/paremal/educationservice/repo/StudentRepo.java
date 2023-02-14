package com.paremal.educationservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paremal.educationservice.model.Students;

public  interface StudentRepo extends JpaRepository<Students, Integer>{
}
