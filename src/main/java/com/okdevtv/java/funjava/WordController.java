package com.okdevtv.java.funjava;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WordController {
  @GetMapping("/")
  public String word(Model model) {
    model.addAttribute("words", Words.getString());
    return "index";
  }
}
