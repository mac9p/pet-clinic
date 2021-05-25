package io.github.mac9p.sfgpetclinic.services;

import io.github.mac9p.sfgpetclinic.model.Owner;
import io.github.mac9p.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
