package com.solt.limitatontwoproxies.service.a;

import com.solt.limitatontwoproxies.ds.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepositoryImpl implements EmployeeRepository{
    @Override
    public Employee findEmployeeById(long id) {
        return new Employee();
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Employee employee) {

    }

    @Override
    public void findAndUpdateEmployeeById(long id, Employee employeeToMerge) {
        Employee employeeById=findEmployeeById(id);
        saveEmployee(employeeById);
    }

    public void deleteByEmail(String email){
        System.out.println(email + " ===========================");
    }
}
