package its.darioniero.musicarchive.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagId implements Serializable {

    @Column(name = "song_id")
    private Long songId;

    @Column(name = "id")
    private Long id;

}
