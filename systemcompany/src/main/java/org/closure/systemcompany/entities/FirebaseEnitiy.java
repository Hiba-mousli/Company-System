package org.closure.systemcompany.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="firebase")
public class FirebaseEnitiy {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @ManyToOne(optional=true,targetEntity = EmployeeEntity.class)
    private EmployeeEntity employee;

    @Column(nullable = false)
    private String token;


    public FirebaseEnitiy() {
    }

    public FirebaseEnitiy(Integer id, EmployeeEntity employee, String token) {
        this.id = id;
        this.employee = employee;
        this.token = token;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EmployeeEntity getEmployee() {
        return this.employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public FirebaseEnitiy id(Integer id) {
        setId(id);
        return this;
    }

    public FirebaseEnitiy employee(EmployeeEntity employee) {
        setEmployee(employee);
        return this;
    }

    public FirebaseEnitiy token(String token) {
        setToken(token);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FirebaseEnitiy)) {
            return false;
        }
        FirebaseEnitiy firebaseEnitiy = (FirebaseEnitiy) o;
        return Objects.equals(id, firebaseEnitiy.id) && Objects.equals(employee, firebaseEnitiy.employee) && Objects.equals(token, firebaseEnitiy.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employee, token);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", employee='" + getEmployee() + "'" +
            ", token='" + getToken() + "'" +
            "}";
    }

    
}
