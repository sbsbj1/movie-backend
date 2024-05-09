package model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.Year;

@Entity
@Data
@Table(name = "movies")
public class Movies implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Year released_year;

    private int runtime;
    private float rating;
    private String overview;
    private String director;

    @ManyToOne
    @JoinColumn(name = "id_platform")
    private Platform platformId;

}
