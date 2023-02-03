package ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            System.out.print("숫자 입력 : ");
            list.add(sc.nextInt());
        }

        int sum = 0;
        for(int i = 0; i<list.size(); i++){
            sum += list.get(i);
        }
        System.out.println("저장된 수의 총합은 : "+sum);
    }
}
