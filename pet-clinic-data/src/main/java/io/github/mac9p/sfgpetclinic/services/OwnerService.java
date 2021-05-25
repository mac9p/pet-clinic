package io.github.mac9p.sfgpetclinic.services;

import io.github.mac9p.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
