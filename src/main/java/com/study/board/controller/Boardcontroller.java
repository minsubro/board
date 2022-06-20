package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Boardcontroller {

    @GetMapping("/board/write") //localhost:8080/board/write
   public String boardWriteForm() {
        return "boardwrite";
   }

   @PostMapping("/board/writepro")
   public String boardWritePro(String title, String content) {
       System.out.println(title);
        return "";
   }
}
