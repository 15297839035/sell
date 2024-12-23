package com.eduplatform.sellmanager.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String name;
    private String email;
    private String password;
    private String role;
    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<SaleRecord> saleRecords;
    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<RewardRecord> rewardRecords;
    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Feedback> feedbacks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<SaleRecord> getSaleRecords() {
        return saleRecords;
    }

    public void setSaleRecords(List<SaleRecord> saleRecords) {
        this.saleRecords = saleRecords;
    }

    public List<RewardRecord> getRewardRecords() {
        return rewardRecords;
    }

    public void setRewardRecords(List<RewardRecord> rewardRecords) {
        this.rewardRecords = rewardRecords;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }
}
