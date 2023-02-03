package ex10;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Member1Manage implements Member2{
    Scanner sc = new Scanner(System.in);

    @Override
    public Member1 regMember(String name, String id, String pw) {
        System.out.print("회원이름 : ");
        name = sc.next();
        System.out.println("아이디 : ");
        id = sc.next();
        System.out.println("비밀번호 : ");
        pw = sc.next();
        return new Member1(name, id, pw);
    }

    @Override
    public Member1 searchMember(String name) {
        return null;
    }

    @Override
    public Member1 allshowMember() {
        return null;
    }

    @Override
    public Member1 deleteMember(String name) {
        return null;
    }

    @Override
    public Member1 setMemberPs(String name) {
        return null;
    }
}
