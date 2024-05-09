package model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "community_award")
public class CommunityAward implements Serializable {

    private Long id;
    private String name;
    private int pointsUsed;


    @ManyToOne
    @JoinColumn(name = "id_user")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "id_movie")
    private Movies movieId;




}
