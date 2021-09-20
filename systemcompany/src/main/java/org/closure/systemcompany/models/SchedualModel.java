package org.closure.systemcompany.models;

import java.util.Date;
import java.util.Objects;

public class SchedualModel {
    
    private Integer id;
    private String enter_time;
    private String exit_time;
    private String day_date;


    public SchedualModel() {
    }

    public SchedualModel(Integer id, String enter_time, String exit_time, String day_date) {
        this.id = id;
        this.enter_time = enter_time;
        this.exit_time = exit_time;
        this.day_date = day_date;
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

    public SchedualModel id(Integer id) {
        setId(id);
        return this;
    }

    public SchedualModel enter_time(String enter_time) {
        setEnter_time(enter_time);
        return this;
    }

    public SchedualModel exit_time(String exit_time) {
        setExit_time(exit_time);
        return this;
    }

    public SchedualModel day_date(String day_date) {
        setDay_date(day_date);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SchedualModel)) {
            return false;
        }
        SchedualModel schedualModel = (SchedualModel) o;
        return Objects.equals(id, schedualModel.id) && Objects.equals(enter_time, schedualModel.enter_time) && Objects.equals(exit_time, schedualModel.exit_time) && Objects.equals(day_date, schedualModel.day_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, enter_time, exit_time, day_date);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", enter_time='" + getEnter_time() + "'" +
            ", exit_time='" + getExit_time() + "'" +
            ", day_date='" + getDay_date() + "'" +
            "}";
    }
    
}
