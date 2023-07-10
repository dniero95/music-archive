package its.darioniero.musicarchive.repositories;

import its.darioniero.musicarchive.entities.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {
}
