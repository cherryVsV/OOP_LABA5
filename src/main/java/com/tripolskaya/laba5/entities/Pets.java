package com.tripolskaya.laba5.entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pets {
    @NotBlank(message = "Поле не должно быть пустым!")
    private String nickname; // никнейм
    private Map<String, String> type_pets; // тип
    private  Map<String, String> breeds; // порода животного
    private Map<String, String> sexs; // порода
    @NotBlank(message = "Необходимо выбрать один из предложенных вариантов")
    private String type_pet;
    @NotBlank(message = "Необходимо выбрать один из предложенных вариантов")
    private String breed;
    @NotBlank(message = "Необходимо выбрать один из предложенных вариантов")
    private String sex;
    @Min(value= 0, message="Вес питомца не может быть отрицателен!")
    private Double weight; // вес
    @Min(value=0, message="Возраст питомца не может быть отрицателен!")
    private Double age;
    public Pets(){
        breeds = new HashMap<>();
        breeds.put("Американская короткошерстная","Американская короткошерстная");
        breeds.put("Вислоухая британка","Вислоухая британка");
        breeds.put("Пудель","Пудель");
        type_pets = new HashMap<>();
        type_pets.put("Собака", "Собака");
        type_pets.put("Кошка", "Кошка");
        sexs = new HashMap<>();
        sexs.put("M", "M");
        sexs.put("Ж","Ж");
    }
    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }
    public String getNickname()
    {
        return this.nickname;
    }
    public void setBreeds(Map<String,String> breeds)
    {
        this.breeds = breeds;
    }
    public Map<String,String> getBreeds()
    {
        return this.breeds;
    }

    public Map<String, String> getSexs() {
        return sexs;
    }

    public void setSexs(Map<String,String> sexs) {
        this.sexs = sexs;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Map<String, String> getType_pets() {
        return type_pets;
    }

    public void setType_pets(Map<String,String> type_pets) {
        this.type_pets = type_pets;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getType_pet() {
        return type_pet;
    }

    public void setType_pet(String type_pet) {
        this.type_pet = type_pet;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
