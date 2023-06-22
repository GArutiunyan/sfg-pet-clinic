package gena.spring.sfgpetclinic.services;

import gena.spring.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
