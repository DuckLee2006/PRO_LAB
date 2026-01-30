package Manager;

import java.util.List;
import java.util.Map;

import Model.Employee;
import Model.EmployeeStatus;
import Model.SalaryRecord;

public class SalaryManager {
    private Map<String, List<SalaryRecord>> salaryManager;
    //đọc ghi
    //----
    //
    //constructor
    public SalaryManager(Map<String, List<SalaryRecord>> salaryManager) {
        this.salaryManager = salaryManager;
    }
    //tính lương
    public SalaryRecord calculateMonthSalary(Employee emp, int month, int year){
        if (emp.getStatus()!=EmployeeStatus.ACTIVE) {
            System.out.println("Employee is not active!");
            return null;
        }

        List<SalaryRecord> listSalaryrecord = salaryManager.get(emp.getEmployeeID());
        if (listSalaryrecord==null) {
            System.out.println("Employees without payroll records!");
            return null;
        }
        for (SalaryRecord salaryRecord : listSalaryrecord) {
            if (salaryRecord.getMonth()==month && salaryRecord.getYear()==year) {
                return salaryRecord;
            }
        }
        return null;

    }

    //lương cao nhất.
    public SalaryRecord getHighestEmployee (int month, int year){
        SalaryRecord highest = null;
        for (List<SalaryRecord> list : salaryManager.values()) {
            for (SalaryRecord salaryRecord : list) {
                if(salaryRecord.getMonth()==month && salaryRecord.getYear()==year){
                    if (highest==null||salaryRecord.getTotalSalary()>highest.getTotalSalary()) {
                        highest=salaryRecord;
                    }
                    break;
                }
            }
        }
        return highest;
    }
    //lấy bảng lương;
    public SalaryRecord getSalaryByMonth(String id, int month, int year){
        List<SalaryRecord> list = salaryManager.get(id);
        if (list == null) {
            System.out.println("ID does not exist.");
            return null;
        }

        for (SalaryRecord salaryRecord : list) {
            if (salaryRecord.getMonth()==month&&salaryRecord.getYear()==year) {
                return salaryRecord;
            }
        }
        return null;

   
    
    }
}
