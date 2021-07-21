package io.github.mac9p.sfgpetclinic.bootstrap;

import io.github.mac9p.sfgpetclinic.model.*;
import io.github.mac9p.sfgpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, PetService petService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
        this.specialtyService = specialtyService;
    }

    Boolean isLoaded() {
        if (petTypeService.findAll().size() != 0)
            return true;
        else
            return false;
    }

    @Override
    public void run(String... args) throws Exception {
        if (!isLoaded()) {
            LoadData();
        }
    }

    private void LoadData() {
        PetType cat = new PetType();
        cat.setName("cat");
        petTypeService.save(cat);

        PetType dog = new PetType();
        dog.setName("dog");
        petTypeService.save(dog);

        System.out.println("Loaded PetTypes---------");


        Pet pet2 = new Pet();
        pet2.setPetType(dog);
        pet2.setBirthDate(LocalDate.of(2019, 5, 29));
        pet2.setName("puffy");
        petService.save(pet2);

        Pet pet1 = new Pet();
        pet1.setPetType(cat);
        pet1.setBirthDate(LocalDate.of(2019, 10, 10));
        pet1.setName("fluffy");
        petService.save(pet1);
        System.out.println("Loaded Pets--------------");

        Owner owner1 = new Owner();
        //owner1.setId(1L);
        owner1.setFirstName("Andrew");
        owner1.setLastName("Jenkins");
        owner1.setAddress("LongDrive 33");
        owner1.setTelephoneNumber("192222345");
        owner1.getPetSet().add(pet1);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        //owner2.setId(2L);
        owner2.setFirstName("Olaf");
        owner2.setLastName("McCough");
        owner2.getPetSet().add(pet2);
        owner1.setCity("NY");
        owner1.setAddress("ShortDrive 22");
        owner2.setTelephoneNumber("512444523");
        ownerService.save(owner2);

        System.out.println("Loaded owners---");

        Specialty surgeon = new Specialty();
        surgeon.setDescription("surgeon");
        specialtyService.save(surgeon);

        Specialty nutritionist = new Specialty();
        nutritionist.setDescription("nutritionist");
        specialtyService.save(nutritionist);

        Vet vet1 = new Vet();
        //vet1.setId(1L);
        vet1.setFirstName("John");
        vet1.setLastName("Thompson");
        vet1.getSetOfSpecialties().add(surgeon);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        //vet2.setId(2L);
        vet2.setFirstName("Frank");
        vet2.setLastName("Kowalski");
        vet2.getSetOfSpecialties().add(nutritionist);
        vetService.save(vet2);

        System.out.println("Loaded vets---");
    }
}
