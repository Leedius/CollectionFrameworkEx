package exList3다른풀이;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School  {
    Scanner sc = new Scanner(System.in);

    private List<StudentClass> classList;

    public School(){
        classList = new ArrayList<>();
    }

    private StudentClass getclass(){
        System.out.print("반이름 : ");
        String className = sc.next();
        System.out.print("담임교사 : ");
        String homeroomTeacher = sc.next();

        StudentClass class1 = new StudentClass(className, homeroomTeacher);
        return class1;
    }

    public void addClass(){

    }

    public void setClassList(List<StudentClass> classList){
        this.classList = classList;
    }

    public List<StudentClass> getClassList(){
        return classList;
    }

}
