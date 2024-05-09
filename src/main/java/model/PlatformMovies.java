package model;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "platform_movies")
public class PlatformMovies implements Serializable {
    @OneToMany
    @JoinColumn(name = "id_movie")
    private Movies movieId;

    @ManyToOne
    @JoinColumn(name = "id_platform")
    private Platform platformId;
}
