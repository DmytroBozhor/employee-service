package dmytro.bozhor.employeeservice.service;

import dmytro.bozhor.employeeservice.domain.Employee;
import dmytro.bozhor.employeeservice.repository.EmployeeRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class EmployeeService implements AbstractEmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Employee updateById(Long id, Employee employee) {
        return employeeRepository
                .findById(id)
                .map(persistedEmployee -> updateEmployee(persistedEmployee, employee))
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Employee deleteById(Long id) {
        var employee = employeeRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);
        employeeRepository.delete(employee);
        return employee;
    }

    private Employee updateEmployee(Employee persistedEmployee, Employee employee) {
        persistedEmployee.setPersonalInfo(employee.getPersonalInfo());
        persistedEmployee.setEmail(employee.getEmail());
        persistedEmployee.setSalary(employee.getSalary());
        persistedEmployee.setPhoneNumber(employee.getPhoneNumber());
        return employeeRepository.save(persistedEmployee);
    }
}
