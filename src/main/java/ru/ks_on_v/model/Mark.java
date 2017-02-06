package ru.ks_on_v.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="Marks")
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min=3, max=50)
    @Column(name = "MARK", nullable = false)
    private String mark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
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
        Mark other = (Mark) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return mark;
    }
}
