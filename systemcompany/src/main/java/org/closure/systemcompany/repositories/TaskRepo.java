package org.closure.systemcompany.repositories;

import org.closure.systemcompany.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends JpaRepository<TaskEntity,Integer> {
    
}
