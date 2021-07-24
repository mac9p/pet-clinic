package io.github.mac9p.sfgpetclinic.services.springdatajpa;

import io.github.mac9p.sfgpetclinic.model.Vet;
import io.github.mac9p.sfgpetclinic.repositories.VetRepository;
import io.github.mac9p.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VetSDJService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vet -> vets.add(vet));
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        if(vetRepository.findById(aLong).isPresent()) {
            return vetRepository.findById(aLong).get();
        }else
            return null;
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
    vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
    vetRepository.deleteById(aLong);
    }
}
