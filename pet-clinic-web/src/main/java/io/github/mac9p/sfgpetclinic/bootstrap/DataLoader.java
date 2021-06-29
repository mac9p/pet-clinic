package io.github.mac9p.sfgpetclinic.bootstrap;

import io.github.mac9p.sfgpetclinic.model.Owner;
import io.github.mac9p.sfgpetclinic.model.Vet;
import io.github.mac9p.sfgpetclinic.services.OwnerService;
import io.github.mac9p.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        //owner1.setId(1L);
        owner1.setFirstName("Andrew");
        owner1.setLastName("Jenkins");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        //owner2.setId(2L);
        owner2.setFirstName("Olaf");
        owner2.setLastName("McCough");
        ownerService.save(owner2);

        System.out.println("Loaded owners---");

        Vet vet1 = new Vet();
        //vet1.setId(1L);
        vet1.setFirstName("John");
        vet1.setLastName("Thompson");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        //vet2.setId(2L);
        vet2.setFirstName("Frank");
        vet2.setLastName("Kowalski");
        vetService.save(vet2);

        System.out.println("Loaded vets---");
    }
}
