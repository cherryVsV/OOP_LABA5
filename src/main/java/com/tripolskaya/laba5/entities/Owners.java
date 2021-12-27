package com.tripolskaya.laba5.entities;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.Map;

public class Owners {
    @NotBlank(message = "Поле не может быть пустым!")
    private String FIO;
    @NotBlank(message = "Поле не может быть пустым!")
    private String address;
    @NotBlank(message = "Выберите пол")
    private String sex;
    private Map<String, String> sexs;
    @Pattern(regexp = "\\+380\\(71\\)-\\d{3}-\\d{2}-\\d{2}", message = "Используйте шаблон: +380(71)-XXX-XX-XX")
    private String numberPhone;
    public Owners()
    {
        sexs = new HashMap<>();
        sexs.put("M", "M");
        sexs.put("Ж","Ж");
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Map<String, String> getSexs() {
        return sexs;
    }

    public void setSexs(Map<String, String> sexs) {
        this.sexs = sexs;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}
