package org.closure.systemcompany.models;

import java.util.Objects;

public class TaskModel {
    
    private Integer id;
    private String title;
    private String description;
    private boolean Done;



    public TaskModel() {
    }

    public TaskModel(Integer id, String title, String description, boolean Done) {
        this.id = id;
        this.title = title;
        this.description = description;
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

    public boolean isDone() {
        return this.Done;
    }

    public boolean getDone() {
        return this.Done;
    }

    public void setDone(boolean Done) {
        this.Done = Done;
    }

    public TaskModel id(Integer id) {
        setId(id);
        return this;
    }

    public TaskModel title(String title) {
        setTitle(title);
        return this;
    }

    public TaskModel description(String description) {
        setDescription(description);
        return this;
    }

    public TaskModel Done(boolean Done) {
        setDone(Done);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TaskModel)) {
            return false;
        }
        TaskModel taskModel = (TaskModel) o;
        return Objects.equals(id, taskModel.id) && Objects.equals(title, taskModel.title) && Objects.equals(description, taskModel.description) && Done == taskModel.Done;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, Done);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", description='" + getDescription() + "'" +
            ", Done='" + isDone() + "'" +
            "}";
    }
    
}
