package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "projects_data")
public class Projects {
    @Id
    private int pid;
    private String pname;
    @ManyToMany
    private List<Emploee> emploeeList;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public List<Emploee> getEmploeeList() {
        return emploeeList;
    }

    public void setEmploeeList(List<Emploee> emploeeList) {
        this.emploeeList = emploeeList;
    }
}
