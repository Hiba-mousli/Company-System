package org.closure.systemcompany.repositories;

import org.closure.systemcompany.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<ClientEntity,Integer>{
    
}
