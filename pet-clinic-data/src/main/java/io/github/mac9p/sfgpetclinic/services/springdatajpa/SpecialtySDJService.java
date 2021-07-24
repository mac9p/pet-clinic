package io.github.mac9p.sfgpetclinic.services.springdatajpa;

import io.github.mac9p.sfgpetclinic.model.Specialty;
import io.github.mac9p.sfgpetclinic.repositories.SpecialtyRepository;
import io.github.mac9p.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class SpecialtySDJService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtySDJService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialtySet = new HashSet<>();
        specialtyRepository.findAll().forEach(specialty -> specialtySet.add(specialty));
        return specialtySet;
    }

    @Override
    public Specialty findById(Long aLong) {
        Optional<Specialty> optionalSpecialty = specialtyRepository.findById(aLong);
        return optionalSpecialty.orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
