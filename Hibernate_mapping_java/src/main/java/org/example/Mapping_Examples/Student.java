package org.example.Mapping_Examples;


import jakarta.persistence.*;

import java.util.List;

@Entity(name = "stud34")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String stud_name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "student_course12", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stud_name='" + stud_name + '\'' +
                ", courses=" + courses +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStud_name() {
        return stud_name;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
