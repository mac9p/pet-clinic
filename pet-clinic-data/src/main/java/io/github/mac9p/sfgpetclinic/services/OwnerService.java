package io.github.mac9p.sfgpetclinic.services;

import io.github.mac9p.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}

