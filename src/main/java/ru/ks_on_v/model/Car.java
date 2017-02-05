package ru.ks_on_v.model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="CARS")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min=3, max=50)
    @Column(name = "NICK", nullable = false)
    private String nick;

    @NotNull
    @Digits(integer=8, fraction=2)
    @Column(name = "mark_id", nullable = false)
    private int markId;

    @NotNull
    @Digits(integer=8, fraction=2)
    @Column(name = "model_id", nullable = false)
    private int modelId;

    @Digits(integer=8, fraction=2)
    @Column(name = "year", nullable = false)
    private int year;

    @NotNull
    @Size(min=10, max=50)
    @Column(name = "img_url", nullable = false)
    private String imgUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Employee))
            return false;
        Car other = (Car) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return modelId + " " + markId + " " + nick;
    }
}
