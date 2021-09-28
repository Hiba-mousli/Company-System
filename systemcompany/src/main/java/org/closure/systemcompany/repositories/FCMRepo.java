package org.closure.systemcompany.repositories;

import org.closure.systemcompany.entities.FCMEnitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FCMRepo extends JpaRepository<FCMEnitiy,Integer>  {
    
}
