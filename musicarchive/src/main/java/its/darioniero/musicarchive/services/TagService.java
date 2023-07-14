package its.darioniero.musicarchive.services;

import its.darioniero.musicarchive.entities.Tag;
import its.darioniero.musicarchive.models.TagWithNumberOfSongs;
import its.darioniero.musicarchive.repositories.TagRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class TagService {

    @Autowired
    TagRepository tagRepository;

    public List<Tag> fetchMostPopularTags(){
        return tagRepository.findAllByWeightLimitedTo100();
    }
    public List<TagWithNumberOfSongs> fetchTagsWithNumberOfSongs(){


        List<TagWithNumberOfSongs> tagWithNumberOfSongs = tagRepository.findTagNameWithNumberOfSongs();



        return tagWithNumberOfSongs;

    }



    public List<Tag> fetchTagsByTag(String tag){
        return tagRepository.findAllByTag(tag);
    }

}
