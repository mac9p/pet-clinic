package io.github.mac9p.sfgpetclinic.repositories;

import io.github.mac9p.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VetRepository extends CrudRepository<Vet,Long> {
    Optional<Vet> findById(Long id);
}
