package com.eduplatform.sellmanager.Entity;

import java.util.List;

public class ConfigDTO {
    private Integer id;
    private List<Integer> administor_ids;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getAdministor_ids() {
        return administor_ids;
    }

    public void setAdministor_ids(List<Integer> administor_ids) {
        this.administor_ids = administor_ids;
    }
}
