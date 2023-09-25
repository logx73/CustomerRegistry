package com.registry.application.Entity;

import com.registry.application.Annotations.DateValidation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Entity
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern(regexp = "M|F", message = "Must be M or F")
    private String sex;

    @DateValidation
    private LocalDate date_of_birth;

    private String native_place;

    public Detail() {
    }

    public Detail(Long id, String sex, LocalDate date_of_birth, String native_place) {
        this.id = id;
        this.sex = sex;
        this.date_of_birth = date_of_birth;
        this.native_place = native_place;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getNative_place() {
        return native_place;
    }

    public void setNative_place(String native_place) {
        this.native_place = native_place;
    }
}
