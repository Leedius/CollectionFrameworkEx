package exList3다른풀이;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentClass {
    Scanner sc = new Scanner(System.in);

    private List<Student> stuList;
    private String className;
    private String homeroomTeacher;

    public StudentClass() {
    }


    public StudentClass(String className, String homeroomTeacher) {
        this.stuList = new ArrayList<>();
        this.className = className;
        this.homeroomTeacher = homeroomTeacher;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getHomeroomTeacher() {
        return homeroomTeacher;
    }

    public void setHomeroomTeacher(String homeroomTeacher) {
        this.homeroomTeacher = homeroomTeacher;
    }

    //c1학급 객체 생성
    exList3.StudentClass c1 = new exList3.StudentClass();



    public void showClassStudentInfo(String className){
        className = sc.next();
        for(int i = 0; i < get; ){

        }
    }
}
