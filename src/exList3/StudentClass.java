package exList3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentClass {
    Scanner sc = new Scanner(System.in);

    private List<Student> stuList;
    private String className;
    private String homeroomTeacher;

    public StudentClass(){

    }

    public StudentClass(List<Student> stuList , String className, String homeroomTeacher) {
        this.stuList = stuList;
        this.className = className;
        this.homeroomTeacher = homeroomTeacher;
    }




    public Student getStudent(){
        System.out.print("학생이름 : ");
        String name = sc.next();
        System.out.print("학생나이 : ");
        int age = sc.nextInt();
        System.out.print("학생주소 : ");
        String location = sc.next();
        System.out.print("학생점수 : ");
        int score = sc.nextInt();
        Student student = new Student(name, age, location, score);
        stuList.add(student);
        return student;

    }





    public void setClassName(String className) {
        this.className = className;
    }

    public void setHomeroomTeacher(String homeroomTeacher) {
        this.homeroomTeacher = homeroomTeacher;
    }

    public void setStuList(List<Student> stuList){
        this.stuList = stuList;
    }

    public String getClassName() {
        return className;
    }

    public String getHomeroomTeacher() {
        return homeroomTeacher;
    }

    public List<Student> getStuList(){
        return stuList;
    }


}
