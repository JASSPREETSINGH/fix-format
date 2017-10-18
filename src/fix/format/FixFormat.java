/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fix.format;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class FixFormat {

    public static void main(String[] args) throws Exception {

        try {
            FileReader f = new FileReader("C:\\Downloads\\Input.txt");
            BufferedReader br = new BufferedReader(f);
            Scanner scfile = new Scanner(br);
            boolean capitilize = false;

            while (scfile.hasNext()) {  //Is there more words ?
                String currentWord = scfile.next();     //If yes add the word inside variable

                //If number go to new line
                try {
                    Integer.parseInt(currentWord);
                    System.out.println(""); //Does not crash, go next line
                    continue;   //Skip rest, go to next part of While loop
                } catch (Exception e) {
                }

                //Print Word
                if (capitilize) {
                    System.out.print(currentWord.substring(0, 1).toUpperCase());
                    System.out.print(currentWord.substring(1));

                    capitilize = false;
                } else {
                    System.out.print(currentWord);
                }

                System.out.print(" ");

                //Next word is it capitilized ?
                if (currentWord.endsWith(".")) {
                    capitilize = true;
                }
            }

        } catch (IOException e) {
            System.out.print(" pokk");
        }

    }
