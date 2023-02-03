package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            list.add(sc.next());
        }

        for(int i = 0; i<list.size(); i++){
            String name;
            System.out.print("찾을 이름을 입력하세요 : ");
            name = sc.next();
            if(list.get(i).equals(name)){
                System.out.println("해당 이름이 존재합니다.");
                break;
            }
            else{
                System.out.println("해당 이름이 존재하지않습니다.");
                break;
            }
        }
    }
}
