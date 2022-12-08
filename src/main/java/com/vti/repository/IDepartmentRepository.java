package com.vti.repository;

import com.vti.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDepartmentRepository extends JpaRepository<Department,Integer>, JpaSpecificationExecutor<Department> {
    // @Query("FROM Department WHERE name = ?1")
    // @Query("FROM Department WHERE name = :name")
    // @Query(value = "SELECT * FROM department WHERE name = :name", nativeQuery = true)
    boolean existsByName(String name);

}
