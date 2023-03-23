package com.car_dealership.model;

public class Employee {
    private String name;
    private float comission;

    public Employee(String name, float comission) {
        this.name = name;
        this.comission = comission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getComission() {
        return comission;
    }

    public void setComission(float comission) {
        this.comission = comission;
    }
}
