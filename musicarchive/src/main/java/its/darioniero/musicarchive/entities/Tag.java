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

    @Id
    @JoinColumn(name = "song_id", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Song song;

    @Column (name = "tag")
    private String tag;

    @Column(name = "weight")
    private int weight;
}
