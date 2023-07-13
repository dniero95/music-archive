package its.darioniero.musicarchive.controllers;


import its.darioniero.musicarchive.entities.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SongController {

    @GetMapping("/songs")
    public String getSongView(Model model){

        return "song";
    }
}
