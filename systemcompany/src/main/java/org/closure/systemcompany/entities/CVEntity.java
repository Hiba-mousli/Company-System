package org.closure.systemcompany.entities;

import java.io.File;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CV")
public class CVEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private File CV;
    
    @OneToOne
    @JoinColumn(name = "Client_id")
    private ClientEntity client;

    public CVEntity() {
    }

    public CVEntity(Long id, File CV, ClientEntity client) {
        this.id = id;
        this.CV = CV;
        this.client = client;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public File getCV() {
        return this.CV;
    }

    public void setCV(File CV) {
        this.CV = CV;
    }

    public ClientEntity getClient() {
        return this.client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public CVEntity id(Long id) {
        setId(id);
        return this;
    }

    public CVEntity CV(File CV) {
        setCV(CV);
        return this;
    }

    public CVEntity client(ClientEntity client) {
        setClient(client);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CVEntity)) {
            return false;
        }
        CVEntity cVEntity = (CVEntity) o;
        return Objects.equals(id, cVEntity.id) && Objects.equals(CV, cVEntity.CV) && Objects.equals(client, cVEntity.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, CV, client);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", CV='" + getCV() + "'" +
            ", client='" + getClient() + "'" +
            "}";
    }
}
