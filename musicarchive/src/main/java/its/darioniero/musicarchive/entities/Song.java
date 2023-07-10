package its.darioniero.musicarchive.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="songs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "length")
    private int length;


    @JoinColumn(name = "album_id", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private Album album;
}
