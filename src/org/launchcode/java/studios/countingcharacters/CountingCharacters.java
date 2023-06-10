package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {
        //String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase , and I'll count each letter in your phrase:");
        String quote = input.nextLine().toLowerCase();

        char[] charactersInString = quote.toCharArray();
        HashMap<Character, Integer> letterCounts = new HashMap<>();

        for (char letter : charactersInString) {
            if (!Character.isAlphabetic(letter)) {
                continue;
            }
            System.out.println(letter);
            if (!letterCounts.containsKey(letter)) {
                letterCounts.put(letter, 1);
            } else {
               // letterCounts.computeIfPresent(letter,
                        //(key, val) -> val + 1;
                letterCounts.put(letter, letterCounts.get(letter)+1);
            }
        }
        for(Map.Entry<Character, Integer> lettersEntry: letterCounts.entrySet()) {
    System.out.println(lettersEntry.getKey() + ": " + lettersEntry.getValue());
        }
    }

}
