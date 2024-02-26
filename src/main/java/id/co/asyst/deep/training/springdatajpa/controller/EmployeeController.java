package id.co.asyst.deep.training.springdatajpa.controller;

import id.co.asyst.deep.training.springdatajpa.entity.Employee;
import id.co.asyst.deep.training.springdatajpa.repository.EmployeeRepository;
import id.co.asyst.deep.training.springdatajpa.utility.Response;
import id.co.asyst.deep.training.springdatajpa.utility.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {this.employeeRepository = employeeRepository;}

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping
    public Response<Employee> createEmployee(@RequestBody Employee employee) {
        Response<Employee> response = new Response<>();
        try {
            employeeRepository.save(employee);
            response.setStatus(new Status("00", "Berhasil", "Berhasil"));
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        return response;
    }
}
