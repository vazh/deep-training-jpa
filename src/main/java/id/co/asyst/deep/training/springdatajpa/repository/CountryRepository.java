package id.co.asyst.deep.training.springdatajpa.repository;

import id.co.asyst.deep.training.springdatajpa.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CountryRepository extends JpaRepository<Country, UUID> {

}
