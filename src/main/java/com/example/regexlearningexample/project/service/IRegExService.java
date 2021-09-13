package com.example.regexlearningexample.project.service;

import org.springframework.web.multipart.MultipartFile;

public interface IRegExService {

    String getFaturaId(String text);

    String getVKN(String text);

    String getFirstB(String text);

    String getLastK(String text);
}
