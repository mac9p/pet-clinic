package io.github.mac9p.sfgpetclinic.services;

import io.github.mac9p.sfgpetclinic.model.Owner;
import io.github.mac9p.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
