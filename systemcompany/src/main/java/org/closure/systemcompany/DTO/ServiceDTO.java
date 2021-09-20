package org.closure.systemcompany.DTO;

import java.util.Objects;

public class ServiceDTO {
    
    private Long id;
    private String service_name;
    private int service_length;

    public ServiceDTO() {
    }

    public ServiceDTO(Long id, String service_name, int service_length) {
        this.id = id;
        this.service_name = service_name;
        this.service_length = service_length;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getService_name() {
        return this.service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public int getService_length() {
        return this.service_length;
    }

    public void setService_length(int service_length) {
        this.service_length = service_length;
    }

    public ServiceDTO id(Long id) {
        setId(id);
        return this;
    }

    public ServiceDTO service_name(String service_name) {
        setService_name(service_name);
        return this;
    }

    public ServiceDTO service_length(int service_length) {
        setService_length(service_length);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ServiceDTO)) {
            return false;
        }
        ServiceDTO serviceDTO = (ServiceDTO) o;
        return Objects.equals(id, serviceDTO.id) && Objects.equals(service_name, serviceDTO.service_name) && service_length == serviceDTO.service_length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, service_name, service_length);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", service_name='" + getService_name() + "'" +
            ", service_length='" + getService_length() + "'" +
            "}";
    }

}
