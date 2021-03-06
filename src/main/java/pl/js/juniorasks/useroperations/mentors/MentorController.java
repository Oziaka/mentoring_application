package pl.js.juniorasks.useroperations.mentors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.js.juniorasks.models.Mentor;

@RestController
public class MentorController {

    private final MentorService mentorService;

    public MentorController(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @GetMapping("/mentors/{mentorNick}")
    ResponseEntity<Mentor> getMentor(@PathVariable String mentorNick) {
        return new ResponseEntity<>(mentorService.getMentor(mentorNick), HttpStatus.OK);
    }

    @PostMapping("/mentors")
    ResponseEntity<Mentor> addMentor(@RequestBody Mentor mentor) {
        return new ResponseEntity<>(mentorService.addMentor(mentor), HttpStatus.OK);
    }

    @DeleteMapping("/mentors/{mentorNick}")
    ResponseEntity<Mentor> removeMentor(@PathVariable String mentorNick) {
        return new ResponseEntity<>(mentorService.removeMentor(mentorNick), HttpStatus.OK);
    }
}
