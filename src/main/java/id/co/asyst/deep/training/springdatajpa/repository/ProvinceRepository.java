package id.co.asyst.deep.training.springdatajpa.repository;

import id.co.asyst.deep.training.springdatajpa.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, String> {
}
