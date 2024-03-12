package com.okdevtv.java.funjava;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WordController {
  @GetMapping("/")
  public String word(Model model) {
    model.addAttribute("words", Words.getString());
    return "index";
  }
}

@CrossOrigin(origins = "*")
@RestController
class WordRestController {
  @GetMapping("/api/words")
  public Word word() {
    return new Word(Words.getString());
  }
}

record Word(String content) {
}
