package com.tripolskaya.laba5.entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.Map;

public class Specialists {
    @NotBlank(message = "Поле не может быть пустым")
    private String FIO;
    @NotBlank(message = "Выберите одно из значений для должности")
    private String post;
    private Map<String, String> posts;
    @Pattern(regexp = "\\+380\\(71\\)-\\d{3}-\\d{2}-\\d{2}", message = "Используйте шаблон: +380(71)-XXX-XX-XX")
    private String numberPhone;
    @NotBlank(message = "Выберите один из предложенных кабинетов для врача")
    private String numberCabinet;
    private Map<String, String> numbersOfCabinets;
    @Min(value = 0, message = "Опыт работы не может быть отрицателен")
    private Integer workExperience;
    private String[] dutyDays;
    public Specialists()
    {
        posts = new HashMap<>();
        posts.put("Главный ветеринар","Главный ветеринар");
        posts.put("Заместитель главного ветеринара","Заместитель главного ветеринара");
        posts.put("Фельдшер","Фельдшер");
        numbersOfCabinets = new HashMap<>();
        numbersOfCabinets.put("1","1");
        numbersOfCabinets.put("2","2");
        numbersOfCabinets.put("3","3");
        numbersOfCabinets.put("4","4");
        numbersOfCabinets.put("5","5");
    }
    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Map<String, String> getPosts() {
        return posts;
    }

    public void setPosts(Map<String, String> posts) {
        this.posts = posts;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getNumberCabinet() {
        return numberCabinet;
    }

    public void setNumberCabinet(String numberCabinet) {
        this.numberCabinet = numberCabinet;
    }

    public Integer getWorkExperience() {
        return this.workExperience;
    }

    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }

    public String[] getDutyDays() {
        return dutyDays;
    }

    public void setDutyDays(String[] dutyDays) {
        this.dutyDays = dutyDays;
    }

    public Map<String, String> getNumbersOfCabinets() {
        return numbersOfCabinets;
    }

    public void setNumbersOfCabinets(Map<String, String> numbersOfCabinets) {
        this.numbersOfCabinets = numbersOfCabinets;
    }
}
