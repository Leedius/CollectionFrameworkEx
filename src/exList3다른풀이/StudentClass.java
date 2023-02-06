package exList3다른풀이;

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


    public StudentClass(String className, String homeroomTeacher) {
        this.stuList = new ArrayList<>();
        this.className = className;
        this.homeroomTeacher = homeroomTeacher;
    }

    private Student getStudent(){
        System.out.println("학생이름 : ");
        String name = sc.next();
        System.out.println("학생나이 : ");
        int age = sc.nextInt();
        System.out.println("학생주소 : ");
        String logation = sc.next();
        System.out.println("학생점수 : ");
        int score = sc.nextInt();
        Student student = new Student(name, age, logation, score);
        return student;

    }

    public void addStudent(){
        Student student = getStudent();
        stuList.add(student);
    }

    public void printStudent(String className){
        for(Student student : stuList){
            System.out.println(student);
        }
    }

    public int getAvg(){
        int sum = 0;
        for(Student student : stuList){
            sum += student.getScore();
        }
        return sum / stuList.size();

    }

    public Student getHighScoreStudent(){
        int maxScore = 0;
        Student highScoreStudent = null;
        for(Student student : stuList){
            if(student.getScore()>maxScore){
                maxScore = student.getScore();
                highScoreStudent = student;
            }
        }
        return highScoreStudent;
    }



    //매개변수로 반 이름을 받아, 해당반의 모든학생의
    //모든 정보를 출력하는 기능
    public void getClassInfo(String className){
        if(this.className.equals(className))
            for(Student student : stuList){
                System.out.println(student);
        }
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
