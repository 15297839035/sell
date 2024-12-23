package com.eduplatform.sellmanager.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table
public class Config {
    @Id
    private Integer id = 1;
    @OneToMany
    private List<User> administors;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<User> getAdministors() {
        return administors;
    }

    public void setAdministors(List<User> administors) {
        this.administors = administors;
    }
}
