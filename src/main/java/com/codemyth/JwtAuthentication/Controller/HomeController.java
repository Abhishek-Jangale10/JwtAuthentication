package com.codemyth.JwtAuthentication.Controller;

import com.codemyth.JwtAuthentication.Entity.Employee;
import com.codemyth.JwtAuthentication.Services.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/welcome")
@AllArgsConstructor
@Slf4j
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/ ")
    public List<Employee> geEmployeesList(){
        log.info("Get employee list");
        return employeeService.getEmployeeList();

    }
}
