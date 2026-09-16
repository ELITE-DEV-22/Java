package lab3.EIS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> emp = new ArrayList<Employee>();

        System.out.println("Number of employees:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee ID:");
            int emp_id = sc.nextInt();

            System.out.println("Enter Employee Name:");
            String emp_name = sc.next();

            System.out.println("Enter Employee Designation:");
            String emp_des = sc.next();

            System.out.println("Enter Employee Salary:");
            int emp_salary = sc.nextInt();

            emp.add(new Employee(emp_id, emp_name, emp_des, emp_salary));
        }

        int choice = 0;

        do {
            System.out.println("Enter your choices:");
            System.out.println("1. Display Employees Details");
            System.out.println("2. Searching employee based on Id");
            System.out.println("3. Salary Increment");
            System.out.println("4. Exit the menu");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    for (Employee e : emp)
                        e.display();
                    break;

                case 2:
                    System.out.println("Enter Employee ID to search:");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Employee e : emp) {
                        if (e.searchEmployee(searchId)) {
                            e.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee not found.");

                    break;

                case 3:
                    for (Employee e : emp) {
                        e.incrementSalary();
                        System.out.println("salary incremented! " + e.getSalary());
                    }
                    break;
                case 4:
                    System.out.println("Byeee!!");
                    break;
            }

        } while (choice != 4);

        sc.close();
    }
}
