package com.kentcarmine.msscbeerservice.web.mappers;

import com.kentcarmine.msscbeerservice.domain.Beer;
import com.kentcarmine.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtotoBeer(BeerDto beerDto);
}
