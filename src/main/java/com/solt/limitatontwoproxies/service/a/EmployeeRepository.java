package com.solt.limitatontwoproxies.service.a;

import com.solt.limitatontwoproxies.ds.Employee;

public interface EmployeeRepository {
    Employee findEmployeeById(long id);
    void saveEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    void findAndUpdateEmployeeById(long id,Employee employeeToMerge);
}
