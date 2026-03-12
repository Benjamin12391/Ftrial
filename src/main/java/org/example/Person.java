package org.example;

public class Person {

    private String name;
    private int age;
    private String email;
    private String address;
    private String city;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
       return  "Person{" + "name=" + name + ", age=" + age + ", email=" + email + '}';
    }
}
