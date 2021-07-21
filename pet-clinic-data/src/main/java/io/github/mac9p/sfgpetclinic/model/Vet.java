package io.github.mac9p.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends Person{
    @Getter
    @Setter
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties",joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Specialty> setOfSpecialties = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "vet")
    private Set<Visit> setOfVisits = new HashSet<>();
}
