package org.springfitnesscenter.domain;


import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Client extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    int id;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "FK_Client_Email")
    Email email;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinTable(name = "client_phone", joinColumns = @JoinColumn (name = "FK_Client_ID"),  inverseJoinColumns = @JoinColumn(name = "FK_Phone_ID"))
    List<Phone> phones;

    @OneToMany
    @JoinTable(name = "client_program", joinColumns = @JoinColumn (name = "FK_Client_ID"),  inverseJoinColumns = @JoinColumn(name = "FK_Program_ID"))
    List<Program> programs;

    boolean active;


    //add Phone field

    //send info about sales, boolean

    //OneToMany Uni- to Programm
}
