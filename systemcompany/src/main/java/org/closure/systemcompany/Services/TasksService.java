package org.closure.systemcompany.Services;

import java.util.ArrayList;
import java.util.List;

import org.closure.systemcompany.DTO.TaskDTO;
import org.closure.systemcompany.Exceptions.TaskException;
import org.closure.systemcompany.entities.EmployeeEntity;
import org.closure.systemcompany.entities.TaskEntity;
import org.closure.systemcompany.repositories.EmployeeRepo;
import org.closure.systemcompany.repositories.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bytebuddy.asm.Advice.Return;

@Service
public class TasksService {


    @Autowired
    TaskRepo taskReop;

    @Autowired 
    EmployeeRepo employeeRepo;

    public TaskDTO convertToDTO (TaskEntity task)
    {
        TaskDTO dto = new TaskDTO()
            .title(task.getTitle())
            .description(task.getDescription())
            .Done(task.getDone());
           return dto ;
    }

    public TaskEntity convertToEntity (TaskDTO task)
    {
        TaskEntity entity = new TaskEntity()
             .title(task.getTitle())
             .description(task.getDescription())
             .Done(task.getDone());
             return entity;
    }

    public TaskDTO creatTask (TaskDTO task , int id) throws TaskException
    {
        EmployeeEntity eentity = employeeRepo.findById(id).orElseThrow(()-> new TaskException("There Is No Employee Like This ..."));
        if (eentity != null)
        {
            if ( task.getTitle() != null && task.getDescription() != null )
        {
            TaskEntity entity = taskReop.save(
            new TaskEntity().description(task.getDescription())
                            .title(task.getTitle())
                            .Done(false)
                            .employee(employeeRepo.getById(id)));
            eentity.getTasks().add(entity);
            employeeRepo.save(eentity);
            return task.id(entity.getId());
         }
         else{
             throw new TaskException("Sorry , You Add Null Task ...");
         }
        }
        else{
            throw new TaskException("Enter Employee Id Who Responsible For The Task ...");
        }
    }


    public List<TaskDTO> showTasks (int id) throws TaskException
    {
        EmployeeEntity entity = employeeRepo.findById(id).orElseThrow(()-> new TaskException("There Is No Employee Like This ..."));
        if ( entity != null )
        {
           List<TaskEntity> list = entity.getTasks();
           if (list.size() > 0)
           {
               List<TaskDTO> list2 = new ArrayList<>();
               for (TaskEntity employeeEntity : list) 
               {
                   TaskDTO dto = convertToDTO(employeeEntity);
                   list2.add(dto.id(employeeEntity.getId()));
               }
               return list2;
           }
           else{
                return new ArrayList<TaskDTO>();
        }
        }
        else{
            throw new TaskException("There Is No Employee ...");
        }
    } 


    public Object DoneTask (int id)throws TaskException
    {
        TaskEntity entity = taskReop.findById(id).orElseThrow(()-> new TaskException("There Is No Task Like This ..."));
        if ( entity.getDone() == false )
        {
            return convertToDTO(taskReop.save(entity.Done(true))).id(id);
        }
        else{
            throw new TaskException("You'r Task Is Already Done ...");
        } 
    }
    
}
