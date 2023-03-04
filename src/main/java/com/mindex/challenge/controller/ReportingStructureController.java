package com.mindex.challenge.controller;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportingStructureController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/reporting-structure/{employeeId}")
    public ReportingStructure getReportingStructure(@PathVariable String employeeId) {
        Employee employee = employeeRepository.findByEmployeeId(employeeId);
        return new ReportingStructure(employee);
    }
}
