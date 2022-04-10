package com.alkemymovies.disneymovies.Entity;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "movie")
@Getter
@Setter
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String image;
    private String title;
    @Column(name = "creation_date")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate creationDate; //VER
    private Long rating; //del 1 al 5
    @ManyToOne
    private GenreEntity genre;
    //@Column(name = "personajes_asociados")
    //private List<PersonajeEntity> personajesAsociados
}
