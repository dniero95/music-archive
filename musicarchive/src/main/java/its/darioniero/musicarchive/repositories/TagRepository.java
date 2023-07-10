package its.darioniero.musicarchive.repositories;

import its.darioniero.musicarchive.entities.Song;
import its.darioniero.musicarchive.entities.Tag;
import its.darioniero.musicarchive.entities.TagId;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, TagId> {
}
