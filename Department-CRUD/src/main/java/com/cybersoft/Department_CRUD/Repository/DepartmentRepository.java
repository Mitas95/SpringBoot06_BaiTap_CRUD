package com.cybersoft.Department_CRUD.Repository;

import com.cybersoft.Department_CRUD.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
