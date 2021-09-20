package org.closure.systemcompany.Services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Optional;

import org.closure.systemcompany.DTO.EmployeeDTO;
import org.closure.systemcompany.DTO.EmployeeQueryDTO;
import org.closure.systemcompany.Exceptions.EmployeeException;
import org.closure.systemcompany.Exceptions.EmployeeQueryException;
import org.closure.systemcompany.Exceptions.SchedualException;
import org.closure.systemcompany.entities.EmployeeEntity;
import org.closure.systemcompany.entities.SchedualEntity;
import org.closure.systemcompany.repositories.EmployeeRepo;
import org.closure.systemcompany.repositories.SchedualRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    SchedualRepo schdualRepo;

    @Autowired
    SchedualService schedualService;

    private boolean know_ExsitTime;



    public EmployeeEntity convertToEntity (EmployeeDTO employee)
    {
        EmployeeEntity entity = new EmployeeEntity()
            .name(employee.getName())
            .email(employee.getEmail())
            .password(employee.getPassword())
            .birthday(employee.getBirthday())
            .img(employee.getImg())
            .number(employee.getNumber())
            .off_days(employee.getOff_days())
            .administration(employee.getAdministration())
            .specialty(employee.getSpecialty());
            if(employee.getAdministration() == true)
                return entity.administration(employee.getAdministration()).specialty("admin");
            else return entity.administration(employee.getAdministration()).specialty(employee.getSpecialty());      
                
    }

    public EmployeeDTO convertToDTO (EmployeeEntity employee)
    {
        EmployeeDTO dto = new EmployeeDTO()
            .name(employee.getName())
            .email(employee.getEmail())
            .password(employee.getPassword())
            .birthday(employee.getBirthday())
            .img(employee.getImg())
            .number(employee.getNumber())
            .off_days(employee.getOff_days())
            .administration(employee.getAdministration())
            .specialty(employee.getSpecialty());
            if(employee.getAdministration() == true)
                return dto.administration(employee.getAdministration()).specialty("admin");
            else return dto.administration(employee.getAdministration()).specialty(employee.getSpecialty());
    }

    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public EmployeeDTO registerEmploye(EmployeeDTO employee) throws EmployeeException
    {
        if (employee.getEmail() != null && employee.getPassword() != null && employee.getName() != null && employee.getNumber() != null )
        {
            if ( employeeRepo.findByEmail(employee.getEmail()).isEmpty() && isValid(employee.getEmail()))
            {
                if (( employee.getAdministration() == true )|| ( employee.getAdministration() == false && employee.getSpecialty() != null ))
                {
                     DateFormat DT  = new SimpleDateFormat("yyyy/MM/dd");
                     DateFormat EED  = new SimpleDateFormat("HH:mm:ss");
                     Date date = new Date();
                     SchedualEntity schedual = new SchedualEntity().day_date(DT.format(date)).enter_time(EED.format(date));
                   // schedual.setEmployee(convertToEntity(employee));
                     schdualRepo.save(schedual);
                     EmployeeEntity entity = convertToEntity(employee).off_days(14).img("https://e7.pngegg.com/pngimages/148/892/png-clipart-computer-icons-user-symbol-light-client-icon-service-computer.png");
                     entity.getScheduals().add(schedual);
                     employeeRepo.save(entity);

                     return employee.id(entity.getId());
                }    
                else{
                    throw new EmployeeException("Sorry , Please Enter Your Specialty ...");
                }  
   
            }
            else {
                throw new EmployeeException("Sorry , This Email Is Already Exist ...");
            }
            
        }
        else {
            throw new EmployeeException("Required Fields Are Null ...");
        }
     }

   
 

    public EmployeeDTO signIn (EmployeeDTO employee)throws EmployeeException
    {
        Optional<EmployeeEntity> entity;
        
        if ((entity = employeeRepo.findByEmail(employee.getEmail())).isEmpty())
        {
            throw new EmployeeException("There Is No Employee With This Email ...");
        }
        else {
            if (entity.get().getPassword().equals(employee.getPassword()))
             {
                DateFormat DT  = new SimpleDateFormat("yyyy/MM/dd");
                DateFormat EED  = new SimpleDateFormat("HH:mm:ss");
                Date date = new Date();
                SchedualEntity schedual = new SchedualEntity().day_date(DT.format(date)).enter_time(EED.format(date));

                schdualRepo.save(schedual);
                Optional<EmployeeEntity> eentity = employeeRepo.findByEmail(employee.getEmail());
                eentity.get().getScheduals().add(schedual);
                employeeRepo.save(eentity.get());
                
                return convertToDTO(entity.get()).id(entity.get().getId());
             }
             else{
                 throw new EmployeeException("There Is No Employee With This PassWord ...");
             }
        }
    }

    public EmployeeDTO update (EmployeeDTO employee) throws EmployeeException
    {
        if (employee.getId()==null)
           throw new EmployeeException("Sorry , There Is No Employee ...");
           
        EmployeeEntity entity = employeeRepo.findById(employee.getId()).orElseThrow(()-> new EmployeeException("There Is No Employee Like This ..."));
        if (employee.getEmail() != null  && isValid(employee.getEmail()) && employeeRepo.findByEmail(employee.getEmail()).isEmpty() )
        entity.setEmail(employee.getEmail());

        if(employee.getPassword() != null)
        entity.setPassword(employee.getPassword());
        
        if(employee.getNumber() != null)
        entity.setNumber(employee.getNumber());

        employeeRepo.save(entity);
        return convertToDTO(entity).id(entity.getId());   

    }


    public Object logoutEmployee (int id) throws EmployeeException, SchedualException
    {
        if (employeeRepo.getById(id)!= null)
        {
            schedualService.Know_ExsitTime(id);
            throw new EmployeeException("Exsit Done ...");
        }
        else {
            throw new EmployeeException("There Is No Employee ...");   
        }
    }

    public void deleteEmployee (EmployeeDTO employee) throws EmployeeException
    {
        EmployeeEntity entity = employeeRepo
        .findById(employee.getId())
        .orElseThrow(
            ()-> new EmployeeException("There Is No Employee With This ..."));
            employeeRepo.delete(entity);

    }

    public EmployeeDTO showEmployee (EmployeeDTO employee) throws EmployeeException
    {
        EmployeeEntity entity = employeeRepo.findById(employee.getId()).orElseThrow(
                ()-> new EmployeeException("The Employee doesn't actally exist with this ID ..."));
        
        return new EmployeeDTO().id(entity.getId())
                                .name(entity.getName())
                                .email(entity.getEmail())
                                .password(entity.getPassword())
                                .birthday(entity.getBirthday())
                                .img(entity.getImg())
                                .number(entity.getNumber())
                                .off_days(entity.getOff_days())
                                .administration(entity.getAdministration())
                                .specialty(entity.getSpecialty())
                                .administration(entity.getAdministration());
    }

    public List<EmployeeDTO> showEmployees () throws EmployeeException
    {
            List<EmployeeEntity> list = employeeRepo.findAll();
            if (list.size() > 0)
            {
                List<EmployeeDTO> list2 = new ArrayList<>();
                for (EmployeeEntity employeeEntity : list) 
                {
                    EmployeeDTO dto = convertToDTO(employeeEntity);
                    list2.add(dto.id(employeeEntity.getId()));

                }
                return list2;
            }
            else{
                throw new EmployeeException("There Is No Employee ...");
            }
        
    }


    public List<EmployeeQueryDTO> querywebEmployee() throws EmployeeQueryException
    {
         List<String> list = employeeRepo.webEmployeeList();
         if(list.size() != 0){
            return list.stream().map((mapper)->{return new EmployeeQueryDTO();}).toList();
         }
         else{
            throw new EmployeeQueryException("Ther Is No Employee In This Specialty ...");
         }
        
    }


    public List<EmployeeQueryDTO> querymobileEmployee(String sp) throws EmployeeQueryException
    {
        List<EmployeeQueryDTO> list = employeeRepo.mobileEmployeeList();
        if(list.size() != 0){
            return list.stream().map((mapper)->{return new EmployeeQueryDTO();}).toList();
        }
        else{
            throw new EmployeeQueryException("Ther Is No Employee In This Specialty ...");
        }
    }

    public List<EmployeeQueryDTO> queryDiskTopEmployee() throws EmployeeQueryException
    {
        List<String> list = employeeRepo.diskTopEmployeeList();
        if(list.size() != 0){
            return list.stream().map((mapper)->{return new EmployeeQueryDTO();}).toList();
        }
        else{
            throw new EmployeeQueryException("Ther Is No Employee In This Specialty ...");
        }
        
    }
    

}