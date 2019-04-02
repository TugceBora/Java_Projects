package com.codingdojo.dojos.mvc.services;

import org.springframework.stereotype.Service;

import com.codingdojo.dojos.mvc.models.Ninja;
import com.codingdojo.dojos.mvc.repositories.NinjaRepo;

@Service
public class NinjaService {
	private final NinjaRepo nr;
	
	public NinjaService(NinjaRepo nr) {
		this.nr = nr;
	}
	public Ninja createNinja(Ninja ninja) {
		return nr.save(ninja);
	}

}
