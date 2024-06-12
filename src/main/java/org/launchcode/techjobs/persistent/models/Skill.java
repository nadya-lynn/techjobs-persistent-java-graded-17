package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull(message = "Please enter description.")
    @NotBlank(message = "Please enter description.")
    @Size(min = 1, max = 255, message = "Description must be 1 to 255 characters long.")
    private String description;

    public Skill() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
