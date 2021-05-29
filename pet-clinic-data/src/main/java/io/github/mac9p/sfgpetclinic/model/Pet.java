package io.github.mac9p.sfgpetclinic.model;

import lombok.Setter;
import lombok.Getter;
import java.time.LocalDate;
@Getter
@Setter
public class Pet extends BaseEntity {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
