package org.closure.systemcompany.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class TaskEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String description;
    private boolean Done;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;


    public TaskEntity() {
    }

    public TaskEntity(Integer id, String title, String description, boolean Done, EmployeeEntity employee) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.Done = Done;
        this.employee = employee;
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

    public boolean isDone() {
        return this.Done;
    }

    public boolean getDone() {
        return this.Done;
    }

    public void setDone(boolean Done) {
        this.Done = Done;
    }

    public EmployeeEntity getEmployee() {
        return this.employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public TaskEntity id(Integer id) {
        setId(id);
        return this;
    }

    public TaskEntity title(String title) {
        setTitle(title);
        return this;
    }

    public TaskEntity description(String description) {
        setDescription(description);
        return this;
    }

    public TaskEntity Done(boolean Done) {
        setDone(Done);
        return this;
    }

    public TaskEntity employee(EmployeeEntity employee) {
        setEmployee(employee);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TaskEntity)) {
            return false;
        }
        TaskEntity taskEntity = (TaskEntity) o;
        return Objects.equals(id, taskEntity.id) && Objects.equals(title, taskEntity.title) && Objects.equals(description, taskEntity.description) && Done == taskEntity.Done && Objects.equals(employee, taskEntity.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, Done, employee);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", description='" + getDescription() + "'" +
            ", Done='" + isDone() + "'" +
            ", employee='" + getEmployee() + "'" +
            "}";
    }
    
}
