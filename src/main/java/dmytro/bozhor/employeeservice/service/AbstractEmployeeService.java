package dmytro.bozhor.employeeservice.service;

import dmytro.bozhor.employeeservice.domain.Employee;

public interface AbstractEmployeeService {

    Employee save(Employee employee);

    Employee findById(Long id);

    Employee updateById(Long id, Employee employee);

    Employee deleteById(Long id);
}
