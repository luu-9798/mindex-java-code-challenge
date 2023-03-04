package com.mindex.challenge.controller;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.data.Compensation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompensationController {
    @Autowired
    private CompensationRepository compensationRepository;

    @PostMapping("/compensation")
    public Compensation createCompensation(@RequestBody Compensation compensation) {
        return compensationRepository.save(compensation);
    }

    @GetMapping("/compensation/{employeeId}")
    public Compensation getCompensation(@PathVariable String employeeId) {
        return compensationRepository.findByEmployeeId(employeeId);
    }
}
