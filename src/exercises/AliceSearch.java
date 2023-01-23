package exercises;

import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String story = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Search for?:");
        String search = input.nextLine();
        boolean result = story.toLowerCase().contains(search.toLowerCase());

        if (result) {
            System.out.println("Search term at index: " + story.toLowerCase().indexOf(search));
            System.out.println("Search term length: " + search.length());

            String editedStory = story.toLowerCase().replace(search, "");
            System.out.println(editedStory);
        } else System.out.println(false);
    }
}
