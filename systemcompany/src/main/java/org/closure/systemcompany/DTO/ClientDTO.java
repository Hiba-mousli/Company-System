package org.closure.systemcompany.DTO;

import java.util.Objects;

public class ClientDTO {
    
    private Long id;

    private String email;
    private String password;
    private long number;
    private CVDTO cv;


    public ClientDTO() {
    }

    public ClientDTO(Long id, String email, String password, long number, CVDTO cv) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.number = number;
        this.cv = cv;
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

    public CVDTO getCv() {
        return this.cv;
    }

    public void setCv(CVDTO cv) {
        this.cv = cv;
    }

    public ClientDTO id(Long id) {
        setId(id);
        return this;
    }

    public ClientDTO email(String email) {
        setEmail(email);
        return this;
    }

    public ClientDTO password(String password) {
        setPassword(password);
        return this;
    }

    public ClientDTO number(long number) {
        setNumber(number);
        return this;
    }

    public ClientDTO cv(CVDTO cv) {
        setCv(cv);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ClientDTO)) {
            return false;
        }
        ClientDTO clientDTO = (ClientDTO) o;
        return Objects.equals(id, clientDTO.id) && Objects.equals(email, clientDTO.email) && Objects.equals(password, clientDTO.password) && number == clientDTO.number && Objects.equals(cv, clientDTO.cv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, number, cv);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", number='" + getNumber() + "'" +
            ", cv='" + getCv() + "'" +
            "}";
    }

}
