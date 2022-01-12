package com.ani.springdata.jdbc.domain;

// this class represents table in a database.
public class Emp {
    private int id;
    private String name;
    private String dob;
    private Boolean isManager;

    public Emp() {
    }

    public Emp(int id, String name, String dob, Boolean isManager) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.isManager = isManager;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Boolean getManager() {
        return isManager;
    }

    public void setManager(Boolean manager) {
        isManager = manager;
    }
}
