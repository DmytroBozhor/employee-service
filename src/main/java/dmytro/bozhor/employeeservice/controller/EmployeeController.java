package dmytro.bozhor.employeeservice.controller;

import dmytro.bozhor.employeeservice.domain.Employee;
import dmytro.bozhor.employeeservice.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/employees")
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.OK)
    public Employee saveEmployee(@Valid @RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.findById(id);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee updateEmployee(@PathVariable Long id, @Valid @RequestBody Employee employee) {
        return employeeService.updateById(id, employee);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee deleteEmployee(@PathVariable Long id) {
        return employeeService.deleteById(id);
    }

}
