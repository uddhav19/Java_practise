package Jdbc_connection;

public class student {
    int id;
    String name;
    String city;
    public student(){
        super();
    }

    public student(int id, String name, String city) {
        super();
        this.id=id;
        this.name=name;
        this.city=city;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
