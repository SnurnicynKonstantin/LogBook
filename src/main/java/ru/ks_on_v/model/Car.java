package ru.ks_on_v.model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="CARS")
public class Car {
    @Id
    @Column(name="id")
    private int id;

    @Size(min=3, max=50)
    @Column(name = "NICK", nullable = false)
    private String nick;

    @ManyToOne
    @JoinColumn(name="mark_id")
    private Mark mark;

    @ManyToOne
    @JoinColumn(name="model_id")
    private Model model;

    @Digits(integer=8, fraction=2)
    @Column(name = "year", nullable = false)
    private int year;

    @NotNull
    @Size(min=10, max=50)
    @Column(name = "img_url", nullable = false)
    private String imgUrl;

    @NotNull
    @Size(min=10, max=1000)
    @Column(name = "about", nullable = false)
    private String about;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "detail_car",
            joinColumns = @JoinColumn(name = "car_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name = "detail_id", referencedColumnName="id"))
    private List<Detail> details;

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

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public Model getModel() {
        return model;
    }

    public void setModelId(Model model) {
        this.model = model;
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

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Detail> getDetails() {
        return details;
    };

    public void setDetails(List<Detail> details) {
        this.details = details;
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
        Car other = (Car) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return mark.getMark() + " " + model.getModel() + " " + nick;
    }
}
