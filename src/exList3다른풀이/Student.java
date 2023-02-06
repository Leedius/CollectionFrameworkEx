package exList3다른풀이;

import java.util.ArrayList;
import java.util.List;

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

    //c1이라는 학급에 들어갈 학생 객체 3개 생성
    Student s1 = new Student("김길동", 20,"서울시", 90);
    Student s2 = new Student("이길동", 30,"울산시", 80);
    Student s3 = new Student("박길동", 40,"부산시", 88);

    List<Student> stulist1 = new ArrayList<>();
        stulist1.add(s1);
        stulist1.add(s2);
        stulist1.add(s3);




}


