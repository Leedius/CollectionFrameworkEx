package exList2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class EmpService {
    Scanner sc = new Scanner(System.in);
    List<Employee> employees = new ArrayList<>();

    //로그인 기능
    public void login(){
        boolean findId = true;
        boolean collcetId = true;
        boolean collectPw = true;
        int index = 0 ;

        while(true){
            System.out.print("사번 : ");
            int number = sc.nextInt();
            System.out.print("비밀번호(연락처의 마지막 4자리 : ");
            String pw = sc.next();

            for(int i = 0; i < employees.size(); i++ ){
                if(employees.get(i).getEmployeeNumber()==number){
                    collcetId = true;
                    break;
                }
                else {
                    collcetId = false;
                }
            }
            for(int i = 0; i < employees.size(); i++){
                if(employees.get(i).getTellNumber().split("-")[2].equals(pw)){
                    collectPw = true;
                    break;
                }
                else {
                    collectPw = false;
                    index++;
                }
            }
            if((collcetId && collectPw)){
                break;
            }
        }
        System.out.println("로그인 하였습니다.\n"+"'"+employees.get(index).getName()+"'"+"님 반갑습니다.");
        System.out.println("==============================");
    }

    public void showDepartmentSalaryInfo(){
        int index = 1;
        int totalSalary = 0;
        double avgSalary = 0;
        String department;
        System.out.print("부서명 : ");
        department = sc.next();
        System.out.println("==개발부 월급 현황==");
        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).getDepartmentName().equals(department)){
                System.out.println("이름 : " + employees.get(i).getName() + "  월급 : " + employees.get(i).getSalary());
                totalSalary += employees.get(i).getSalary();
                index++;
            }
        }
        avgSalary = (double) totalSalary / index;
        System.out.println(department+"서의 월급 총액은 " + totalSalary+
                "원이며, 평균 급여는 " + avgSalary + "원입니다.");
        System.out.println("==============================");
    }

    //월급인상
    public void departmentSalaryUp(){
        System.out.print("부서명 : ");
        String department = sc.next();
        System.out.print("인상급여 : ");
        int salaryUp = sc.nextInt();
        System.out.println(department + " 각 사원의 급여각 각각 " + salaryUp+"원씩 인상됩니다." );
        System.out.println("==월급 인상 후 개발부 월급 현황==");
        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).getDepartmentName().equals(department)){
                employees.get(i).setSalary(employees.get(i).getSalary()+salaryUp);
                System.out.println("이름 : " + employees.get(i).getName() + "  월급 : " + employees.get(i).getSalary());
            }

        }
        System.out.println("==============================");
    }

}


