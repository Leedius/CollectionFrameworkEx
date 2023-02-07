package exList3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
    Scanner sc = new Scanner(System.in);
    private List<StudentClass> classList;

    StudentClass class2 = new StudentClass();

    public School(){

    }

    public School(List<StudentClass> classList) {
        this.classList = classList;
    }

    public List<StudentClass> getClassList() {
        return classList;
    }

    public void setClassList(List<StudentClass> classList) {
        this.classList = classList;
    }

    public void showClassStudentInfo(String className) {
        for (int i = 0; i < classList.getClass().getStuList().; i++) {
            stuList.get(i);
        }
    }

    public double classAvgScore(String className){
        int classScoreSum = 0;
        for(int i = 0; i < stuList.size(); i++) {
            classScoreSum += stuList.get(i).getScore();
        }
        return (double)classScoreSum/stuList.size();
    }
}


