package cnegi.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
	@Override
	Set<Pet> findAll() {
		return super.findAll();
	}
	
	@Override
	Pet findById(Long id) {
		return thi.findById(id);
	}
	
	@Override
	Pet save(Long id, Pet object) {		
		return super.save(object.getId(), object);
	}
	
	@Override
	void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	void delete(Pet object) {
		super.delete(object);
	}

}
