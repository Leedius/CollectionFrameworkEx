package ex10;

import ex5_8.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMember2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //멤버의 등록, 조회 ,삭제 등의 기능을 사용하기 위해서 객체생성
        Member1Manage member = new Member1Manage();

        while (true) {
            System.out.print("회원등록<1>" +
                    " 회원정보조회<2>" +
                    " 모든회원정보조회<3>" +
                    " 회원삭제<4>" +
                    " 회원비밀번호변경<5> => ");
            int option = sc.nextInt();
            switch (option){
                case 1 : member.regMember();
                break;
                case 2 : member.showInfoByName();
                break;
                case 3 : member.allShowMember();
                break;
                case 4 : member.deleteMember();
                break;
                case 5 : member.setMemberPs();
                break;
                case 6:
                    System.out.println("프로그램 종료.");
                    System.exit(0);

            }
        }
    }
}
