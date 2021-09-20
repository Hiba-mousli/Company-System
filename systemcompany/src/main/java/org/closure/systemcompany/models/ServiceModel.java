package org.closure.systemcompany.models;

import java.util.Objects;

public class ServiceModel {
    
    private Long id;
    private String service_name;
    private int service_length;

    public ServiceModel() {
    }

    public ServiceModel(Long id, String service_name, int service_length) {
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

    public ServiceModel id(Long id) {
        setId(id);
        return this;
    }

    public ServiceModel service_name(String service_name) {
        setService_name(service_name);
        return this;
    }

    public ServiceModel service_length(int service_length) {
        setService_length(service_length);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ServiceModel)) {
            return false;
        }
        ServiceModel serviceModel = (ServiceModel) o;
        return Objects.equals(id, serviceModel.id) && Objects.equals(service_name, serviceModel.service_name) && service_length == serviceModel.service_length;
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
