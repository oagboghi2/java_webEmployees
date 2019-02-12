package com.lambdaschool.webemployees;

//localhost:8080/data/allemployees

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/data")
public class EmployeeController
{

    @RequestMapping("/allemployees")
    public ArrayList<Employee> getAllEmployees()
    {
        WebemployeesApplication.ourEmpList.empList.sort((e1,e2) ->
                e1.getName().compareToIgnoreCase(e2.getName()));
        return WebemployeesApplication.ourEmpList.empList;
    }
}
