package exList2;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmpServiceTest {
    public static void main(String[] args) {
        EmpService emp = new EmpService();

        int num = 9;
        Employee e1 = new Employee(1001, "홍길동", "인사부", "010-0001-1234",1000);
        Employee e2 = new Employee(1002, "김길동", "인사부", "010-0001-5678",1000);
        Employee e3 = new Employee(1003, "최길동", "인사부", "010-0001-2345",1000);
        Employee e4 = new Employee(1004, "홍길동", "개발부", "010-0001-6789",1500);
        Employee e5 = new Employee(1005, "김길동", "개발부", "010-0001-3456",1500);
        Employee e6 = new Employee(1006, "최길동", "개발부", "010-0001-7891",2000);
        Employee e7 = new Employee(1007, "홍길동", "인사부", "010-0001-4567",2000);
        Employee e8 = new Employee(1008, "김길동", "인사부", "010-0001-8912",1500);
        Employee e9 = new Employee(1009, "최길동", "인사부", "010-0001-5678",2500);


        emp.employees.add(e1);
        emp.employees.add(e2);
        emp.employees.add(e3);
        emp.employees.add(e4);
        emp.employees.add(e5);
        emp.employees.add(e6);
        emp.employees.add(e7);
        emp.employees.add(e8);
        emp.employees.add(e9);

        emp.login();

        emp.showDepartmentSalaryInfo();

        emp.departmentSalaryUp();

    }
}
