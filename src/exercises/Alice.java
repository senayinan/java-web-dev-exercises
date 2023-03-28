package exercises;
import java.util.Scanner;

public class Alice {

   public static boolean isContains () {

       String paragraph = "Alice was beginning to get very tired of sitting by her sister on " +
               "the bank, and of having nothing to do: once or twice she had peeped into the " +
               "book her sister was reading, but it had no pictures or conversations in it," +
               " 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";


       Scanner input = new Scanner(System.in);
       System.out.println("Print the word you're looking for:");
       String word = input.nextLine();
       input.close();

       Integer index = paragraph.indexOf(word);
       Integer length = word.length();
       String modifiedSentence = paragraph.replace(word, "");

       System.out.println("Your searched word appears at index " + index + ". Your word is " + length + " characters long.");

       System.out.println(modifiedSentence);

       if (paragraph.toLowerCase().contains(word.toLowerCase())) {

           return true;
       } else {
           return false;
       }

   }


}
