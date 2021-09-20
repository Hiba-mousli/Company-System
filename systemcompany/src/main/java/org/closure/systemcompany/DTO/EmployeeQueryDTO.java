package org.closure.systemcompany.DTO;

import java.util.Objects;

public class EmployeeQueryDTO {

    private Integer id;
    private String name;
    private String email;
    private String specialty;

    public EmployeeQueryDTO() {
    }

    public EmployeeQueryDTO(Integer id, String name, String email, String specialty) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public EmployeeQueryDTO id(Integer id) {
        setId(id);
        return this;
    }

    public EmployeeQueryDTO name(String name) {
        setName(name);
        return this;
    }

    public EmployeeQueryDTO email(String email) {
        setEmail(email);
        return this;
    }

    public EmployeeQueryDTO specialty(String specialty) {
        setSpecialty(specialty);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmployeeQueryDTO)) {
            return false;
        }
        EmployeeQueryDTO employeeQueryDTO = (EmployeeQueryDTO) o;
        return Objects.equals(id, employeeQueryDTO.id) && Objects.equals(name, employeeQueryDTO.name) && Objects.equals(email, employeeQueryDTO.email) && Objects.equals(specialty, employeeQueryDTO.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, specialty);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", specialty='" + getSpecialty() + "'" +
            "}";
    }

    
}
