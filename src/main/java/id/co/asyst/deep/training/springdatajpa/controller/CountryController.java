package id.co.asyst.deep.training.springdatajpa.controller;

import id.co.asyst.deep.training.springdatajpa.entity.Country;
import id.co.asyst.deep.training.springdatajpa.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    private final CountryRepository countryRepository;

    public CountryController(CountryRepository countryRepository) {this.countryRepository = countryRepository;}

    @GetMapping
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
