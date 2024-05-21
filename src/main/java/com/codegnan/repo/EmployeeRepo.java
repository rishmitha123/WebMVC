package com.codegnan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codegnan.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
