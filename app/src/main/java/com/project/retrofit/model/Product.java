package com.project.retrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Leandro on 02/01/2017.
 */

public class Product {

    private int id;
    private String name;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
