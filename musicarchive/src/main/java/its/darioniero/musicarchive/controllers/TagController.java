package its.darioniero.musicarchive.controllers;

import its.darioniero.musicarchive.entities.Tag;
import its.darioniero.musicarchive.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TagController {

    @Autowired
    TagService tagService;

    @GetMapping("/tags")
    public String getTagView(Model model){
        List<Tag> tags = tagService.fetchMostPopularTags();
        model.addAttribute("tags",tags);
        return "tag";
    }
}
