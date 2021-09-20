package org.closure.systemcompany.models;

import java.util.Date;
import java.util.Objects;

public class EmployeeModel {
    
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




    public EmployeeModel() {
    }

    public EmployeeModel(Integer id, String name, String password, String email, String img, String number, int off_days, boolean administration, Date birthday, String specialty) {
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

    public EmployeeModel id(Integer id) {
        setId(id);
        return this;
    }

    public EmployeeModel name(String name) {
        setName(name);
        return this;
    }

    public EmployeeModel password(String password) {
        setPassword(password);
        return this;
    }

    public EmployeeModel email(String email) {
        setEmail(email);
        return this;
    }

    public EmployeeModel img(String img) {
        setImg(img);
        return this;
    }

    public EmployeeModel number(String number) {
        setNumber(number);
        return this;
    }

    public EmployeeModel off_days(int off_days) {
        setOff_days(off_days);
        return this;
    }

    public EmployeeModel administration(boolean administration) {
        setAdministration(administration);
        return this;
    }

    public EmployeeModel birthday(Date birthday) {
        setBirthday(birthday);
        return this;
    }

    public EmployeeModel specialty(String specialty) {
        setSpecialty(specialty);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmployeeModel)) {
            return false;
        }
        EmployeeModel employeeModel = (EmployeeModel) o;
        return Objects.equals(id, employeeModel.id) && Objects.equals(name, employeeModel.name) && Objects.equals(password, employeeModel.password) && Objects.equals(email, employeeModel.email) && Objects.equals(img, employeeModel.img) && Objects.equals(number, employeeModel.number) && off_days == employeeModel.off_days && administration == employeeModel.administration && Objects.equals(birthday, employeeModel.birthday) && Objects.equals(specialty, employeeModel.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, email, img, number, off_days, administration, birthday, specialty);
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
            "}";
    }
    
}
