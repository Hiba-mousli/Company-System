package org.closure.systemcompany.DTO;

import java.io.File;
import java.util.Objects;

public class CVDTO {
 
    private Long id;
    private File CV;
    private ClientDTO client;

    public CVDTO() {
    }

    public CVDTO(Long id, File CV, ClientDTO client) {
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

    public ClientDTO getClient() {
        return this.client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public CVDTO id(Long id) {
        setId(id);
        return this;
    }

    public CVDTO CV(File CV) {
        setCV(CV);
        return this;
    }

    public CVDTO client(ClientDTO client) {
        setClient(client);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CVDTO)) {
            return false;
        }
        CVDTO cVDTO = (CVDTO) o;
        return Objects.equals(id, cVDTO.id) && Objects.equals(CV, cVDTO.CV) && Objects.equals(client, cVDTO.client);
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
