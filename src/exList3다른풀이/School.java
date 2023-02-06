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



    public void addClass(){

    }

    public void setClassList(List<StudentClass> classList){
        this.classList = classList;
    }

    public List<StudentClass> getClassList(){
        return classList;
    }

}
