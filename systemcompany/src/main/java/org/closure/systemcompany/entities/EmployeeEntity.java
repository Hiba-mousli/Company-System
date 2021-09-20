package org.closure.systemcompany.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String password;
    private String email;
    private String img;
    private String number;
    private int off_days;
    private boolean administration;
    private Date birthday;
    private String specialty;

   
    @OneToMany
    private List<TaskEntity> tasks;

    @OneToMany
    private List<SchedualEntity> scheduals = new ArrayList<>();



    public EmployeeEntity() {
    }

    public EmployeeEntity(Integer id, String name, String password, String email, String img, String number, int off_days, boolean administration, Date birthday, String specialty, List<TaskEntity> tasks, List<SchedualEntity> scheduals) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.img = img;
        this.number = number;
        this.off_days = off_days;
        this.administration = administration;
        this.birthday = birthday;
        this.specialty = specialty;
        this.tasks = tasks;
        this.scheduals = scheduals;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getOff_days() {
        return this.off_days;
    }

    public void setOff_days(int off_days) {
        this.off_days = off_days;
    }

    public boolean isAdministration() {
        return this.administration;
    }

    public boolean getAdministration() {
        return this.administration;
    }

    public void setAdministration(boolean administration) {
        this.administration = administration;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public List<TaskEntity> getTasks() {
        return this.tasks;
    }

    public void setTasks(List<TaskEntity> tasks) {
        this.tasks = tasks;
    }

    public List<SchedualEntity> getScheduals() {
        return this.scheduals;
    }

    public void setScheduals(List<SchedualEntity> scheduals) {
        this.scheduals = scheduals;
    }

    public EmployeeEntity id(Integer id) {
        setId(id);
        return this;
    }

    public EmployeeEntity name(String name) {
        setName(name);
        return this;
    }

    public EmployeeEntity password(String password) {
        setPassword(password);
        return this;
    }

    public EmployeeEntity email(String email) {
        setEmail(email);
        return this;
    }

    public EmployeeEntity img(String img) {
        setImg(img);
        return this;
    }

    public EmployeeEntity number(String number) {
        setNumber(number);
        return this;
    }

    public EmployeeEntity off_days(int off_days) {
        setOff_days(off_days);
        return this;
    }

    public EmployeeEntity administration(boolean administration) {
        setAdministration(administration);
        return this;
    }

    public EmployeeEntity birthday(Date birthday) {
        setBirthday(birthday);
        return this;
    }

    public EmployeeEntity specialty(String specialty) {
        setSpecialty(specialty);
        return this;
    }

    public EmployeeEntity tasks(List<TaskEntity> tasks) {
        setTasks(tasks);
        return this;
    }

    public EmployeeEntity scheduals(List<SchedualEntity> scheduals) {
        setScheduals(scheduals);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmployeeEntity)) {
            return false;
        }
        EmployeeEntity employeeEntity = (EmployeeEntity) o;
        return Objects.equals(id, employeeEntity.id) && Objects.equals(name, employeeEntity.name) && Objects.equals(password, employeeEntity.password) && Objects.equals(email, employeeEntity.email) && Objects.equals(img, employeeEntity.img) && Objects.equals(number, employeeEntity.number) && off_days == employeeEntity.off_days && administration == employeeEntity.administration && Objects.equals(birthday, employeeEntity.birthday) && Objects.equals(specialty, employeeEntity.specialty) && Objects.equals(tasks, employeeEntity.tasks) && Objects.equals(scheduals, employeeEntity.scheduals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, email, img, number, off_days, administration, birthday, specialty, tasks, scheduals);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", password='" + getPassword() + "'" +
            ", email='" + getEmail() + "'" +
            ", img='" + getImg() + "'" +
            ", number='" + getNumber() + "'" +
            ", off_days='" + getOff_days() + "'" +
            ", administration='" + isAdministration() + "'" +
            ", birthday='" + getBirthday() + "'" +
            ", specialty='" + getSpecialty() + "'" +
            ", tasks='" + getTasks() + "'" +
            ", scheduals='" + getScheduals() + "'" +
            "}";
    }
    
    
}
