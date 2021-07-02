package io.github.mac9p.sfgpetclinic.services.map;

import io.github.mac9p.sfgpetclinic.model.Specialty;
import io.github.mac9p.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty,Long> implements SpecialtyService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Specialty object) {
        delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long id) {
        deleteByID(id);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
