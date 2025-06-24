package org.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Emploee {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToOne
    private Product pod;

    public Product getPod() {
        return pod;
    }

    public void setPod(Product pod) {
        this.pod = pod;
    }

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
}
