package com.example.demo;

/**
 * Created by student on 6/21/17.
 */
import com.example.demo.models.Listing;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListingRepository extends CrudRepository<Listing, Integer> {



}
