package cptlorena;

import java.util.*;
import java.io.*;

public class Bytelife extends CPTLorena {

    Bytelife() throws InterruptedException {

        System.out.println("-----------------------------------------------------------------------------");

        try {
            FileReader fr1 = new FileReader("GirlNames.txt");
            Scanner s1 = new Scanner(fr1);

            FileReader fr2 = new FileReader("BoyNames.txt");
            Scanner s2 = new Scanner(fr2);

            //Saving possible first names to array lists from text files
            while (s1.hasNext()) {
                girlNames.add(s1.nextLine());
            }
            while (s2.hasNext()) {
                boyNames.add(s2.nextLine());
            }

            fr1.close();
            fr2.close();

        } catch (Exception e) {
            System.out.println("Error");
        }

        //Creating person
        Person morri = new Person();

        morri.generateGender(girlNames, boyNames); //generates gender and name
        morri.age = 0;
        morri.generateBirthplace();
        morri.generateBirthday();
        morri.generateStats();

        //Creating parents
        Person mom = new Person();
        mom.gender = "female";
        mom.generateName(girlNames);

        Person dad = new Person();
        dad.gender = "male";
        dad.generateName(boyNames);

        System.out.println("\n \n");

        //Age: 0 years
        System.out.println("AGE: " + age);
        System.out.println("Your name is " + morri.firstName + " " + morri.lastName + ".");
        System.out.println("You were born a " + morri.gender + " in " + morri.birthplace + ", Canada to your parents " + mom.firstName + " and " + dad.firstName + ". \nYour birthday is " + morri.birthday + ".");
        morri.printStats();
        System.out.println("");

        age++;
        life = true;

        //While loop that continues running as long as the person is alive
        while (life == true) {
            morri.infantYears();
            in.nextLine();
            if (life == false) { //If statement to ensure that the person doesn't progress to the next stage of life if they've died
                break;
            }
            morri.childYears();
            if (life == false) { //If statement to ensure that the person doesn't progress to the next stage of life if they've died
                break;
            }
            morri.teenYears();
            if (life == false) { //If statement to ensure that the person doesn't progress to the next stage of life if they've died
                break;
            }
            morri.uniYears();
            if (life == false) { //If statement to ensure that the person doesn't progress to the next stage of life if they've died
                break;
            }
            morri.adultYears();
            if (life == false) { //If statement to ensure that the person doesn't progress to the next stage of life if they've died
                break;
            }
            morri.middleAgedYears();
            if (life == false) { //If statement to ensure that the person doesn't progress to the next stage of life if they've died
                break;
            }
            break; //If the person is still alive after middle aged years, kill them off regardless
        }

        /*Random deaths are generated and displayed for once the person dies if 
        they die from natural causes (health goes down to 0) */
        if (naturalDeath == true) {
            int rand = (int) (Math.random() * 6 + 1);

            if (rand == 1) {
                System.out.println("You went on a hike alone to a nearby hill, unaware that there is a cliff. "
                        + "\nYou see a pretty bird and run forward to take a picture, however, you stumble on a rock and "
                        + "\nfall off the cliff, resulting in your untimely death.");
            } else if (rand == 2) {
                System.out.println("At your friends house, you tried orange juice for the first time. "
                        + "\nUnbeknownst to you, you are deathly allergic to orange juice and begin convulsing. You die shortly after.");
            } else if (rand == 3) {
                System.out.println("While at home alone, you get a phone call from your friend's number. "
                        + "\nHowever, it is a mysterious man who asks you to answer 3 riddles correctly. "
                        + "\nYou get the first two riddles, but you mess up the third one. You think it's just a game, "
                        + "\nbut once they hang up, you hear commotion in your house. All of a sudden, someone busts through the door. "
                        + "\nYou run away and upon contact, struggle with one another for a bit, but they ultimately beat you and stab you "
                        + "\nin the heart and then in the head. You die.");
            } else if (rand == 4) {
                System.out.println("At the zoo, you are visiting the monkey cage. You get a little close to the monkey cage, "
                        + "\nand the devious baboon throws a banana peel just right so that you slip right into their clutches. "
                        + "\nThey drag you into their cage with surprisingly sharp claws and choke you, saying ooh-ooh-ahh-ahh as you suffocate to death.");
            } else if (rand == 5) {
                System.out.println("You are at a Tim Hortons with your family and you slip on some spilled coffee. "
                        + "\nYou hit your head and bleed out on the floor. You die.");
            } else if (rand == 6) {
                System.out.println("You go to wonderland and run to the Leviathan as fast as possible. "
                        + "\nYou get on the ride, but when you go through the tunnel, you realize that there is a reason for the ride's name. "
                        + "\nA beastly leviathan, taller than the ride itself, bites you from the ear and flies you far away, to its cave within the large mountain at Wonderland. "
                        + "\nIt hangs you upside down for a week until you finally die, and eats you shortly after.");
            }

        }

        System.out.println("You died and lost the game. Press 'C' to continue.");
        String c = in.nextLine();


    }

}
