package id.co.asyst.deep.training.springdatajpa.repository;

import id.co.asyst.deep.training.springdatajpa.entity.CityRegency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRegencyRepository extends JpaRepository<CityRegency, String> {
    List<CityRegency> findAllByProvinceId(String provinceId);
}
