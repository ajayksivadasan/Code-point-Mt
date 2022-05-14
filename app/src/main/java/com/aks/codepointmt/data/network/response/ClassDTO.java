package com.aks.codepointmt.data.network.response;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class ClassDTO {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;

    public static ClassDTO objectFromData(String str) {

        return new Gson().fromJson(str, ClassDTO.class);
    }

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
}