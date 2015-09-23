package com.example.will.spelllistdnd;

/**
 * Created by Will on 9/23/2015.
 */
public class Spell {
    String name;
    String description;
    String materials;
    String level;

    //Getters and setters for variables
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaterials() {
        return materials;
    }
    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
