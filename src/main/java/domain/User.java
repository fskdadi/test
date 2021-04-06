package domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private int id;
    private String name;
    private int age;
    private Date birthday;

    static {
       // System.out.println("static init user");
    }

    public User() {
        //System.out.println("User construct");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private void init() {
        System.out.println("init");
    }

    private void destory() {
        System.out.println("destory");
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
