package id.co.asyst.deep.training.springdatajpa.repository;

import id.co.asyst.deep.training.springdatajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Repository> {
}
