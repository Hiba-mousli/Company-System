package org.closure.systemcompany.repositories;

import org.closure.systemcompany.entities.CVEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVRepo extends JpaRepository<CVEntity,Integer> {
    
}
