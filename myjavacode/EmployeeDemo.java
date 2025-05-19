package myjavacode;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpId(1);
        e1.setName("Dhanashri");
        e1.setSalary(60000);

        System.out.println("Salary is : "+e1.getSalary());
    }
}


class Employee{

    private int EmpId;
    private int Salary;
    private String name;

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
