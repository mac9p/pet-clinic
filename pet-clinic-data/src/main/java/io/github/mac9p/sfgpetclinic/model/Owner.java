package io.github.mac9p.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person{

    @Getter
    @Setter
    private Set<Pet> petSet = new HashSet<>();
}
