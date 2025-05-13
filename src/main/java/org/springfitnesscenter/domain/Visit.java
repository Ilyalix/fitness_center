package org.springfitnesscenter.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "visit_id")
    int id;

    double actualWeight;

    @ManyToOne
    @JoinColumn(name = "FK_Visit_Client")
    Client client;

    @ManyToOne
    @JoinColumn(name = "FK_Visit_Program")
    Program program;

    @Version
    private int version;

}
