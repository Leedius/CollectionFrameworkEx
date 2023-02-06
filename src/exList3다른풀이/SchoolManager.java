package exList3다른풀이;

import java.util.ArrayList;
import java.util.List;

public class SchoolManager {
    public static void main(String[] args) {
        //학교 객체
        School school = new School();


        //학급 객체 생성
        StudentClass c1 = new StudentClass();

        //c1이라는 학급에 저장될 들어갈 학생 객체 3개 생성
        Student s1 = new Student("김길동", 20,"서울시", 90);
        Student s2 = new Student("이길동", 30,"울산시", 80);
        Student s3 = new Student("박길동", 40,"부산시", 88);

        //위 3명의 학생을 저장할 리스트를 생성
        List<Student> stulist1 = new ArrayList<>();
        stulist1.add(s1);
        stulist1.add(s2);
        stulist1.add(s3);

        c1.setStuList(stulist1);

    }
}
