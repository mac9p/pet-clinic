package io.github.mac9p.sfgpetclinic.services.map;

import io.github.mac9p.sfgpetclinic.model.Owner;
import io.github.mac9p.sfgpetclinic.services.OwnerService;
import io.github.mac9p.sfgpetclinic.services.PetService;
import io.github.mac9p.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null) {
            if (object.getPetSet() != null) {
                object.getPetSet().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() != null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet type is required");
                    }
                });
            }
            return super.save(object.getId(), object);
        } else
            return null;
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
