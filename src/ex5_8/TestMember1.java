package ex5_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMember1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Member> list = new ArrayList<>();

        Member m1 = new Member("q","1", "홍", 20);
        Member m2 = new Member("w","2", "김", 30);
        Member m3 = new Member("e","3", "정", 40);

        list.add(m1);
        list.add(m2);
        list.add(m3);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //모든 회원들의 나이합을 출력
        int sum=0;
        for(Member member : list){
            sum+=member.getAge();
        }
        System.out.println("모든 회원의 나이의 합은 : " + sum);

        System.out.println();

        String removeMember;
        System.out.print("뺄 회원의 이름을 입력하세요 : ");
        removeMember = sc.next();
        for(int i = 0; i < list.size(); i++) {
            if (removeMember.equals(list.get(i).getName())){
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }
}
