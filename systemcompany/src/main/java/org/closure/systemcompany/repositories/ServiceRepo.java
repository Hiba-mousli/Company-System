package org.closure.systemcompany.repositories;

import org.closure.systemcompany.entities.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepo extends JpaRepository<ServiceEntity,Integer> {
    
}
