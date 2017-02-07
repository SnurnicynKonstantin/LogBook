package ru.ks_on_v.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="Categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min=3, max=30)
    @Column(name = "category", nullable = false)
    private String category;

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
        Category other = (Category) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return id + ". " + category;
    }
}
