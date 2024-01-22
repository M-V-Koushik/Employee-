package com.amdocs.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.employee.entity.employee;

@Repository
public interface empRepo extends JpaRepository<employee,Integer>{

}
