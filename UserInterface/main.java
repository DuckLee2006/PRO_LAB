package UserInterface;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import Model.Department;
import Model.Employee;
import Model.EmployeeStatus;
import Model.EmployeeType;
import Model.PartTimeEmployee;
import java.util.Date;


public class main {
    public static void main(String[] args) {
       Date date = null;
    try {
        date = new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2012");
    } catch (ParseException e) {
        e.printStackTrace();
    }
        Employee emp = new PartTimeEmployee("01", "nam", EmployeeStatus.ACTIVE, Department.IT, date, "Developer", 3000000.0);
    
        System.out.println("Employee ID: " + emp.getEmployeeID());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Status: " + emp.getStatus());
        System.out.println("Employee Department: " + emp.getDepartment());
        System.out.println("Employee Start Date: " + emp.getStarDate());
        System.out.println("Employee Type: " + emp.getType());
        System.out.println("Employee Job Title: " + emp.getJobTitle());
        System.out.println("Employee Basic Salary: " + emp.getBasicSalary());
        System.out.println("Employee OT Salary: " + ((PartTimeEmployee) emp).getOT_Salary());
        System.out.println("Department Code: " + emp.getDepartment().getCode());
    
    }
}
