package org.closure.systemcompany.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String password;
    private long number;

    @OneToOne
    @JoinColumn(name = "Client_id")
    private CVEntity cv;

    public ClientEntity() {
    }

    public ClientEntity(Long id, String email, String password, long number, CVEntity cv) {
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

    public CVEntity getCv() {
        return this.cv;
    }

    public void setCv(CVEntity cv) {
        this.cv = cv;
    }

    public ClientEntity id(Long id) {
        setId(id);
        return this;
    }

    public ClientEntity email(String email) {
        setEmail(email);
        return this;
    }

    public ClientEntity password(String password) {
        setPassword(password);
        return this;
    }

    public ClientEntity number(long number) {
        setNumber(number);
        return this;
    }

    public ClientEntity cv(CVEntity cv) {
        setCv(cv);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ClientEntity)) {
            return false;
        }
        ClientEntity clientEntity = (ClientEntity) o;
        return Objects.equals(id, clientEntity.id) && Objects.equals(email, clientEntity.email) && Objects.equals(password, clientEntity.password) && number == clientEntity.number && Objects.equals(cv, clientEntity.cv);
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
