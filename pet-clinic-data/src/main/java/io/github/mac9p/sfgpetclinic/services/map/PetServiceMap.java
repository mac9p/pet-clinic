package io.github.mac9p.sfgpetclinic.services.map;

import io.github.mac9p.sfgpetclinic.model.Pet;
import io.github.mac9p.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
    super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long aLong) {
    super.deleteByID(aLong);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
