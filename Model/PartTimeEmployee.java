package Model;

import java.util.Date;

public class PartTimeEmployee extends Employee {
    private final double OT_Salary = 50000.0;

    public PartTimeEmployee(String employeeID, String employeeName, EmployeeStatus status, Department department, Date starDate, String jobTitle, double basicSalary) {
        super(employeeID, employeeName, status, department, starDate, EmployeeType.PART_TIME, jobTitle, basicSalary);
    }

    public double getOT_Salary() {
        return OT_Salary;
    }

}
