package org.closure.systemcompany.controller;

import org.closure.systemcompany.DTO.TaskDTO;
import org.closure.systemcompany.Exceptions.TaskException;
import org.closure.systemcompany.Services.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/api/v1/Tasks"})
public class TasksController {

    @Autowired
    TasksService tasksService;

    @RequestMapping(value="/createTask/{num}", method=RequestMethod.POST)
    public Object CreatTask (@RequestBody TaskDTO task , @PathVariable (name = "num") int id)
    {
        try{
            return tasksService.creatTask(task , id );
           }
        catch(TaskException e){
            return e.getMessage();
           }
    }

    @RequestMapping(value="/showTasks/{num}", method=RequestMethod.GET)
    public Object ShowAllTasks(@PathVariable (name = "num") int id)
    {
        try{
            return tasksService.showTasks(id);
           }
        catch(TaskException e){
            return e.getMessage();
           }
    }

    @RequestMapping(value="/DoneTask/{num}", method=RequestMethod.GET)
    public Object DoneTask (@PathVariable (name = "num") int id) throws TaskException
    {
        try{
            return tasksService.DoneTask(id);
        }
        catch(TaskException e){
            return e.getMessage();
        }
            
    }


}
