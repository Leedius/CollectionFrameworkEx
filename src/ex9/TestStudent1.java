package ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestStudent1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student1> student1List = new ArrayList<>();

        Student1 stu1 = new Student1("홍", 90, 82);
        Student1 stu2 = new Student1("김", 70, 71);
        Student1 stu3 = new Student1("이", 90, 85);

        student1List.add(stu1);
        student1List.add(stu2);
        student1List.add(stu3);

        //1)리스트에 저장된 모든 정보를 출력해보세요.
        for(Student1 student : student1List){
            System.out.println(student);
        }

        //2)총점이 150점 이상인 학생의 모든 정보를 출력하세요.
        for(int i = 0; i < student1List.size(); i++){
            if(student1List.get(i).getTotalScore()>150){
                System.out.println(student1List.get(i).getStudentName());
            }
        }

        //3)모든 학생에 대한 평균 점수를 출력하세요.
        int sum = 0;
        double avgScore = 0;
        int allTotalScore = 0;
        for(Student1 student : student1List){
            allTotalScore += student.getTotalScore();
        }
        avgScore = (double)allTotalScore/ student1List.size();
        System.out.println("모든 학생의 평균 점수는 : " + avgScore);

        //4)총점이 1등인 학생의 모든 정보를 출력해보세요
        int highTotalScoreIndex = 0;
        for(int i = 1; i < student1List.size(); i++){
            if(student1List.get(highTotalScoreIndex).getTotalScore() < student1List.get(i).getTotalScore()){
                highTotalScoreIndex = i;
            }
        }
        System.out.println(student1List.get(highTotalScoreIndex));

    }
}
