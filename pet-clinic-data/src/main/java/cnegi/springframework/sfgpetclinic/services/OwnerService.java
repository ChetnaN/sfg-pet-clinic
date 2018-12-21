package cnegi.springframework.sfgpetclinic.services;

import cnegi.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);

}
