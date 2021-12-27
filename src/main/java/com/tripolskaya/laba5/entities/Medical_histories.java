package com.tripolskaya.laba5.entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.HashMap;
import java.util.Map;

public class Medical_histories {
    @NotBlank(message = "Выберите животное, для которого будет выписана медицинская история")
    private String pet;
    private Map<String, String> pets;
    @NotEmpty(message = "Выберите симптомы заболевания")
    private String[] symptoms_of_pet;
    private Map<String, String> all_symptoms;
    @NotEmpty(message = "Выберите цель визита в ветклинику")
    private String[] purposeVisit;
    private Map<String, String> all_purpose_visit;
    @NotBlank(message = "Заполните поле диагноза")
    private String Diagnosis;
    private Map<String,String > all_diagnosis;
    @NotEmpty(message = "Выберите лекарства для лечения")
    private String[] medicines;
    private Map<String, String> all_medicines;
    @Min(value=0, message = "Стоимость лечения не может быть отрицательной")
    private Integer cost;
    @NotBlank(message = "Поле не может быть пустым!")
    private String recomendations;

    public Medical_histories()
    {
        pets = new HashMap<>();
        pets.put("Животное №1","Животное №1");
        pets.put("Животное №2","Животное №2");
        pets.put("Животное №3","Животное №3");
        all_symptoms = new HashMap<>();
        all_symptoms.put("Симптом №1","Симптом №1");
        all_symptoms.put("Симптом №2","Симптом №2");
        all_symptoms.put("Симптом №3","Симптом №3");
        all_purpose_visit = new HashMap<>();
        all_purpose_visit.put("Цель №1","Диагностика");
        all_purpose_visit.put("Цель №2","Лечение");
        all_purpose_visit.put("Цель №3","Профилактика");
        all_diagnosis = new HashMap<>();
        all_diagnosis.put("Диагноз №1","Диагноз №1");
        all_diagnosis.put("Диагноз №2","Диагноз №2");
        all_diagnosis.put("Диагноз №3","Диагноз №3");
        all_medicines = new HashMap<>();
        all_medicines.put("Лекарство №1","Лекарство №1");
        all_medicines.put("Лекарство №2","Лекарство №2");
        all_medicines.put("Лекарство №3","Лекарство №3");
        all_medicines.put("Лекарство №4","Лекарство №4");
        all_medicines.put("Лекарство №5","Лекарство №5");
    }
    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public Map<String, String> getPets() {
        return pets;
    }

    public void setPets(Map<String, String> pets) {
        this.pets = pets;
    }

    public String[] getSymptoms_of_pet() {
        return symptoms_of_pet;
    }

    public void setSymptoms_of_pet(String[] symptoms_of_pet) {
        this.symptoms_of_pet = symptoms_of_pet;
    }

    public Map<String, String> getAll_symptoms() {
        return all_symptoms;
    }

    public void setAll_symptoms(Map<String, String> all_symptoms) {
        this.all_symptoms = all_symptoms;
    }

    public String[] getPurposeVisit() {
        return purposeVisit;
    }

    public void setPurposeVisit(String[] purposeVisit) {
        this.purposeVisit = purposeVisit;
    }

    public Map<String, String> getAll_purpose_visit() {
        return all_purpose_visit;
    }

    public void setAll_purpose_visit(Map<String, String> all_purpose_visit) {
        this.all_purpose_visit = all_purpose_visit;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }

    public String[] getMedicines() {
        return medicines;
    }

    public void setMedicines(String[] medicines) {
        this.medicines = medicines;
    }

    public Map<String, String> getAll_medicines() {
        return all_medicines;
    }

    public void setAll_medicines(Map<String, String> all_medicines) {
        this.all_medicines = all_medicines;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getRecomendations() {
        return recomendations;
    }

    public void setRecomendations(String recomendations) {
        this.recomendations = recomendations;
    }

    public Map<String, String> getAll_diagnosis() {
        return all_diagnosis;
    }

    public void setAll_diagnosis(Map<String, String> all_diagnosis) {
        this.all_diagnosis = all_diagnosis;
    }
}
