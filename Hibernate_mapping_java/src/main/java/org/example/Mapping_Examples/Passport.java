package org.example.Mapping_Examples;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {

    @Id
    private int id;

    private String Passportnumber;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassportnumber() {
        return Passportnumber;
    }

    public void setPassportnumber(String passportnumber) {
        Passportnumber = passportnumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
