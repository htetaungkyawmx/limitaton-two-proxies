package com.solt.limitatontwoproxies.service.b;

import com.solt.limitatontwoproxies.ds.Employee;
import org.springframework.stereotype.Component;

@Component
public class AlternateEmployeeRepository {

    public Employee findEmployeeById(long id){
        return new Employee();
    }

    public void saveEmployee(Employee employee){

    }

    public void findAndUpdateEmployeeById(long id,Employee employeeToMerge){
        Employee employeeById=findEmployeeById(id);
        saveEmployee(employeeById);
    }

    public /*final*/ void deleteEmployee(Employee employee){

    }
}
