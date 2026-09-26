package session6.assignment;
class Employee{
    String empName;
    double salary;
    static String companyName="Bright Horizon Technologies";
    static int employeeCount=0;
    Employee(String empName,double salary){
        this.empName=empName;
        this.salary=salary;
        employeeCount++;
    }
    static void printCompanyInfo(){
        System.out.println(companyName+"\nEmployees on record: "+employeeCount);
    }
}

public class EmployeeCompanyManagement {
    public static void main(String[] args){
        Employee e1=new Employee("Sam",40000);
        Employee e2=new Employee("Alex",35000);
        Employee e3=new Employee("Riya",45000);
        Employee.printCompanyInfo();
    }
}
