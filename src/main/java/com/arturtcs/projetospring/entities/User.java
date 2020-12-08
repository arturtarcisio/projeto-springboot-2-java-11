package com.arturtcs.projetospring.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude={"name", "email", "fone", "password"})
@ToString
public class User implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter private Long id;
    @Getter @Setter private String name;
    @Getter @Setter private String email;
    @Getter @Setter private String fone;
    @Getter @Setter private String password;

}
