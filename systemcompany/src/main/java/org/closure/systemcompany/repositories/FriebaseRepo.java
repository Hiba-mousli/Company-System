package org.closure.systemcompany.repositories;

import org.closure.systemcompany.entities.FirebaseEnitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriebaseRepo extends JpaRepository<FirebaseEnitiy,Integer>  {
    
}
