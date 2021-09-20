package org.closure.systemcompany.DTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


public class EmployeeDTO {
    
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
    private List<TaskDTO> tasks = new ArrayList<TaskDTO>();
    private List<SchedualDTO> scheduals = new ArrayList<SchedualDTO>();
    




    public EmployeeDTO() {
    }

    public EmployeeDTO(Integer id, String name, String password, String email, String img, String number, int off_days, boolean administration, Date birthday, String specialty, List<TaskDTO> tasks, List<SchedualDTO> scheduals) {
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

    public List<TaskDTO> getTasks() {
        return this.tasks;
    }

    public void setTasks(List<TaskDTO> tasks) {
        this.tasks = tasks;
    }

    public List<SchedualDTO> getScheduals() {
        return this.scheduals;
    }

    public void setScheduals(List<SchedualDTO> scheduals) {
        this.scheduals = scheduals;
    }

    public EmployeeDTO id(Integer id) {
        setId(id);
        return this;
    }

    public EmployeeDTO name(String name) {
        setName(name);
        return this;
    }

    public EmployeeDTO password(String password) {
        setPassword(password);
        return this;
    }

    public EmployeeDTO email(String email) {
        setEmail(email);
        return this;
    }

    public EmployeeDTO img(String img) {
        setImg(img);
        return this;
    }

    public EmployeeDTO number(String number) {
        setNumber(number);
        return this;
    }

    public EmployeeDTO off_days(int off_days) {
        setOff_days(off_days);
        return this;
    }

    public EmployeeDTO administration(boolean administration) {
        setAdministration(administration);
        return this;
    }

    public EmployeeDTO birthday(Date birthday) {
        setBirthday(birthday);
        return this;
    }

    public EmployeeDTO specialty(String specialty) {
        setSpecialty(specialty);
        return this;
    }

    public EmployeeDTO tasks(List<TaskDTO> tasks) {
        setTasks(tasks);
        return this;
    }

    public EmployeeDTO scheduals(List<SchedualDTO> scheduals) {
        setScheduals(scheduals);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmployeeDTO)) {
            return false;
        }
        EmployeeDTO employeeDTO = (EmployeeDTO) o;
        return Objects.equals(id, employeeDTO.id) && Objects.equals(name, employeeDTO.name) && Objects.equals(password, employeeDTO.password) && Objects.equals(email, employeeDTO.email) && Objects.equals(img, employeeDTO.img) && Objects.equals(number, employeeDTO.number) && off_days == employeeDTO.off_days && administration == employeeDTO.administration && Objects.equals(birthday, employeeDTO.birthday) && Objects.equals(specialty, employeeDTO.specialty) && Objects.equals(tasks, employeeDTO.tasks) && Objects.equals(scheduals, employeeDTO.scheduals);
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
