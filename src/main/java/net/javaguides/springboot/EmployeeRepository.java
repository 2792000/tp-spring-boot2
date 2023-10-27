package net.javaguides.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.springboot.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
