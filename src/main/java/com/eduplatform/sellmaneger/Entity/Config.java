package com.eduplatform.sellmaneger.Entity;

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
}
