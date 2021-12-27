package com.tripolskaya.laba5.entities;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.*;

public class Reception {
    @NotBlank(message = "Выберите врача, к которому хотите попасть на приём")
    private String doctor;
    @NotBlank(message = "Выберите животного")
    private String pet;
    private Map<String, String> doctors;
    private Map<String, String> pets;
    @NotNull(message = "Выберите дату приёма")
    private String dateOfReception;
    private Map<Integer,Date> datesOfReception;
    public Reception()
    {
        pets = new HashMap<>();
        pets.put("Животное №1","Животное №1");
        pets.put("Животное №2","Животное №2");
        pets.put("Животное №3","Животное №3");
        doctors = new HashMap<>();
        doctors.put("Доктор №1", "Доктор №1");
        doctors.put("Доктор №2", "Доктор №2");
        doctors.put("Доктор №3", "Доктор №3");
        datesOfReception = new HashMap<>();
        datesOfReception.put(1, new Date(2021, Calendar.DECEMBER,20,12,0,0));
        datesOfReception.put(2, new Date(2021, Calendar.DECEMBER,22,14,0,0));
        datesOfReception.put(3, new Date(2021, Calendar.DECEMBER,23,8,0,0));
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public Map<String, String> getDoctors() {
        return doctors;
    }

    public void setDoctors(Map<String, String> doctors) {
        this.doctors = doctors;
    }

    public Map<String, String> getPets() {
        return pets;
    }

    public void setPets(Map<String, String> pets) {
        this.pets = pets;
    }

    public String getDateOfReception() {
        return dateOfReception;
    }

    public void setDateOfReception(String dateOfReception) {
        this.dateOfReception = dateOfReception;
    }

    public Map<Integer, Date> getDatesOfReception() {
        return datesOfReception;
    }

    public void setDatesOfReception(Map<Integer, Date> datesOfReception) {
        this.datesOfReception = datesOfReception;
    }
}
