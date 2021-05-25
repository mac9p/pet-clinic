package io.github.mac9p.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person extends BaseEntity{
    private String firstName;
    private String lastName;
}
