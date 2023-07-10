package its.darioniero.musicarchive.repositories;


import its.darioniero.musicarchive.entities.Tag;
import its.darioniero.musicarchive.entities.TagId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TagRepository extends CrudRepository<Tag, Long> {
    @Query("SELECT t FROM Tag t ORDER BY t.weight DESC, t.tag ASC")
    List<Tag> findAllByWeightLimitedTo100();
}
