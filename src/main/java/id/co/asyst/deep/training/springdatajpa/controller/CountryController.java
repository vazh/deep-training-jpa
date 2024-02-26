package id.co.asyst.deep.training.springdatajpa.controller;

import id.co.asyst.deep.training.springdatajpa.entity.Country;
import id.co.asyst.deep.training.springdatajpa.repository.CountryRepository;
import id.co.asyst.deep.training.springdatajpa.service.mapper.CountryMapper;
import id.co.asyst.deep.training.springdatajpa.utility.Response;
import id.co.asyst.deep.training.springdatajpa.utility.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
@Slf4j
public class CountryController {

    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    public CountryController(CountryRepository countryRepository, CountryMapper countryMapper) {this.countryRepository = countryRepository;
        this.countryMapper = countryMapper;
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @GetMapping("/{id}")
    public Response<Country> getCountry(@PathVariable String id) {
        Response<Country> response = new Response<>();
        if (countryRepository.findById(id).isPresent()) {
            response.setResult(countryRepository.findById(id).get());
            response.setStatus(new Status("00", "Sukses", "Sukses"));
        } else {
            response.setStatus(new Status("99", "Error", "Country Id Does Not Exist"));
        }

        return response;
    }

    @PostMapping
    public Response<Country> createCountry(@RequestBody Country country) {
        Response<Country> response = new Response<>();
        if (countryRepository.existsById(country.getId())) {
            response.setStatus(new Status("99", "ERROR", "Country Id already Exist"));
            return response;
        }
        try {
            Country countrySave = countryRepository.save(country);
            response.setStatus(new Status("00", "Success", "Success"));
            response.setResult(countrySave);
        } catch (Exception e) {
            log.error(e.getMessage());
            response.setStatus(new Status("99", "Error", e.getMessage()));
        }

        return response;
    }

    @PutMapping
    public Response<Country> editCountry(@RequestBody Country country) {
        Response<Country> response = new Response<>();
        try {
            if (!countryRepository.existsById(country.getId())) {
                response.setStatus(new Status("99", "ERROR", "Country Id Does Not Exist"));
                return response;
            }
            Country countryExist = countryRepository.findById(country.getId()).get();

            countryExist = countryMapper.entityToEntity(country);

            countryRepository.save(countryExist);

            response.setStatus(new Status("00", "Success", "Success"));
            response.setResult(countryExist);
        } catch (Exception e) {
            log.error(e.getMessage());
            response.setStatus(new Status("99", "Error", e.getMessage()));
        }

        return response;
    }

    @DeleteMapping("/{id}")
    public Response<?> deleteCountry(@PathVariable String id) {
        Response<Country> response = new Response<>();
        try {
            if (!countryRepository.existsById(id)) {
                response.setStatus(new Status("99", "ERROR", "Country Id Does Not Exist"));
                return response;
            }
            countryRepository.deleteById(id);
            response.setStatus(new Status("00", "Success", "Success"));
        } catch (Exception e) {
            log.error(e.getMessage());
            response.setStatus(new Status("99", "Error", e.getMessage()));
        }

        return response;
    }

}
