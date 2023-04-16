package com.geekster.WeeklyTest_16_4.Controller;

import com.geekster.WeeklyTest_16_4.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @Autowired
    @Qualifier("patient2")
    Patient p1;
    @GetMapping(value = "/patient")
    public Patient getpatient(){
        return p1;
    }
}
