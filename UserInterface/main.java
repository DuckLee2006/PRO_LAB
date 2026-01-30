package UserInterface;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Manager.EmployeeManager;
import Model.Department;
import Model.Employee;
import Model.EmployeeStatus;
import Model.FullTimeEmployee;
import Model.PartTimeEmployee;

public class main {
    public static void main(String[] args) {
        
   
    Employee emp1 = new PartTimeEmployee("1111", "hoàng", EmployeeStatus.ACTIVE,Department.HR, LocalDate.of(2025, 1, 1), "làm hr", 12000000) ;
    Employee emp2 = new PartTimeEmployee("2222", "long", EmployeeStatus.RETIRED,Department.HR, LocalDate.of(2025, 1, 2), "làm hr 2", 12000000) ;
    Employee emp3 = new FullTimeEmployee("333", "hoàng", EmployeeStatus.ACTIVE,Department.HR, LocalDate.of(2025, 1, 1), "làm hr", 12000000) ;
    Map<String, Employee> comp = new HashMap<>();
    EmployeeManager employeeManager = new EmployeeManager(comp);
    employeeManager.addEmployee(emp1);
    employeeManager.addEmployee(emp2);
    employeeManager.addEmployee(emp3);
    System.out.println("add");
    List<Employee> emplist = employeeManager.getAllEmployee();
    for (Employee employee : emplist) {
        System.out.println(employee);
    }
    System.out.println();

    //update
    System.out.println("update");
    Employee emptest = new FullTimeEmployee("333", "hoàng test", EmployeeStatus.ACTIVE,Department.HR, LocalDate.of(2025, 1, 1), "làm hr", 13000000) ;
    boolean update = employeeManager.updateEmployee(emptest);
    for (Employee employee : emplist) {
        System.out.println(employee);
    }


 }
}
