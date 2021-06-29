package io.github.mac9p.sfgpetclinic.services.map;

import io.github.mac9p.sfgpetclinic.model.PetType;
import io.github.mac9p.sfgpetclinic.services.PetTypeService;

import java.util.Set;

public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
