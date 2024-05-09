package model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


@Entity
@Data
@Table(name = "movies_user")
public class MoviesUser implements Serializable {

    @ManyToMany
    @JoinColumn(name = "id_movie")
    private Movies movieId;

    @OneToMany
    @JoinColumn(name = "id_user")
    private User userId;


}
