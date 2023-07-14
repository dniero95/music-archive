package its.darioniero.musicarchive.services;

import its.darioniero.musicarchive.entities.Song;
import its.darioniero.musicarchive.entities.Tag;
import its.darioniero.musicarchive.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    @Autowired
    TagService tagService;

    public List<Song> fetchSongByTag(String tag){
        List<Song> songs = new ArrayList<>();

        List<Tag> tags = tagService.fetchTagsByTag(tag);

        for (Tag t :
                tags) {
            songs.add(t.getSong());
        }

        return songs;
    }

}
