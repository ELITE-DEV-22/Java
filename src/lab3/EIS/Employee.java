package lab3.EIS;

public class Employee {
    private int emp_id;
    private String emp_name;
    private String emp_des;
    private int emp_salary;

    public Employee(int emp_id, String emp_name, String emp_des, int emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_des = emp_des;
        this.emp_salary = emp_salary;
    }

    public boolean searchEmployee(int id) {
        if (this.emp_id == id)
            return true;
        return false;
    }

    public void incrementSalary() {
        emp_salary = (int) (emp_salary * 1.1);
    }

    public int getSalary() {
        return emp_salary;
    }

    public void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Name: " + emp_name);
        System.out.println("Designation: " + emp_des);
        System.out.println("Salary: " + emp_salary);
    }
}
