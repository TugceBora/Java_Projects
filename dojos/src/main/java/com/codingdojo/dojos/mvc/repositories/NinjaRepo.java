 package com.codingdojo.dojos.mvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojos.mvc.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository <Ninja, Long>{

}
