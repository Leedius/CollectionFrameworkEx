package ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member1Manage {
    Scanner sc = new Scanner(System.in);
    private List<Member1> memberList;

    public Member1Manage(){
        memberList = new ArrayList<>();
    }


    int index = 0;

    //키보드로 입력받은 정보를 갖는 회원을 리턴
    //regMember를 간결하게 하기 위해 만든 메소드이기때문에
    //밖에서는 호출 못하도록 private를 붙임.
    private Member1 getMember(){
        System.out.print("회원이름 : ");
        String name = sc.next();
        System.out.print("아이디 : ");
        String id = sc.next();
        System.out.print("비밀번호 : ");
        String pw = sc.next();

        Member1 m = new Member1(name, id, pw);
        return m;
    }

    //회원을 등록하는 메소드
    public void regMember() {
        //리스트에 입력받은 이름 아이디 비밀번호로 새로운 객체를 만들어 저장
        Member1 m = getMember();
        memberList.add(m);
        //윗 두줄과 같은 코드 memberList.add(getMember());

    }

    //한명의 회원 정보를 출력하는 메소드
    public void showInfoByName() {
        boolean isFind = false;
        boolean isRun = true;

        while(isRun){
            System.out.print("정보를 조회할 이름 : ");
            String name = sc.next();
            for(Member1 member : memberList){
                if(member.getName().equals(name)){
                    System.out.println(member);
                    isFind = true;
                    isRun = false;
                    break;
                }
            }
            if(!isFind){
                System.out.println("정보가 일치하는 회원이 없습니다.");
            }
        }
    }

    //모든 회원의 정보를 출력하는 메소드
    public void allShowMember() {
        if(memberList.size()==0){
            System.out.println("현재 등록된 학생이 없습니다.");
        }
        else{
            System.out.println("회원 수는 " + memberList.size() + "이며, 정보는 아래와 같습니다.");
            for(Member1 member : memberList){
                System.out.println(member);
            }
        }
    }

    //회원을 삭제하는 메소드
    public void deleteMember() {
        boolean isFind = false;
        boolean isRun = true;
        String name;
        while (isRun) {
            System.out.print("삭제할 회원의 이름 : ");
            name = sc.next();
            for (Member1 member : memberList) {
                if (member.getName().equals(name)) {
                    memberList.remove(member);
                    System.out.println("삭제되었습니다.");
                    isFind = true;
                    isRun = false;
                    break;
                }
            }
            if (!isFind) {
                System.out.println("정보가 일치하는 회원이 없습니다.");
            }
        }
    }

    //회원 비밀번호를 변경하는 메소드
    public void setMemberPs() {
        boolean isFind = false;
        boolean isRun = true;
        String name;
        while(isRun){
            System.out.print("비밀번호를 변경할 이름 : ");
            name = sc.next();
            for(Member1 member : memberList){
                if(member.getName().equals(name)){
                    System.out.print("비밀번호 : ");
                    member.setPw(sc.next());
                    System.out.println("정보가 변경되었습니다.");
                    isRun = false;
                    isFind = true;
                    break;
                }
            }
            if(!isFind){
                System.out.println("정보가 일치하는 회원이 없습니다.");
            }
        }

    }
}
