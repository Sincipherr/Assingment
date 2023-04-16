package com.geekster.WeeklyTest_16_4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ComponentScan(basePackages = {"AnotherPackage","Mailsending"})
public class CustomDetails {

    @Bean("patient1")
    public Patient getpatienstDetails(){
        System.out.println("Patients details are displayed below");
        return new Patient("mukesh","108");
    }
    @Bean("patient2")
    public Patient getPatientDetails2(){
        System.out.println("2nd patient details");
        return new Patient("Ramesh","109");
    }
}
