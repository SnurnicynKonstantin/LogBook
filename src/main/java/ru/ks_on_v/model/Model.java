package ru.ks_on_v.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="Models")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min=3, max=50)
    @Column(name = "MODEL", nullable = false)
    private String model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        Model other = (Model) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return model;
    }
}
