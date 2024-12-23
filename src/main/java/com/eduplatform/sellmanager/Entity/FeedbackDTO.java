package com.eduplatform.sellmanager.Entity;

public class FeedbackDTO {
    private Integer id;
    private Integer satisfication;
    private String suggestion;
    private Integer user_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSatisfication() {
        return satisfication;
    }

    public void setSatisfication(Integer satisfication) {
        this.satisfication = satisfication;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
