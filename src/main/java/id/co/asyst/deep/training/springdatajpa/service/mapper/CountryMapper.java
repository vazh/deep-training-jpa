package id.co.asyst.deep.training.springdatajpa.service.mapper;

import id.co.asyst.deep.training.springdatajpa.entity.Country;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    Country entityToEntity(Country country);
}
