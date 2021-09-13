package com.example.regexlearningexample.commands;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCommands {


    public static void main(String[] args) {


        Scanner keyboard=new Scanner(System.in);
        while (true) {
            System.out.println("Enter regex pattern:");
            Pattern pattern = Pattern.compile(keyboard.nextLine());
            System.out.println("Enter text:");
            Matcher matcher = pattern.matcher(keyboard.nextLine());
            boolean found = false;
            while (matcher.find()) {
                System.out.println("I found the text "+matcher.group());
                found = true;
            }
            if(!found){
                System.out.println("No match found.");
            }
        }





    }



    //String tarih bulma formatı [0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1]) (2[0-3]|[01][0-9]):[0-5][0-9]:[0-5][0-9]




}
