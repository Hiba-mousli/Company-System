package org.closure.systemcompany.controller;

import org.closure.systemcompany.Exceptions.EmployeeException;
import org.closure.systemcompany.Exceptions.SchedualException;
import org.closure.systemcompany.Services.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/api/v1/Schedual"})
public class SchedualController {

    @Autowired
    SchedualService schedualService;

    @RequestMapping(value="/showSchedual/{num}", method=RequestMethod.GET)
    public Object CreatTask ( @PathVariable (name = "num") int id)
    {
        try{
            return schedualService.showEmployeeSchedual(id);
           }
        catch(SchedualException e){
            return e.getMessage();
           }
           catch(EmployeeException e){
               return e.getMessage();
           }
    }




    
}
