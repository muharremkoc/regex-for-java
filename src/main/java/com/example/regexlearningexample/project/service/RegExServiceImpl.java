package com.example.regexlearningexample.project.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class RegExServiceImpl implements IRegExService {
    @Override
    public String getFaturaId(String text) {

        String foundedText = "";

        while (true) {

            //Pattern pattern = Pattern.compile("([A-Za-z]) (:GIB[0-9]{13})");
            Pattern pattern = Pattern.compile("[A-z]{3}[0-9]{13}");
            Matcher matcher = pattern.matcher(text);
            boolean found = false;
            while (matcher.find()) {
                foundedText += matcher.group() + " ";

                found = true;
            }
            System.out.println(foundedText + "");
            if (!found) {
                return "No match found.";
            }
            return foundedText;

        }
    }

    @Override
    public String getVKN(String text) {

            String foundedText = "";

            while (true) {

                //Pattern pattern = Pattern.compile("([A-Za-z]) (:GIB[0-9]{13})");
                Pattern pattern = Pattern.compile("(?<=V[KL]N: )[0-9]{10}");
                Matcher matcher = pattern.matcher(text);
                boolean found = false;
                while (matcher.find()) {
                    foundedText += matcher.group() + " ";

                    found = true;
                }
                System.out.println(foundedText + "");
                if (!found) {
                    return "No match found.";
                }
                return foundedText;
            }
        }

    @Override
    public String getFirstB(String text) {

        String foundedText = "";
        Pattern pattern = Pattern.compile("\\b([Bb].*?)\\b");
        Matcher matcher = pattern.matcher(text);
        boolean found=false;

while (matcher.find()){
        foundedText+=matcher.group()+" ";

        found=true;
}
        System.out.println(foundedText+"");
        if (!found) {
            return "No match found.";
        }
        return foundedText;
    }

    @Override
    public String getLastK(String text) {

        String foundedText = "";
        Pattern pattern = Pattern.compile("\\S+[Kk]\\b");
        Matcher matcher = pattern.matcher(text);
        boolean found=false;

        while (matcher.find()){
            foundedText+=matcher.group()+" ";

            found=true;
        }
        System.out.println(foundedText+"");
        if (!found) {
            return "No match found.";
        }
        return foundedText;
    }

    @Override
    public String getDate(String text) {
        String foundedText = "";
        Pattern pattern = Pattern.compile("(0[1-9]|[1-2][0-9]|3[0-1]-(0[1-9]|1[0-2])-[0-9]{4}) (2[0-3]|[01][0-9]):[0-5][0-9]");
        Matcher matcher = pattern.matcher(text);
        boolean found=false;

        while (matcher.find()){
            foundedText+=matcher.group()+" ";

            found=true;
        }
        System.out.println(foundedText+"");
        if (!found) {
            return "No match found.";
        }
        return foundedText;
    }
}
