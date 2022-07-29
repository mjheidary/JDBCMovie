package com.mapsahr;

public class Director {
    private int id;
    private String name;


    public Director(String name) {
        this.name = name;

    }

    public Director() {
    }


    // getters and setters


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


    @Override
    public String toString() {
        return "Director [id=" + id + ", name=" + name + "]";
    }
}

