package its.darioniero.musicarchive.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagWithNumberOfSongs {
    private String tag;
    private Long numberOfSongs;

    public String getTag() {
        return tag;
    }

    public Long getNumberOfSongs() {
        return numberOfSongs;
    }
}
