package com.mindex.challenge.data;

import java.util.List;

public class ReportingStructure {
    private Employee employee;
    private int numberOfReports;

    public ReportingStructure(Employee employee) {
        this.employee = employee;
        this.numberOfReports = countDirectReports(employee);
    }

    private int countDirectReports(Employee target) {
        int count = 0;
        List<Employee> directReports = target.getDirectReports();
        if (directReports != null) {
            count += directReports.size();
            for (Employee directReport : directReports) {
                count += countDirectReports(directReport);
            }
        }
        return count;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getNumberOfReports() {
        return numberOfReports;
    }
}
