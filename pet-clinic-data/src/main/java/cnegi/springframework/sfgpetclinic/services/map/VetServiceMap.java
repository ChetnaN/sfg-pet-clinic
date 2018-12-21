package cnegi.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
	@Override
	Set<Vet> findAll() {
		return super.findAll();
	}
	
	@Override
	Vet findById(Long id) {
		return thi.findById(id);
	}
	
	@Override
	Vet save(Long id, Vet object) {		
		return super.save(object.getId(), object);
	}
	
	@Override
	void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	void delete(Vet object) {
		super.delete(object);
	}

}
