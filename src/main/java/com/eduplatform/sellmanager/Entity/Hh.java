package com.eduplatform.sellmanager.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Hh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
