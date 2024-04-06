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
  
  @GetMapping("/2")
  public String word2(Model model) throws InterruptedException {
    String word1 = Words.getString();
    model.addAttribute("word1", word1);
    Thread.sleep(10);
    String word2 = Words.getString();
    model.addAttribute("word2", word2);
    return "index2";
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
