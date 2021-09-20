package org.closure.systemcompany.Services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.closure.systemcompany.DTO.SchedualDTO;
import org.closure.systemcompany.Exceptions.EmployeeException;
import org.closure.systemcompany.Exceptions.SchedualException;
import org.closure.systemcompany.entities.EmployeeEntity;
import org.closure.systemcompany.entities.SchedualEntity;
import org.closure.systemcompany.repositories.EmployeeRepo;
import org.closure.systemcompany.repositories.SchedualRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchedualService {

    @Autowired
    SchedualRepo schedualRepo;

    @Autowired
    EmployeeRepo employeeRepo;

    public SchedualDTO convertToDTO(SchedualEntity schedual)
    {
        SchedualDTO dto = new SchedualDTO()
            .id(schedual.getId())
            .day_date(schedual.getDay_date())
            .enter_time(schedual.getEnter_time())
            .exit_time(schedual.getExit_time());

            return dto ;
    }

    public SchedualDTO Know_ExsitTime (int id) throws SchedualException{

        EmployeeEntity eentity = employeeRepo.getById(id);
        if (eentity != null)
        {
            DateFormat ET  = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            SchedualEntity schedual = eentity.getScheduals().get(eentity.getTasks().size());
            schedual.setExit_time(ET.format(date));
            schedualRepo.save(schedual);
            return convertToDTO(schedual);
        }
        else{
            throw new SchedualException("There Is No Employee ...");
        }
    }

    public List<SchedualDTO> showEmployeeSchedual (int id) throws SchedualException , EmployeeException{
        
        EmployeeEntity eentity = employeeRepo.findById(id).orElseThrow(()-> new EmployeeException("There Is No Employee Like This ..."));
        if (eentity != null)
        {
            List<SchedualEntity> list = eentity.getScheduals();
            if (list.size() > 0)
            {
                List<SchedualDTO> list2 = new ArrayList<>();
                for (SchedualEntity schedualEntity : list) 
                {
                    SchedualDTO dto = convertToDTO(schedualEntity );
                    list2.add(dto.id(schedualEntity.getId()));

                }
                return list2;
            }
            else{
                return new ArrayList<>();
            }
        }
        else{
            throw new SchedualException("There Is No Employee ...");
        }
    }
    
}
