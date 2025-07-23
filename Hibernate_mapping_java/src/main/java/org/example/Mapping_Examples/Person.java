package org.example.Mapping_Examples;


import jakarta.persistence.*;

@Entity
public class Person
{
    @Id
    private int id;
    private String name;


    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    private Passport passport;


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

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}
