package cnegi.springframework.sfgpetclinic.services;

import cnegi.springframework.sfgpetclinic.model.Vet;


public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();


}
