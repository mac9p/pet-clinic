package io.github.mac9p.sfgpetclinic.services.springdatajpa;

import io.github.mac9p.sfgpetclinic.model.PetType;
import io.github.mac9p.sfgpetclinic.repositories.PetTypeRepository;
import io.github.mac9p.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class PetTypeSDJService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petType -> petTypes.add(petType));
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        Optional<PetType> optionalPetType = petTypeRepository.findById(aLong);
        return optionalPetType.orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
    petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
    petTypeRepository.deleteById(aLong);
    }
}
