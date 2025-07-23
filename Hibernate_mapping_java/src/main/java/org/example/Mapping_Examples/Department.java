package org.example.Mapping_Examples;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String dep_name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Emploee> emploees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public List<Emploee> getEmploees() {
        return emploees;
    }

    public void setEmploees(List<Emploee> emploees) {
        this.emploees = emploees;
    }
}
