//package exList3다른풀이;
//
//import java.util.Scanner;
//
//public class SchoolTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//    //학생의 등록, 조회 ,삭제 등의 기능을 사용하기 위해서 객체생성
//        StudentClass student = new StudentClass();
//
//            while (true) {
//                System.out.print("학생등록<1>" +
//                        " 교실학생정보조회<2>" +
//                        " 담당교사가 맡은 모든반 학생출력<3>" +
//                        " 각 반별로 반별 평균 점수 및 전체 합급에 대한 평균 점수<4>" +
//                        " => ");
//                int option = sc.nextInt();
//                switch (option){
//                    case 1 : student.addStudent();
//                        break;
//                    case 2 : member.showInfoByName();
//                        break;
//                    case 3 : member.allShowMember();
//                        break;
//                    case 4 : member.deleteMember();
//                        break;
//                    case 5 : member.setMemberPs();
//                        break;
//                    case 6:
//                        System.out.println("프로그램 종료.");
//                        System.exit(0);
//
//                }
//            }
//    }
//}

