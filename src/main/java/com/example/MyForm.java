package com.example;

import javax.validation.constraints.Pattern;

public class MyForm {
    @Pattern(regexp = "^[a-zA-Z]*$", message = "Name must not contain numbers")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
