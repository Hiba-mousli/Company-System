package org.closure.systemcompany.models;

import java.io.File;
import java.util.Objects;

public class CVModel {
    
    private Long id;
    private File CV;

    public CVModel() {
    }

    public CVModel(Long id, File CV) {
        this.id = id;
        this.CV = CV;
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

    public CVModel id(Long id) {
        setId(id);
        return this;
    }

    public CVModel CV(File CV) {
        setCV(CV);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CVModel)) {
            return false;
        }
        CVModel cVModel = (CVModel) o;
        return Objects.equals(id, cVModel.id) && Objects.equals(CV, cVModel.CV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, CV);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", CV='" + getCV() + "'" +
            "}";
    }

}
