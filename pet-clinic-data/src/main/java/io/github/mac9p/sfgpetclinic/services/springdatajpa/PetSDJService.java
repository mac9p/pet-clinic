package io.github.mac9p.sfgpetclinic.services.springdatajpa;

import io.github.mac9p.sfgpetclinic.model.Pet;
import io.github.mac9p.sfgpetclinic.repositories.PetRepository;
import io.github.mac9p.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class PetSDJService implements PetService {

    private final PetRepository petRepository;

    public PetSDJService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> petSet = new HashSet<>();
        petRepository.findAll().forEach(pet -> petSet.add(pet));
        return petSet;
    }

    @Override
    public Pet findById(Long aLong) {
        Optional<Pet> optionalPet = petRepository.findById(aLong);
        return optionalPet.orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
