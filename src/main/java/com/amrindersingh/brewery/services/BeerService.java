package com.amrindersingh.brewery.services;

import com.amrindersingh.brewery.web.model.BeerDTO;
import org.springframework.stereotype.Component;

import java.util.UUID;

public interface BeerService {

    BeerDTO getBeerById(UUID beerId);

    BeerDTO saveNewBeer(BeerDTO beerDTO);
}
