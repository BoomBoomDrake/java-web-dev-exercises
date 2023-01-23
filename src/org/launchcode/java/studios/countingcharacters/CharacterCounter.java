package org.launchcode.java.studios.countingcharacters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) throws IOException {
        String testText = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> charCount = new HashMap<>();
        String fileName = "C:\\Users\\Ashley's Computer\\Documents\\Eric's Coding Files\\launchcode\\java\\java-web-dev-exercises\\src\\org\\launchcode\\java\\studios\\countingcharacters\\helloWorld.txt";


        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while(line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        } finally {
            br.close();
        }

//        System.out.println("Please enter some text: ");
//        String userInput = input.nextLine();
//
//
//        char[] charArr = userInput.toCharArray();
//
//        for (char c : charArr) {
//            String key = String.valueOf(c).toLowerCase();
//            if (!key.matches("^[a-zA-Z0-9]*$")) continue;
//
//            if (!charCount.containsKey(key)) {
//                charCount.put(key, 1);
//            } else {
//                charCount.put(key, charCount.get(key) + 1);
//            }
//        }
//
//        System.out.println(charCount);
    }
}
