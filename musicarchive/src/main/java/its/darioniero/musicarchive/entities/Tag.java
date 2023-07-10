package its.darioniero.musicarchive.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tags")
@AllArgsConstructor
@NoArgsConstructor
public class Tag {

    @EmbeddedId
    private TagId id;

    @JoinColumn(name = "song_id", referencedColumnName = "id")
    @MapsId("songId")
    @ManyToOne(cascade = CascadeType.ALL)
    private Song song;

    @Column (name = "tag")
    private String tag;

    @Column(name = "weight")
    private int weight;
}
