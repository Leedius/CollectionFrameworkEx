package ex4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //10개의 1~100까지의 랜덤한 수 저장
        for(int i = 0; i<10; i++) {
            list.add((int)(Math.random() * 100 + 1));
        }

        System.out.print("리스트에 저장된 모든 데이터 : ");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();

        //모든 데이터 출력과 동시에 짝수의 개수 카운트
        int index = 0;
        System.out.print("리스트에 저장된 모든 짝수 데이터 : ");
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)%2==0){
                index++;
                System.out.print(list.get(i)+" ");
            }
        }
        System.out.println();

        System.out.println("짝수의 개수는 : " + index);

    }
}
