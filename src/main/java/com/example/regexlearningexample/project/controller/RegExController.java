package com.example.regexlearningexample.project.controller;

import com.example.regexlearningexample.project.service.IRegExService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class RegExController {

    final IRegExService iRegExService;

    @PostMapping(value = "/faturaNo")
    public String getText(@RequestParam String text){
       return iRegExService.getFaturaId(text);
    }
    @PostMapping(value = "/VKN")
    public String getVKN(@RequestParam String text){
        return iRegExService.getVKN( text);
    }
    @PostMapping(value = "/getFirstB")
    public String getFirstB(@RequestParam String text){
        return iRegExService.getFirstB(text);
    }


    @PostMapping(value = "/getLastK")
    public String getLastK(@RequestParam String text){
        return iRegExService.getLastK(text);
    }
}
