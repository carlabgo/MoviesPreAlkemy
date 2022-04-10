package com.alkemymovies.disneymovies.Entity;

import java.util.List;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "character")
@Getter
@Setter
public class CharacterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String image;
    private String name;
    private Long age;
    private Double weight;
    private String story;
    @OneToMany
    @Column(name = "associated_movie") //en la bdd las palabras se separan con _
    private List<MovieEntity> associatedMovie;

}
