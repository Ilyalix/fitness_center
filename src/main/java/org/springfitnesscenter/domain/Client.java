package org.springfitnesscenter.domain;


import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Client extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    int id;

    double height;

    double actualWeight;

    double desiredWeight;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @NonNull
    @JoinColumn(name = "FK_Client_Email")
    Email email;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinTable(name = "client_phone", joinColumns = @JoinColumn(name = "FK_Client_ID"),
            inverseJoinColumns = @JoinColumn(name = "FK_Phone_ID"))
    List<Phone> phones;

    @ManyToMany(cascade = {CascadeType.REMOVE})
    @NotEmpty
    @JoinTable(name = "client_program", joinColumns = @JoinColumn(name = "FK_Client_ID"),
            inverseJoinColumns = @JoinColumn(name = "FK_Program_ID"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"FK_Client_ID", "FK_Program_ID"}))
    Set<Program> programs;

    boolean active;


}
