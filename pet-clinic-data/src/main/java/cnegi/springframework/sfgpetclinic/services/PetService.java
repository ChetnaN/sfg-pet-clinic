package cnegi.springframework.sfgpetclinic.services;

import cnegi.springframework.sfgpetclinic.model.Pet;


public interface PetService {

	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

}
