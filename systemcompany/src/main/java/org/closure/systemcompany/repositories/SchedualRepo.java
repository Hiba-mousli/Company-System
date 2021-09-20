package org.closure.systemcompany.repositories;

import org.closure.systemcompany.entities.SchedualEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedualRepo extends JpaRepository<SchedualEntity,Integer> {
    
}
