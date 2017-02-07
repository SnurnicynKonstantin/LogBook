package ru.ks_on_v.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name="Details")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min=3, max=50)
    @Column(name = "name", nullable = false)
    private String name;

    @Size(min=3, max=30)
    @Column(name = "manufacturer", nullable = false)
    private String manufacturer;

    @Size(min=3, max=50)
    @Column(name = "price", nullable = false)
    private String price;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @Size(min=3, max=100)
    @Column(name = "img_url", nullable = false)
    private String imgUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
        Detail other = (Detail) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return name + " (" + manufacturer + ") " + " : " + price;
    }
}
