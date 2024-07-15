package com.codemyth.JwtAuthentication.Services;

import com.codemyth.JwtAuthentication.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private List<Employee> empList = new ArrayList<>();

    public EmployeeService(){
        empList.add(new Employee(UUID.randomUUID().toString(),"Abhishek","Abhishek@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(),"Abhi","abhishek@gmail.com"));
    }

    public List<Employee> getEmployeeList(){
        return empList;
    }

}
