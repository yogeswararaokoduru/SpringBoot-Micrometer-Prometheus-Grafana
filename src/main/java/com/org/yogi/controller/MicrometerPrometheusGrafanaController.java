package com.org.yogi.controller;

import com.org.yogi.model.Employee;
import com.org.yogi.repository.EmployeeRepo;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MicrometerPrometheusGrafanaController {

    @Autowired
    private MeterRegistry meterRegistry;
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/getAll")
    public List<Employee> getAllemp() {
        Timer timer=Timer.builder("MicrometerPrometheusGrafanaController").description("MicrometerPrometheusGrafanaController method").register(meterRegistry);
        Timer.Sample sample=Timer.start();
        List<Employee> allEmployee = employeeRepo.findAll();
        sample.stop(timer);
        return allEmployee;


    }

    @PostMapping("/addEmp")
    public void getAllemp(@RequestBody Employee employee) {
        employeeRepo.save(employee);

    }

}
