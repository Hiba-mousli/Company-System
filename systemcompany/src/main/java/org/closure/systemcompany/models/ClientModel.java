package org.closure.systemcompany.models;

import java.util.Objects;

public class ClientModel {
    
    private Long id;
    private String email;
    private String password;
    private long number;
    

    public ClientModel() {
    }

    public ClientModel(Long id, String email, String password, long number) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.number = number;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getNumber() {
        return this.number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public ClientModel id(Long id) {
        setId(id);
        return this;
    }

    public ClientModel email(String email) {
        setEmail(email);
        return this;
    }

    public ClientModel password(String password) {
        setPassword(password);
        return this;
    }

    public ClientModel number(long number) {
        setNumber(number);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ClientModel)) {
            return false;
        }
        ClientModel clientModel = (ClientModel) o;
        return Objects.equals(id, clientModel.id) && Objects.equals(email, clientModel.email) && Objects.equals(password, clientModel.password) && number == clientModel.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, number);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", number='" + getNumber() + "'" +
            "}";
    }

}
