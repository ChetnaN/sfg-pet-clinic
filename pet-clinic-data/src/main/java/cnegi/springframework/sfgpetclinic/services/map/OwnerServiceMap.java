package cnegi.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
	@Override
	Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	Owner findById(Long id) {
		return thi.findById(id);
	}
	
	@Override
	Owner save(Long id, Owner object) {		
		return super.save(object.getId(), object);
	}
	
	@Override
	void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	void delete(Owner object) {
		super.delete(object);
	}

}
