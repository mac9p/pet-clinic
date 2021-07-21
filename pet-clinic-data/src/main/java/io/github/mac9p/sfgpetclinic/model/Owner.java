package io.github.mac9p.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "owners")
public class Owner extends Person{

    @Getter
    @Setter
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private Set<Pet> petSet = new HashSet<>();
}
