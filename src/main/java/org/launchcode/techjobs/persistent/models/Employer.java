package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Please enter location.")
    @NotBlank(message = "Please enter location.")
    @Size(min = 1, max = 255, message = "Location must be 1 to 255 characters long.")
    private String location;

    public String Employer;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
