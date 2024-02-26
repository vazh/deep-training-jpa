package id.co.asyst.deep.training.springdatajpa.controller;

import id.co.asyst.deep.training.springdatajpa.entity.Province;
import id.co.asyst.deep.training.springdatajpa.repository.ProvinceRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/province")
public class ProvinceController {

    private final ProvinceRepository repository;

    public ProvinceController(ProvinceRepository repository) {this.repository = repository;}

    @GetMapping
    public List<Province> getAllProvinces() {
        return repository.findAll();
    }
}
