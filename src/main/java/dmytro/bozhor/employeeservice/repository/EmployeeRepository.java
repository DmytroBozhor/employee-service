package dmytro.bozhor.employeeservice.repository;

import dmytro.bozhor.employeeservice.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
