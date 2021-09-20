package org.closure.systemcompany.repositories;

import java.util.Optional;

import org.closure.systemcompany.DTO.EmployeeQueryDTO;
import org.closure.systemcompany.Exceptions.EmployeeQueryException;
import org.closure.systemcompany.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {
 
    Optional<EmployeeEntity> findByEmail(String email);
    List<EmployeeEntity> findBySpecialty(String specialy);

    @Query(value = "select * from employee e where specialty = \"web\"",nativeQuery = true)
    List<String> webEmployeeList();

    @Query(value = " select * from employee e where specialty = \"mobile\"",nativeQuery = true)
    List<EmployeeQueryDTO> mobileEmployeeList();

    @Query(value = " select * from employee e where specialty = \"diskTop\"",nativeQuery = true)
    List<String> diskTopEmployeeList();
}
