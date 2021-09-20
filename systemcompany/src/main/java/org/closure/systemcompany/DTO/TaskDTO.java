package org.closure.systemcompany.DTO;

import java.util.Objects;

public class TaskDTO {
    
    private Integer id;
    private String title;
    private String description;
    private EmployeeDTO employee;
    private boolean Done;



    public TaskDTO() {
    }

    public TaskDTO(Integer id, String title, String description, EmployeeDTO employee, boolean Done) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.employee = employee;
        this.Done = Done;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EmployeeDTO getEmployee() {
        return this.employee;
    }

    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
    }

    public boolean isDone() {
        return this.Done;
    }

    public boolean getDone() {
        return this.Done;
    }

    public void setDone(boolean Done) {
        this.Done = Done;
    }

    public TaskDTO id(Integer id) {
        setId(id);
        return this;
    }

    public TaskDTO title(String title) {
        setTitle(title);
        return this;
    }

    public TaskDTO description(String description) {
        setDescription(description);
        return this;
    }

    public TaskDTO employee(EmployeeDTO employee) {
        setEmployee(employee);
        return this;
    }

    public TaskDTO Done(boolean Done) {
        setDone(Done);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TaskDTO)) {
            return false;
        }
        TaskDTO taskDTO = (TaskDTO) o;
        return Objects.equals(id, taskDTO.id) && Objects.equals(title, taskDTO.title) && Objects.equals(description, taskDTO.description) && Objects.equals(employee, taskDTO.employee) && Done == taskDTO.Done;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, employee, Done);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", description='" + getDescription() + "'" +
            ", employee='" + getEmployee() + "'" +
            ", Done='" + isDone() + "'" +
            "}";
    }

}
