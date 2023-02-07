package exList3;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class SchoolManager {
    public static void main(String[] args) {
        //학교 객체
        School school = new School();


        //c1학급 객체 생성
        StudentClass c1 = new StudentClass();

        //c1이라는 학급에 들어갈 학생 객체 3개 생성
        Student s1 = new Student("김길동", 20,"서울시", 90);
        Student s2 = new Student("이길동", 30,"울산시", 80);
        Student s3 = new Student("박길동", 40,"부산시", 88);

        //위 3명의 학생을 저장할 리스트를 생성
        List<Student> stulist1 = new ArrayList<>();
        stulist1.add(s1);
        stulist1.add(s2);
        stulist1.add(s3);

        //c1이라는 학급에 학생목록정보를 저장
        c1.setStuList(stulist1);
        c1.setClassName("캐드반");
        c1.setHomeroomTeacher("김선생");

        //c2라는 이름의 학급을 생성
        StudentClass c2 = new StudentClass();

        //c2이라는 학급에 들어갈 학생 객체 3개 생성
        Student s4 = new Student("김자바", 30,"대구시", 77);
        Student s5 = new Student("윤자바", 25,"경산시", 82);
        Student s6 = new Student("박자바", 35,"대전시", 91);

        //위 3명의 학생을 저장할 리스트를 생성
        List<Student> stulist2 = new ArrayList<>();
        stulist2.add(s4);
        stulist2.add(s5);
        stulist2.add(s6);

        //c2이라는 학급에 학생목록정보 저장
        c2.setStuList(stulist2);
        c2.setClassName("자바반");
        c2.setHomeroomTeacher("김선생");


        StudentClass c3 = new StudentClass();

        Student s7 = new Student("김회계",40,"평택시", 88);
        Student s8 = new Student("정회계", 35, "구리시", 92);
        Student s9 = new Student("박회계", 18, "고양시", 90);

        List<Student> stulist3 = new ArrayList<>();
        stulist3.add(s7);
        stulist3.add(s8);
        stulist3.add(s9);

        c3.setStuList(stulist3);
        c3.setClassName("회계반");
        c3.setHomeroomTeacher("이회계");

        //여러 학급 정보를 저장할 수 있는 리스트 생성
        List<StudentClass> classList = new ArrayList<>();
        classList.add(c1);
        classList.add(c2);
        classList.add(c3);

        school.setClassList(classList);


        //school이라는 학교의 모든 학급명을 출력
        for(int i = 0; i < school.getClassList().size(); i++){
            System.out.println(school.getClassList().get(i).getClassName());
        }


    }
}
