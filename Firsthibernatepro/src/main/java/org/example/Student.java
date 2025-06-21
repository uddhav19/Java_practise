package org.example;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Student_tbl")
public class Student {

    @Id
    private int id;
    @Column(name = "names")
    private String name;
    private String city;
    @Transient
    private String designation;
    @Temporal(TemporalType.DATE)
    private Date date;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
