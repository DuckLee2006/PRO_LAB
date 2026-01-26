package Model;

import java.util.Date;

public class Employee {
    protected final String employeeID;;
    protected String EmployeeName;
    protected EmployeeStatus status;
    protected Department department;
    protected Date starDate;
    protected EmployeeType type;
    protected String jobTitle;
    protected double basicSalary;
    //constructor
    public Employee(String employeeID, String employeeName, EmployeeStatus status, Department department, Date starDate, EmployeeType type, String jobTitle, double basicSalary) {
        this.employeeID = employeeID;
        EmployeeName = employeeName;
        this.status = status;
        this.department = department;
        this.starDate = starDate;
        this.type = type;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
    }
    //getter and setters
    public String getEmployeeID() {
        return employeeID;
    }
    public String getEmployeeName() {
        return EmployeeName;
    }
    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }
    public EmployeeStatus getStatus() {
        return status;
    }
    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public Date getStarDate() {
        return starDate;
    }
    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }
    public EmployeeType getType() {
        return type;
    }
    public void setType(EmployeeType type) {
        this.type = type;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    

}
