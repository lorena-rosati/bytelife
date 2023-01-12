package cptlorena;

import java.io.*;
import java.util.*;

public class CPTLorena {

    static Scanner in = new Scanner(System.in);

    //ArrayLists to store potential girl and boy names in order to randomly generate them further on
    static ArrayList<String> girlNames = new ArrayList();
    static ArrayList<String> boyNames = new ArrayList();

    static int age = 0;
    static boolean life = true;
    static boolean naturalDeath = true;

    //Person characteristics
    String firstName;
    String lastName;
    String gender;
    String birthplace;
    String birthday;
    int health;
    int happiness;
    int looks;
    int smarts;

    public static void main(String[] args) throws InterruptedException {

        while (true) {

            System.out.println("-----------------------------------------------------------------------------");

            System.out.println("BYTELIFE");
            System.out.println("Welcome to Bytelife! Please select an option to continue:");
            System.out.println("1 - Game instructions \n2 - Start game \n3 - Morri Quiz \n4 - Morri Dictionary \n5 - Exit program");
            int input = in.nextInt();

            if (input == 1) {
                instructions();
            } else if (input == 2) {
                new Bytelife();
            } else if (input == 3) {
                new Quiz();
            } else if (input == 4) {
                new Dictionary();
            } else if (input == 5) {
                System.out.println("Thanks for playing!");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
                System.exit(0);
            }

        }

    }

    //Prints out the instructions
    public static void instructions() throws InterruptedException{
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("INSTRUCTIONS: \n");
        System.out.println("This game is inspired from the famous game Bitlife, a text-based life simulation game. "
                + "\n START OF THE GAME "
                + "\n When the game begins, a new Morri person will be randomly generated with a unique name, birthplace, gender, birthday, and parents. "
                + "\n Random stats for their health, looks, smarts, and happiness will also be generated (from 0-100%) and will change as they progress through their life. "
                + "\n Warning: You do NOT have to input anything for the first five years of your life."
                + "\n "
                + "\n THE GAME "
                + "\n Something new will happen at each age, affecting your stats. You'll also be faced with many choices that will impact your life. "
                + "\n In each section of your life, there will be 1-2 choices that you have the option to make that will result in an instant death as a result."
                + "\n Your health will begin naturally decreasing as you age (and will decrease from certain choices). "
                + "\n If your health ever reaches 0%, you will die of a natural death."
                + "\n "
                + "\n END OF THE GAME"
                + "\n If you die before 50 years of age, you have lost the game and will have the opportunity to return to the main menu and play again. "
                + "\n If you reach the 50 years of age, you won!!");
        System.out.println("\nPress 'C' to head back to the main screen. ");
        in.nextLine();
        String input2 = in.nextLine();
        System.out.println("");
    }

}
