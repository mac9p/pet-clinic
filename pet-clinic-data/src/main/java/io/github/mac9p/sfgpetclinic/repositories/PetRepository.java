package io.github.mac9p.sfgpetclinic.repositories;

import io.github.mac9p.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
