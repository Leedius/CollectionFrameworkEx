package exList3;

import javax.print.attribute.standard.PrinterURI;

public class Student {
    private String name;
    private int age;
    private String location;
    private int score;

    //기본생성자


    //매개변수값을 가지는 생성자
    public Student(String name, int age, String location, int score) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.score = score;
    }





    //getter setter
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //toString

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", score=" + score +
                '}';
    }
}
