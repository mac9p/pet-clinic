package io.github.mac9p.sfgpetclinic.bootstrap;

import io.github.mac9p.sfgpetclinic.model.Owner;
import io.github.mac9p.sfgpetclinic.model.Vet;
import io.github.mac9p.sfgpetclinic.services.OwnerService;
import io.github.mac9p.sfgpetclinic.services.VetService;
import io.github.mac9p.sfgpetclinic.services.map.OwnerServiceMap;
import io.github.mac9p.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Andrew");
        owner1.setLastName("Jenkins");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Olaf");
        owner2.setLastName("McCough");
        ownerService.save(owner2);

        System.out.println("Loaded owners---");

        Vet vet1 = new Vet();
        vet1.setFirstName("John");
        vet1.setLastName("Thompson");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("John");
        vet2.setLastName("Thompson");
        vetService.save(vet2);

        System.out.println("Loaded vets---");
    }
}
