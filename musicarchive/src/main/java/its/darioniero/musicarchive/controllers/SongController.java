package its.darioniero.musicarchive.controllers;


import its.darioniero.musicarchive.entities.Song;
import its.darioniero.musicarchive.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongService songService;

    @GetMapping("/songs")
    public String getSongView(Model model, @RequestParam("tag") String tag){
        List<Song> songs = songService.fetchSongByTag(tag);

        model.addAttribute("songs", songs);
        return "song";
    }
}
