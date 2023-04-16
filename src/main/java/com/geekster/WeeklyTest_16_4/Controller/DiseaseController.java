package com.geekster.WeeklyTest_16_4.Controller;

import AnotherPackage.Disease;
import com.geekster.WeeklyTest_16_4.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiseaseController {
    @Autowired
    Disease d1;
    @GetMapping(value = "/disease")
    public String PatientDis(){

        return d1.disease1();
    }
}
