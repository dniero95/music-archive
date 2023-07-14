package its.darioniero.musicarchive.services;

import its.darioniero.musicarchive.entities.Tag;
import its.darioniero.musicarchive.repositories.TagRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class TagService {

    @Autowired
    TagRepository tagRepository;

    public List<Tag> fetchMostPopularTags(){
        return tagRepository.findAllByWeightLimitedTo100();
    }

    public List<Tag> fetchTagsByTag(String tag){
        return tagRepository.findAllByTag(tag);
    }

}
