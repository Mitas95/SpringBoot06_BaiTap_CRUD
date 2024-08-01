package com.cybersoft.Department_CRUD.Repository;

import com.cybersoft.Department_CRUD.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
