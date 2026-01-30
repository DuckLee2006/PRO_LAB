package Model;

public class SalaryRecord {
    private String employeeID;
    private int month;
    private int year;
    private int workingDay;
    private int OT;
    private int absentDay;
    private double TotalSalary;
    //constructor
    public SalaryRecord(String employeeID, int month, int year, int workingDay, int oT, int absentDay) {
        this.employeeID = employeeID;
        this.month = month;
        this.year = year;
        this.workingDay = workingDay;
        OT = oT;
        this.absentDay = absentDay;
        TotalSalary = calculateMonthSalary(workingDay, oT, absentDay);
    }
    //getter
    public String getEmployeeID() {
        return employeeID;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public int getWorkingDay() {
        return workingDay;
    }
    public int getOT() {
        return OT;
    }
    public int getAbsentDay() {
        return absentDay;
    }
    public double getTotalSalary() {
        return TotalSalary;
    }
    
    public double calculateMonthSalary(double basicSalary, double overTimePay, double AbsenceDedution){
        return basicSalary + (OT*overTimePay) - absentDay*AbsenceDedution;
    }

    

}
