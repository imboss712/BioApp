package com.shashi.bioapp.data;

public class Bio {
    private String name;
    private String hobbies;
    private String description;

    public Bio() {
    }

    public Bio(String name, String hobbies, String description) {
        this.name = name;
        this.hobbies = hobbies;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
