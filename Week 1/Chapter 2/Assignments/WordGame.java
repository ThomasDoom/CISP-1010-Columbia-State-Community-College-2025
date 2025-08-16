import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Introduction
        System.out.println("\nHey! Let's play a word game!");
        System.out.println("\nAnswer these simple questions for me!");


        // Series of Questions and Inputs
        System.out.print("What's your name? ");
        String name = keyboard.nextLine();

        System.out.print("Now what's your age? ");
        String age = keyboard.nextLine();

        System.out.print("Ok and I need the name of a city! ");
        String city = keyboard.nextLine();

        System.out.print("And a college! ");
        String college = keyboard.nextLine();

        System.out.print("Name any profession: ");
        String profession = keyboard.nextLine();

        System.out.print("What about a type of animal? ");
        String animal = keyboard.nextLine();

        System.out.print("And lastly I'll need a pet's name: ");
        String petName = keyboard.nextLine();


        // Preparing Story
        System.out.println("\nPerfect! Here's the story I came up with...\n");

        // "Page Break" to Make Story Easier to Read in Terminal
        String pageBreak = ". . . . . . . .";

        System.out.println(pageBreak);

        // Display Full Word Game Story Using User's Inputs
        System.out.println("There once was a person named " + name + " who lived in " + city + ".");
        System.out.println("At the age of " + age + ", " + name + " went to college at " + college + ".");
        System.out.println(name + " graduated and went to work as a " + profession + ".");
        System.out.println("Then " + name + " adopted a(n) " + animal + " named " + petName + ".");
        System.out.println("They both lived happily ever after!");

        System.out.println(pageBreak + "\n");
        

        keyboard.close();
    }

}