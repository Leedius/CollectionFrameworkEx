package exList3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
    Scanner sc = new Scanner(System.in);
    private List<StudentClass> classList;

    StudentClass class2 = new StudentClass();

    public School(){
        classList = new ArrayList<>();
    }

    public void getClass1(){
        Student student = class2.getStudent();
        System.out.print("학급이름 : ");
        String className = sc.next();
        System.out.print("선생이름 : ");
        String homeroomTeacher = sc.next();
        StudentClass classList = new StudentClass(this.class2.getStuList(), className, homeroomTeacher);

    }



    public void setClassList(List<StudentClass> classList){
        this.classList = classList;
    }

    public List<StudentClass> getClassList(){
        return classList;
    }

}
