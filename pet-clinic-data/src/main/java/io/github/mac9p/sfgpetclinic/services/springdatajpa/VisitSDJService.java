package io.github.mac9p.sfgpetclinic.services.springdatajpa;

import io.github.mac9p.sfgpetclinic.model.Visit;
import io.github.mac9p.sfgpetclinic.repositories.VisitRepository;
import io.github.mac9p.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class VisitSDJService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visit -> visits.add(visit));
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        Optional<Visit> visitOptional = visitRepository.findById(aLong);
        return visitOptional.orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
