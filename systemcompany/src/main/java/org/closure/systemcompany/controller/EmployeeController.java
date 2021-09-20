package org.closure.systemcompany.controller;


import java.util.ArrayList;
import java.util.List;

import org.closure.systemcompany.DTO.EmployeeDTO;
import org.closure.systemcompany.DTO.EmployeeQueryDTO;
import org.closure.systemcompany.Exceptions.EmployeeException;
import org.closure.systemcompany.Exceptions.EmployeeQueryException;
import org.closure.systemcompany.Exceptions.SchedualException;
import org.closure.systemcompany.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/api/v1/auth","/api/v1/employee"})
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    
    @RequestMapping(value="/register", method=RequestMethod.POST)
    public Object registerEmployee (@RequestBody EmployeeDTO employee)
    {
        try{
            return employeeService.registerEmploye(employee);
           }
        catch(EmployeeException e){
            return e.getMessage();
           }
    }

    @RequestMapping(value="/update", method=RequestMethod.POST)
    public Object update (@RequestBody EmployeeDTO employee)
    {
        try{
            return employeeService.update(employee);
           }
        catch(EmployeeException e){
            return e.getMessage();
           }
    }
   
    @RequestMapping(value= "/signin" , method=RequestMethod.POST)
    public Object signIn (@RequestBody EmployeeDTO employee)
    {

        try{
            return employeeService.signIn(employee);
        }
        catch(EmployeeException e){
            return e.getMessage();
        }
    }


    @RequestMapping(value= "/logout/{num}" , method=RequestMethod.GET)
    public Object logout (@PathVariable(name = "num") int id)
    {

        try{
             employeeService.logoutEmployee(id);
             throw new EmployeeException("Exsit Done ...");
        }
        catch(EmployeeException e){
            return e.getMessage();
        }
        catch(SchedualException e){
            return e.getMessage();
        }
    }

    @RequestMapping(value= "/deleteEmployee" , method=RequestMethod.POST)
    public Object deleteEmployee (@RequestBody EmployeeDTO employee)
    {

        try{
            employeeService.deleteEmployee(employee);
            throw new EmployeeException("Delet Done ");
        }
        catch(EmployeeException e){
            return e.getMessage();
        }
    }

    @RequestMapping(value= "/showEmployee" , method=RequestMethod.POST)
    public Object showEmployees (@RequestBody EmployeeDTO employee)
    {

        try{
            return employeeService.showEmployee(employee);
        }
        catch(EmployeeException e){
            return e.getMessage();
        }
    }
    
    @RequestMapping(value= "/showAllEmployees" , method=RequestMethod.POST)
    public Object showAllEmployees (@RequestBody EmployeeDTO employee)
    {

        try{
            return employeeService.showEmployees();
        }
        catch(EmployeeException e){
            return e.getMessage();
        }
    }

    @RequestMapping(value="/showEmployee_webspecialty", method=RequestMethod.GET)
    public List<EmployeeQueryDTO> webEmployee() {
        try{
            return employeeService.querywebEmployee();
        }
        catch(EmployeeQueryException e){
            return new ArrayList<>();
        }
    }

    @RequestMapping(value="/showEmployee_mobilespecialty", method=RequestMethod.GET)
    public List<EmployeeQueryDTO> mobileEmployee(@PathVariable(name = "num") String sp) {
        try{
            return employeeService.querymobileEmployee(sp);
        }
        catch(EmployeeQueryException e){
            return new ArrayList<>();
        }
        
    }

    @RequestMapping(value="/showEmployee_disckTopspecialty", method=RequestMethod.GET)
    public List<EmployeeQueryDTO> Employee() {
        try{
            return employeeService.queryDiskTopEmployee();
        }
        catch(EmployeeQueryException e){
            return new ArrayList<>();
        }
       
    }



}
