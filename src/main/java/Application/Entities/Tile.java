package Application.Entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tiles")
public class Tile {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // or GenerationType.IDENTITY
    @Column(name = "Id", nullable = false, unique = true)
    private UUID Id;


    public Tile(){

    }
}
