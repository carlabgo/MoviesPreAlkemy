package com.alkemymovies.disneymovies.Entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "characters")
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
    @ManyToMany(mappedBy = "characters", cascade = CascadeType.ALL)
    private List<MovieEntity> movies = new ArrayList();

}
