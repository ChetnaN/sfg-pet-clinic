package cnegi.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class AbsractMapService<T, ID> {
	
	protected Map<ID, T> map = new HashMap<>();
	
	Set<T> findAll() {
		return new HashMap<>(map.values());
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(ID id, T object) {
		map.put(id, object);
		
		return object;
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	
	void delete(T object) {
		map.entrySet().remove(entry -> entry.getValue().equals(object));
	}

}
