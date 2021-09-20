package org.closure.systemcompany.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "schedual")
public class SchedualEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; 

    private String enter_time;

    private String exit_time;

    private String day_date;


    @OneToOne
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;


    public SchedualEntity() {
    }

    public SchedualEntity(Integer id, String enter_time, String exit_time, String day_date, EmployeeEntity employee) {
        this.id = id;
        this.enter_time = enter_time;
        this.exit_time = exit_time;
        this.day_date = day_date;
        this.employee = employee;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnter_time() {
        return this.enter_time;
    }

    public void setEnter_time(String enter_time) {
        this.enter_time = enter_time;
    }

    public String getExit_time() {
        return this.exit_time;
    }

    public void setExit_time(String exit_time) {
        this.exit_time = exit_time;
    }

    public String getDay_date() {
        return this.day_date;
    }

    public void setDay_date(String day_date) {
        this.day_date = day_date;
    }

    public EmployeeEntity getEmployee() {
        return this.employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public SchedualEntity id(Integer id) {
        setId(id);
        return this;
    }

    public SchedualEntity enter_time(String enter_time) {
        setEnter_time(enter_time);
        return this;
    }

    public SchedualEntity exit_time(String exit_time) {
        setExit_time(exit_time);
        return this;
    }

    public SchedualEntity day_date(String day_date) {
        setDay_date(day_date);
        return this;
    }

    public SchedualEntity employee(EmployeeEntity employee) {
        setEmployee(employee);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SchedualEntity)) {
            return false;
        }
        SchedualEntity schedualEntity = (SchedualEntity) o;
        return Objects.equals(id, schedualEntity.id) && Objects.equals(enter_time, schedualEntity.enter_time) && Objects.equals(exit_time, schedualEntity.exit_time) && Objects.equals(day_date, schedualEntity.day_date) && Objects.equals(employee, schedualEntity.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, enter_time, exit_time, day_date, employee);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", enter_time='" + getEnter_time() + "'" +
            ", exit_time='" + getExit_time() + "'" +
            ", day_date='" + getDay_date() + "'" +
            ", employee='" + getEmployee() + "'" +
            "}";
    }
    

}
