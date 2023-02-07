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



    public Student highScoreStudent(){
        int highScore = 0;
        int studentIndex = 0;
        for(int i = 0; i < stuList.size(); i++){
            if(highScore<stuList.get(i).getScore()){
                highScore = stuList.get(i).getScore();
                studentIndex = i;
            }
        }
        return stuList.get(studentIndex);
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
