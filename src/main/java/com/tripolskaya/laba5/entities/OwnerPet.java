package com.tripolskaya.laba5.entities;

import javax.validation.constraints.NotBlank;
import java.util.HashMap;
import java.util.Map;

public class OwnerPet {
    private Map<String, String> pets;
    private Map<String, String> owners;
    @NotBlank(message = "Выберите животное")
    private String pet;
    @NotBlank(message = "Выберите владельца")
    private String owner;

    public OwnerPet()
    {
        pets = new HashMap<>();
        pets.put("Животное №1","Животное №1");
        pets.put("Животное №2","Животное №2");
        pets.put("Животное №3","Животное №3");
        owners = new HashMap<>();
        owners.put("Хозяин №1", "Хозяин №1");
        owners.put("Хозяин №2", "Хозяин №2");
        owners.put("Хозяин №3", "Хозяин №3");
    }
    public Map<String, String> getPets() {
        return pets;
    }

    public void setPets(Map<String, String> pets) {
        this.pets = pets;
    }

    public Map<String, String> getOwners() {
        return owners;
    }

    public void setOwners(Map<String, String> owners) {
        this.owners = owners;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
