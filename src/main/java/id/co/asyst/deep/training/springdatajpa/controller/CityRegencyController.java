package id.co.asyst.deep.training.springdatajpa.controller;

import id.co.asyst.deep.training.springdatajpa.entity.CityRegency;
import id.co.asyst.deep.training.springdatajpa.repository.CityRegencyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city-regency")
public class CityRegencyController {

    private final CityRegencyRepository repository;

    public CityRegencyController(CityRegencyRepository repository) {this.repository = repository;}

    @GetMapping
    public List<CityRegency> getAllCitiesRegencies() {
        return repository.findAll();
    }

    @GetMapping("/{provinceId}")
    public List<CityRegency> getAllCitiesRegenciesByProvince(@PathVariable String provinceId) {
        return repository.findAllByProvinceId(provinceId);
    }
}
