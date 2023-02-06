package exList2;

public class Employee {
    private int employeeNumber;
    private String name;
    private String departmentName;
    private String tellNumber;
    private int salary;

    public Employee(){

    }

    public Employee(int employeeNumber, String name, String departmentName, String tellNumber, int salary) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.departmentName = departmentName;
        this.tellNumber = tellNumber;
        this.salary = salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getTellNumber() {
        return tellNumber;
    }

    public void setTellNumber(String tellNumber) {
        this.tellNumber = tellNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String totalSalary(){
        return "==개발부 월급 현황==" +
                "이름 : " + name +"   월급 : " + salary +"\n";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", name='" + name + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", tellNumber='" + tellNumber + '\'' +
                ", salary=" + salary +
                '}';
    }
}
