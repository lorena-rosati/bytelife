package cptlorena;

import java.util.*;

public class Person extends CPTLorena {

    //Choices array lists store choice options to display for each age group
    //Count array lists allow us to keep track of the index of a specific choice to provide an appropriate message given user choice selection
    ArrayList<String> childChoices = new ArrayList();
    ArrayList<Integer> childCount = new ArrayList();
    ArrayList<String> teenChoices = new ArrayList();
    ArrayList<Integer> teenCount = new ArrayList();
    ArrayList<String> uniChoices = new ArrayList();
    ArrayList<Integer> uniCount = new ArrayList();
    ArrayList<String> adultChoices = new ArrayList();
    ArrayList<Integer> adultCount = new ArrayList();
    ArrayList<String> middleAgedChoices = new ArrayList();
    ArrayList<Integer> middleAgedCount = new ArrayList();

    //Empty constructor
    Person() {
    }

    public void generateGender(ArrayList<String> girlNames, ArrayList<String> boyNames) throws InterruptedException {
        //Randomly generates either 1 or 2 to assign gender and then sends the array list of the names associated with that gender to the generateName() method
        int rand = (int) (Math.random() * 2 + 1);
        if (rand == 1) {
            gender = "female";
            generateName(girlNames);
        } else {
            gender = "male";
            generateName(boyNames);
        }
    }

    public void generateName(ArrayList<String> names) {
        int rand = (int) (Math.random() * (names.size() - 1));
        //Generates a random first name given the options within the array list of names
        firstName = names.get(rand);
        lastName = "Morrison";
        //Remove the name from the array list of names so that it is not used again for another person
        if (gender.equals("female")) {
            girlNames.remove(rand);
        } else if (gender.equals("male")) {
            boyNames.remove(rand);
        }
    }

    public void generateBirthplace() {
        String[] birthplaces = {"Richmond Hill", "Aurora", "Thornhill", "Markham", "Newmarket", "Waterloo", "Toronto", "King", "Vaughan"};
        int rand = (int) (Math.random() * (birthplaces.length));
        birthplace = birthplaces[rand];
    }

    public void generateBirthday() {
        //Genereates a number from 1 to 12 associated with each month (randomly generating the month)
        int rand = (int) (Math.random() * 12 + 1);
        if (rand == 1) {
            birthday = "January ";
            rand = (int) (Math.random() * 31 + 1); //Generates the numerical date of the birthday
            birthday += Integer.toString(rand);

        } else if (rand == 2) {
            birthday = "February ";
            rand = (int) (Math.random() * 28 + 1); //Generates the numerical date of the birthday
            birthday += Integer.toString(rand);

        } else if (rand == 3) {
            birthday = "March ";
            rand = (int) (Math.random() * 31 + 1); //Generates the numerical date of the birthday
            birthday += Integer.toString(rand);

        } else if (rand == 4) {
            birthday = "April ";
            rand = (int) (Math.random() * 30 + 1); //Generates the numerical date of the birthday
            birthday += Integer.toString(rand);

        } else if (rand == 5) {
            birthday = "May ";
            rand = (int) (Math.random() * 31 + 1); //Generates the numerical date of the birthday
            birthday += Integer.toString(rand);

        } else if (rand == 6) {
            birthday = "June ";
            rand = (int) (Math.random() * 30 + 1); //Generates the numerical date of the birthday
            birthday += Integer.toString(rand);

        } else if (rand == 7) {
            birthday = "July ";
            rand = (int) (Math.random() * 31 + 1); //Generates the numerical date of the birthday
            birthday += Integer.toString(rand);

        } else if (rand == 8) {
            birthday = "August ";
            rand = (int) (Math.random() * 31 + 1); //Generates the numerical date of the birthday
            birthday += Integer.toString(rand);

        } else if (rand == 9) {
            birthday = "September ";
            rand = (int) (Math.random() * 30 + 1); //Generates the numerical date of the birthday
            birthday += Integer.toString(rand);

        } else if (rand == 10) {
            birthday = "October ";
            rand = (int) (Math.random() * 31 + 1); //Generates the numerical date of the birthday
            birthday += Integer.toString(rand);

        } else if (rand == 11) {
            birthday = "November ";
            rand = (int) (Math.random() * 30 + 1); //Generates the numerical date of the birthday
            birthday += Integer.toString(rand);

        } else if (rand == 12) {
            birthday = "December ";
            rand = (int) (Math.random() * 31 + 1); //Generates the numerical date of the birthday
            birthday += Integer.toString(rand);

        }
    }

    //ages 1-5
    public void infantYears() {

        //Runs infant years until you turn 6
        while (age < 6) {

            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }

            System.out.println("AGE: " + age);

            //Pre-generated messages for each age; no choices from ages 1-5
            if (age == 1) {
                System.out.println("Your sisters are playing football with your tiny football-esque body and accidentally throw you into a pond. \nThey fish you out succesfully, but you hit your head and got a bit sick.");
                health = changeStat(health, -3); //Decreases the health by 3
                smarts = changeStat(smarts, -2);
                if (health == 0) {
                    life = false;
                    break;
                }
                printStats();
                age++;
            } else if (age == 2) {
                System.out.println("You came down with a fever and ended up spending a few days in the ER. \nYou ended up having to get surgery for a mysterious disease that caused your fever.");
                health = changeStat(health, -8);
                if (health == 0) {
                    life = false;
                    break;
                }
                printStats();
                age++;
            } else if (age == 3) {
                System.out.println("You develop an obsession with dog chew toys and refuse to play with human toys. \nYour mom bought you the latest collection of chew toys and you spend a lot of time playing with them! Yay!");
                happiness = changeStat(happiness, 3);
                printStats();
                age++;
            } else if (age == 4) {
                System.out.println("You learn to skate but fall and break your nose. You heal quickly and continue to practice skating, your new hobby!");
                health = changeStat(health, -2);
                looks = changeStat(looks, -3);
                happiness = changeStat(happiness, 3);
                if (health == 0) {
                    life = false;
                    break;
                }
                printStats();
                age++;
            } else if (age == 5) {
                System.out.println("With your new talents in skating, you try your hand at hockey! You love it and join house league. ");
                happiness = changeStat(happiness, 2);
                health = changeStat(health, 2);
                printStats();
                age++;
            }
            System.out.println("");

        }

    }

    //ages 6-13
    public void childYears() throws InterruptedException {

        //Setting up choices (this is same format/logic as the rest of the methods for other sections of life - so would be same comment)
        childChoices.add("You are at the park with your class and find a mysterious powder at the bottom of the slide.\nThe school bully tells you to snort it. Will you do it? (Yes or No)");
        childCount.add(0);

        childChoices.add("A classmate that you have a crush on invites you to a playdate at their house. \nWill you go? (Yes or No)");
        childCount.add(1);

        childChoices.add("Your mom won't let you buy the latest toy. Do you throw a tantrum? (Yes or No)");
        childCount.add(2);

        childChoices.add("Your mom wants you to clean your room before your friends pick you up, but they arrive. \nDo you leave anyway without cleaning your room, knowing that you will be in trouble? (Yes or No)");
        childCount.add(3);

        childChoices.add("While playing at the park with your friend, you see a pile of horse droppings that you \nwant to jump in. Do you jump? (Yes or No)");
        childCount.add(4);

        childChoices.add("You want to get a haircut. Your plan was to describe what you want to the hairdresser, but your mom wants you to find a picture of the haircut to show them. \nDo you look for an example picture to show? (Yes or No)");
        childCount.add(5);

        childChoices.add("You recently got braces. You're not supposed to have gum, \nbut your friend offered you watermelon-flavoured gum, your favourite! Do you chew it anyway? (Yes or No)");
        childCount.add(6);

        childChoices.add("You're hiding in your parents' closet during a game of hide and seek when suddenly, \nyour mother enters the bedroom with a mysterious man, and they begin \nkissing passionately. Do you tell your father? (Yes or No)");
        childCount.add(7);

        childChoices.add("Your parents want to buy you a pet hamster named Peppa. Do you want her? (Yes or No)");
        childCount.add(8);

        childChoices.add("Your teacher recommends you to join the computer science club. \nIt sounds nerdy, but your teacher Mr. Mamir is pressuring you. Do you join? (Yes or No)");
        childCount.add(9);

        //Provides these choices for ages 6-13 (this is same format/logic as the rest of the methods for other sections of life - so would be same comment)
        while (age > 5 && age < 14) {

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

            System.out.println("AGE: " + age);

            //Pre-generated messages for each age (this is same format/logic as the rest of the methods for other sections of life - so would be same comment)
            if (age == 7) {
                System.out.println("You score the winning goal in a hockey game and your team places first in a tournament!");
                happiness = changeStat(happiness, 3);
            } else if (age == 9) {
                System.out.println("You go to Skyzone for your birthday and have lots of fun with your friends!");
                happiness = changeStat(happiness, 2);
            } else if (age == 11) {
                System.out.println("You meet your new friend, Evan Fong. Hopefully the friendship lasts!");
                happiness = changeStat(happiness, 2);
            } else if (age == 13) {
                System.out.println("You chip your tooth playing hockey...");
                looks = changeStat(looks, -2);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            //Randomly generate a choice to display (this is same format/logic as the rest of the methods for other sections of life - so would be same comment)
            int rand = (int) (Math.random() * (childChoices.size() - 1));
            System.out.println(childChoices.get(rand));
            String choice = in.nextLine();

            /*Provides an appropriate message for the user's response to the choice and alters the stats 
            accordingly (this is same format/logic as the rest of the methods for other sections of life - so would be same comment) */
            if (choice.equalsIgnoreCase("yes") && childCount.get(rand) == 0) {
                System.out.println("You snort the powder and end up overdosing on cocaine.");
                health = changeStat(health, -100);
                life = false;
                naturalDeath = false;
                break;
            } else if (choice.equalsIgnoreCase("no") && childCount.get(rand) == 0) {
                System.out.println("You throw the powder in the bully's face, causing him to overdose on cocaine. \nHe dies, but no one witnessed the crime, so you carry this secret with you for the rest of your life. We're sure it won't cause you any trauma... ;D");
                happiness = changeStat(happiness, -5);
                smarts = changeStat(smarts, -5);
            } else if (choice.equalsIgnoreCase("yes") && childCount.get(rand) == 1) {
                System.out.println("You play tag and jump on their trampoline. They kiss you and your dad, who came to pick you up, caught a picture of the kiss. \nThat picture will forever be framed in your house...");
                happiness = changeStat(happiness, 8);
            } else if (choice.equalsIgnoreCase("no") && childCount.get(rand) == 1) {
                System.out.println("Your crush throws a chair at you and tells you that you're ugly and they never liked you anyway. In anger, you cut your bangs, but they turn out very bad.");
                happiness = changeStat(happiness, -7);
                looks = changeStat(looks, -3);
                health = changeStat(health, -5);
                //Check if health == 0 everytime health is decreased (this is same format/logic as the rest of the methods for other sections of life - so would be same comment)
                if (health == 0) {
                    life = false;
                    break;
                }

            } else if (choice.equalsIgnoreCase("yes") && childCount.get(rand) == 2) {
                System.out.println("Your mom grounds you for a month and you become extremely depressed.");
                health = changeStat(health, -5);
                happiness = changeStat(happiness, -8);
                if (health == 0) {
                    life = false;
                    break;
                }

            } else if (choice.equalsIgnoreCase("no") && childCount.get(rand) == 2) {
                System.out.println("You sit in your room and force yourself to calm down. After complaining to your friend, they buy you the toy!");
                smarts = changeStat(smarts, 1);
                happiness = changeStat(happiness, 5);
            } else if (choice.equalsIgnoreCase("yes") && childCount.get(rand) == 3) {
                System.out.println("When you arrive home, you discover that your parents have confiscated all your toys. \nWhen you finally do clean, you discover that there is a terrible termite takeover in your room and \nupon further inspection, your family realizes that there is permanent infrastructure damage to your whole house. You are now homeless. ");
                looks = changeStat(looks, -3);
                happiness = changeStat(happiness, -5);
                health = changeStat(health, -5);
                if (health == 0) {
                    life = false;
                    break;
                }

            } else if (choice.equalsIgnoreCase("no") && childCount.get(rand) == 3) {
                System.out.println("Since you listened to your mom and cleaned your room, she's more willing to let you go out in the future. Maybe you can use that...");
                smarts = changeStat(smarts, 4);
                happiness = changeStat(happiness, 6);
            } else if (choice.equalsIgnoreCase("yes") && childCount.get(rand) == 4) {
                System.out.println("You develop a rare seizure condition and get a big fat rash on your cheek.");
                looks = changeStat(looks, -8);
                happiness = changeStat(happiness, -5);
                smarts = changeStat(smarts, -5);
                health = changeStat(health, -7);
            } else if (choice.equalsIgnoreCase("no") && childCount.get(rand) == 4) {
                System.out.println("You enjoy a fun day at the park and win the 'who can slide down the slide the fastest?' competition! \nYou get 5 shiny rocks as your prize. ");
                smarts = changeStat(smarts, 2);
                happiness = changeStat(happiness, 5);
            } else if (choice.equalsIgnoreCase("yes") && childCount.get(rand) == 5) {
                System.out.println("Everyone compliments your haircut at school and your crush begins sitting beside you in class. \nYou exchange longing looks and they often brush your arm.");
                looks = changeStat(looks, 6);
                happiness = changeStat(happiness, 4);
            } else if (choice.equalsIgnoreCase("no") && childCount.get(rand) == 5) {
                System.out.println("Your haircut looks horrific and you are forced to cut all your hair off. \nYou find out the next day through the chain of gossip that your crush says that your haircut makes you look like an egg.");
                looks = changeStat(looks, -8);
                happiness = changeStat(happiness, -5);
                smarts = changeStat(smarts, -4);
            } else if (choice.equalsIgnoreCase("yes") && childCount.get(rand) == 6) {
                System.out.println("You break your braces and need to begin wearing headgear in addition to your braces. \nFurthermore, you end up in the hospital for a week because, as it turns out, \nyou have a life-threatening allergy to artificial watermelon flavours.");
                looks = changeStat(looks, -5);
                health = changeStat(health, -7);
                smarts = changeStat(smarts, -4);
                happiness = changeStat(happiness, -6);
                if (health == 0) {
                    life = false;
                    break;
                }

            } else if (choice.equalsIgnoreCase("no") && childCount.get(rand) == 6) {
                System.out.println("Your friends think you're a loser for refusing the gum, so you now have no friends. \nHowever, you continue to treat your braces really well and get them off sooner than expected!");
                looks = changeStat(looks, 5);
                happiness = changeStat(happiness, -6);
                smarts = changeStat(smarts, 2);
            } else if (choice.equalsIgnoreCase("yes") && childCount.get(rand) == 7) {
                System.out.println("You tell your father and  your parents end up getting a divorce. ");
                happiness = changeStat(happiness, -6);
                smarts = changeStat(smarts, 2);
            } else if (choice.equalsIgnoreCase("no") && childCount.get(rand) == 7) {
                System.out.println("You distance yourself from your mom and have eternal trauma from seeing your mom with that man.");
                happiness = changeStat(happiness, -8);
            } else if (choice.equalsIgnoreCase("yes") && childCount.get(rand) == 8) {
                System.out.println("You adopt Peppa and she becomes your best friend!");
                happiness = changeStat(happiness, 5);
            } else if (choice.equalsIgnoreCase("no") && childCount.get(rand) == 8) {
                System.out.println("You had a bad day at school and kill Peppa by sitting on her to let out your anger. You feel better afterwards.");
                happiness = changeStat(happiness, 7);
                smarts = changeStat(smarts, -2);
            } else if (choice.equalsIgnoreCase("yes") && childCount.get(rand) == 9) {
                System.out.println("You realize that you love computer science and become a teacher in the computer science club!");
                happiness = changeStat(happiness, 2);
                smarts = changeStat(smarts, 5);
                looks = changeStat(looks, 2);
            } else if (choice.equalsIgnoreCase("no") && childCount.get(rand) == 9) {
                System.out.println("You join the cooking club instead and accidentally start a fire in the kitchen, forcing everyone to evacuate the school.");
                smarts = changeStat(smarts, -6);
                happiness = changeStat(happiness, 2);
            }

            /*After using a choice, remove it from the array list to ensure that it is not presented again 
            (this is same format/logic as the rest of the methods for other sections of life - so would be same comment) */
            childChoices.remove(rand);
            childCount.remove(rand);

            /*Increase the smarts by 2 every year that the person is in school
            (this is same format/logic as the rest of the methods for other sections of life - so would be same comment) */
            smarts = changeStat(smarts, 2);

            printStats();

            if (health == 0) {
                life = false;
                break;
            }

            age++;

            System.out.println("");
        }

    } //close childYears()

    //ages 14-18
    public void teenYears() throws InterruptedException {

        //All the choices and pairing response numbers being added to their respective lists
        teenChoices.add("Your friends want to break into a school bus at midnight, would you like to join them? (Yes or No)");
        teenCount.add(0);

        teenChoices.add("Your friends offer you recreational drugs, do you want to take them up on the offer? (Yes or No)");
        teenCount.add(1);

        teenChoices.add("There is a dance hosted by your school, do you want to take a date? (Yes or No)");
        teenCount.add(2);

        teenChoices.add("You have been asked out to the movies by your crush, do you want to go? (Yes or No)");
        teenCount.add(3);

        teenChoices.add("While you were biking with you friends, you fell over and hurt your leg very bad, do you want to visit the doctor? (Yes or No)");
        teenCount.add(4);

        teenChoices.add("You feel sick and have a fever, you fear it may be Covid. Would you like to quarantine and take a rapid test to be safe? (Yes or No)");
        teenCount.add(5);

        teenChoices.add("Your hair is becoming a mess and hard to maintain. Would you like to go to the hair salon? (yes or No)");
        teenCount.add(6);

        teenChoices.add("You have been growing a lot and need a new wardrobe. Would you like to go shopping? (Yes or No)");
        teenCount.add(7);

        teenChoices.add("Your friends have invited you to go to a restaurant with them, \nbut you have an important math test coming up. \nDo you still want to going to go out with your friends? (Yes or No)");
        teenCount.add(8);

        teenChoices.add("You have been thinking of changing up your look, but are not sure how. \nYou discover that your classmates are going to get tattoos and have invited you to join them. Do you want to join them? (Yes or No)");
        teenCount.add(9);

        //A condition based on whether the user has health = 0
        while (age > 13 && age < 19) {

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

            System.out.println("AGE: " + age);

            if (age == 14) {
                System.out.println("You started highschool at St. Theresa of Lisieux CHS.");
            } else if (age == 15) {
                System.out.println("Your new gym teacher, Mr. Tonon, has been giving you a hard time and making you do extra laps. \nAlthough you are furious with him, you have never been in better shape. \nOne day you will have your revenge, you just need the perfect opportunity.");
            } else if (age == 16) {
                System.out.println("Your new bio teacher, Ms. Carafa, has been growing your interest in the subject quite a lot. \nMaybe you could consider a future in the bio field.");
            } else if (age == 17) {
                System.out.println("The dreaded calculus course has finally arrive and you are not excited about your teacher, Mr. Correia's, teaching style. \nYou are just hoping that there are no gaps in your knowledge when its all over. ");
            } else if (age == 18) {
                System.out.println("It's time to apply for university! \nWould you like to major in kinesiology or computer science? (kin or compsci)");
                String input = in.nextLine();
                if (input.equalsIgnoreCase("kin")) {
                    System.out.println("You're off to begin your university journey at Brock!");
                } else if (input.equalsIgnoreCase("compsci")) {
                    System.out.println("You wanted to study computer science at Waterloo, but the school tragically burned down, \ntaking the lives of your two best friends. As a result, you are forced to take your second choice \nand will be attending Brock University for kinesiology. You're excited!");
                    happiness = changeStat(happiness, -7);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            int rand = (int) (Math.random() * (teenChoices.size() - 1));

            System.out.println(teenChoices.get(rand));

            String choice = in.nextLine();

            if (choice.equalsIgnoreCase("yes") && teenCount.get(rand) == 0) {
                System.out.println("You had a fun time with your friends but ran into a police officer and had to run away.");

                happiness = changeStat(happiness, 10);
                smarts = changeStat(smarts, -5);

            } else if (choice.equalsIgnoreCase("no") && teenCount.get(rand) == 0) {

                System.out.println("You chose not to go and heard of the fun time your friends had. \nYou also heard about their run in with law enforcement and ended up being happy with your choice. ");

                happiness = changeStat(happiness, 3);
                smarts = changeStat(smarts, 5);

            } else if (choice.equalsIgnoreCase("yes") && teenCount.get(rand) == 1) {

                System.out.println("You had a great time at the beginning but soon lost conciousness and ended up not remembering much.\nIt was not a bad experiment but you will most likely never do it again.");

                happiness = changeStat(happiness, 4);
                smarts = changeStat(smarts, -5);
                health = changeStat(health, -4);
                if (health == 0) {
                    life = false;
                    break;
                }

            } else if (choice.equalsIgnoreCase("no") && teenCount.get(rand) == 1) {
                System.out.println("You passed up on the offer made to you by your peers.\nThey seem to be a little more distant afraid you might snitch on them.");

                happiness = changeStat(happiness, -4);
                smarts = changeStat(smarts, 4);

            } else if (choice.equalsIgnoreCase("yes") && teenCount.get(rand) == 2) {
                System.out.println("You ask your crush to the dance, and to your surprise, they say yes.\nYou two dance and talk all night, resulting in a great experience.");

                happiness = changeStat(happiness, 10);
                looks = changeStat(looks, 4);
                health = changeStat(health, 2);

            } else if (choice.equalsIgnoreCase("no") && teenCount.get(rand) == 2) {
                System.out.println("You did not ask anyone and your crush ended up going with someone else. \nYou had some fun with your friends, but ended up watching your crush dance with someone else. \nThe whole experience could have gone better.");

                happiness = changeStat(happiness, 3);
                health = changeStat(health, -2);
                if (health == 0) {
                    life = false;
                    break;
                }

            } else if (choice.equalsIgnoreCase("yes") && teenCount.get(rand) == 3) {
                System.out.println("You chose to go to the movies with your crush. \nYou guys watched the movie, ate snacks, and got to know each other better. \nWho knows, maybe this will go somewhere...");

                happiness = changeStat(happiness, 5);
                health = changeStat(health, 1);

            } else if (choice.equalsIgnoreCase("no") && teenCount.get(rand) == 3) {
                System.out.println("You rejected the offer, causing your crush to never speak to you again. \nYou now have crippling depression.");

                happiness = changeStat(happiness, -10);
                health = changeStat(health, -5);
                if (health == 0) {
                    life = false;
                    break;
                }

            } else if (choice.equalsIgnoreCase("yes") && teenCount.get(rand) == 4) {
                System.out.println("You have fractured the growth plate on your knee.\nYou will have to use crutches for 4 months, but you will heal soon enough.");

                happiness = changeStat(happiness, -3);
                health = changeStat(health, -3);
                if (health == 0) {
                    life = false;
                    break;
                }

            } else if (choice.equalsIgnoreCase("no") && teenCount.get(rand) == 4) {
                System.out.println("The pain in your leg kept getting worse until it was unbearable. \nYou ended up going to the doctor anyway but now you have a completely broken leg and infection.\nYou will have to wear a cast for the rest of the year.");

                happiness = changeStat(happiness, -4);
                health = changeStat(health, -6);
                if (health == 0) {
                    life = false;
                    break;
                }

            } else if (choice.equalsIgnoreCase("yes") && teenCount.get(rand) == 5) {
                System.out.println("You decided to take the rapid test, and after the test you discovered that you are positive. \nSince you quarantined early you did not pass it on to your family. \nYou will recover in 1 week.");

                happiness = changeStat(happiness, -1);
                smarts = changeStat(smarts, 4);

            } else if (choice.equalsIgnoreCase("no") && teenCount.get(rand) == 5) {
                System.out.println("Your condition continued to get worse and you were taken to the ICU. \nYou passed away shortly from COVID in York General Hospital. \nLife really does go full circle.");

                health = changeStat(health, -100);
                life = false;
                naturalDeath = false;
                break;

            } else if (choice.equalsIgnoreCase("yes") && teenCount.get(rand) == 6) {
                System.out.println("You're looking better than ever with your new hairstyle. \nYou might even test your luck with your crush. ");

                looks = changeStat(looks, 10);

            } else if (choice.equalsIgnoreCase("no") && teenCount.get(rand) == 6) {
                System.out.println("You have chosen to allow your hair to get untamed. You might consider changing it up in the future if you want to increase your charms.");

                looks = changeStat(looks, 10);

            } else if (choice.equalsIgnoreCase("yes") && teenCount.get(rand) == 7) {
                System.out.println("You decided to purchase some new clothes to update your style. Looking better than ever, you can move forward with a little more confidence.");

                looks = changeStat(looks, 10);
                happiness = changeStat(happiness, 6);

            } else if (choice.equalsIgnoreCase("no") && teenCount.get(rand) == 7) {
                System.out.println("You have chosen to be a cheapskate and opted to keep your wardrobe the same. You will have to loosen your purse strings ");

                looks = changeStat(looks, 10);

            } else if (choice.equalsIgnoreCase("yes") && teenCount.get(rand) == 8) {
                System.out.println("You enjoyed a hearty meal with your friends and spent some quality time with them. \nHowever, you did end up failing your test");

                happiness = changeStat(happiness, 5);
                smarts = changeStat(smarts, -5);

            } else if (choice.equalsIgnoreCase("no") && teenCount.get(rand) == 8) {
                System.out.println("You ended up staying at home and studying for your test. \nAlthough not as fun, IT WAS WORTH IT, you ended up acing the test and raising your grade significantly!");

                smarts = changeStat(smarts, 10);

            } else if (choice.equalsIgnoreCase("yes") && teenCount.get(rand) == 9) {
                System.out.println("You agreed to go get a tattoo of your partner, Maia's, name, however, the tattoo artist, Loreina, spelled her name wrong. \nCoincidentally, it was spelled 'Mya', which is the same spelling as your ex's name. You are now single and have crippling depression.");

                happiness = changeStat(happiness, -6);
                smarts = changeStat(smarts, -4);
                looks = changeStat(looks, -4);

            } else if (choice.equalsIgnoreCase("no") && teenCount.get(rand) == 9) {
                System.out.println("Because you rejected their offer, a lot of your friends now think you are a loser. Your popularity has plummeted.");

                happiness = changeStat(happiness, -3);
                smarts = changeStat(smarts, 4);
            }

            teenChoices.remove(rand);
            teenCount.remove(rand);

            //Decrease the health by 1 each year
            health = changeStat(health, -1);
            smarts = changeStat(smarts, 2);

            printStats();

            if (health == 0) {
                life = false;
                break;
            }

            age++;

            System.out.println("");

        }

    } //Closes teen years

    //ages 19-22
    public void uniYears() throws InterruptedException {

        //Setting up choices
        uniChoices.add("Your friends decide to visit a nature area nearby with a cliff for some exhilarating cliff jumping. \nHowever, when you arrive, you discover that it is closed off to the public due to safety reasons. \nYour friends jump anyway. Do you jump? (Yes or No)");
        uniCount.add(0);

        uniChoices.add("At a college party, you're invited by your new friends to smoke some weed in the back. \nYou don't want to, but you want to make a good impression and fit in. Do you participate? (Yes or No)");
        uniCount.add(1);

        uniChoices.add("You've been drinking every weekend and have finally admitted to yourself that you're an alcoholic. \nDo you seek help? (Yes or No)");
        uniCount.add(2);

        uniChoices.add("You're taking an elective that is proving to be much more difficult than expected. \nDo you drop the course? (Yes or No)");
        uniCount.add(3);

        uniChoices.add("It's midterm season! You suck at physics but you need it to graduate. \nDo you study for your physics exam? (Yes or No)");
        uniCount.add(4);

        while (age > 18 && age < 23) {

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

            System.out.println("AGE: " + age);

            if (age == 19) {
                System.out.println("You've started your first year at Brock University. ");
            } else if (age == 21) {
                System.out.println("You get drunk on your 21st birthday and steal a cone. It is now a centerpiece in your house.");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            int rand = (int) (Math.random() * (uniChoices.size() - 1));
            System.out.println(uniChoices.get(rand));
            String choice = in.nextLine();

            if (choice.equalsIgnoreCase("yes") && uniCount.get(rand) == 0) {
                System.out.println("You jump and luckily, you miss the rocks and enjoy a fun evening with your friends!");
                smarts = changeStat(smarts, -2);
                happiness = changeStat(happiness, 2);
            } else if (choice.equalsIgnoreCase("no") && uniCount.get(rand) == 0) {
                System.out.println("Your friends get mad at you for being a party pooper and push you off the cliff. You hit the rocks in the water and die upon impact.");
                health = changeStat(health, -100);
                life = false;
                naturalDeath = false;
                break;
            } else if (choice.equalsIgnoreCase("yes") && uniCount.get(rand) == 1) {
                System.out.println("Upon smoking weed, you learn the hard way that you have a weed allergy and begin convulsing on the floor. You suffocate and die.");
                health = changeStat(health, -100);
                life = false;
                naturalDeath = false;
                break;
            } else if (choice.equalsIgnoreCase("no") && uniCount.get(rand) == 1) {
                System.out.println("You lose those friends, but are happy you made the right choice. \nYou make new friends who don't smoke weed, but drink alot, and you become an alcoholic.");
                happiness = changeStat(happiness, 3);
                health = changeStat(health, -4);
                smarts = changeStat(smarts, 2);
                looks = changeStat(looks, -1);
                if (health == 0) {
                    life = false;
                    break;
                }
            } else if (choice.equalsIgnoreCase("yes") && uniCount.get(rand) == 2) {
                System.out.println("You go to a therapist, and they help you work through your deep-rooted issues that cause you to drink. You end up happier than ever. ");
                happiness = changeStat(happiness, 5);
                health = changeStat(health, 5);
            } else if (choice.equalsIgnoreCase("no") && uniCount.get(rand) == 2) {
                System.out.println("Your liver fails and you need to get a liver transplant. You spent a few months in the hospital and vow never to take a sip of alcohol again. \nWe'll see if you actually stand by that vow...");
                health = changeStat(health, -6);
                happiness = changeStat(happiness, -3);
                looks = changeStat(looks, -3);
                if (health == 0) {
                    life = false;
                    break;
                }
            } else if (choice.equalsIgnoreCase("yes") && uniCount.get(rand) == 3) {
                System.out.println("You drop the course, but it turns out that it's a requirement for your degree. You have to take it again.");
                happiness = changeStat(happiness, -2);
                smarts = changeStat(smarts, -2);
            } else if (choice.equalsIgnoreCase("no") && uniCount.get(rand) == 3) {
                System.out.println("You meet a new friend in the course, but the course causes you depression and, in a fit of anger, you kick your friend in the face.");
                smarts = changeStat(smarts, 2);
                happiness = changeStat(happiness, -2);
            } else if (choice.equalsIgnoreCase("yes") && uniCount.get(rand) == 4) {
                System.out.println("You study, and do amazing! This sparks your interest in STEM and gets you thinking - is kinesiology right for me?");
                happiness = changeStat(happiness, 2);
                smarts = changeStat(smarts, 4);
            } else if (choice.equalsIgnoreCase("no") && uniCount.get(rand) == 4) {
                System.out.println("You do terrible, and hate STEM even more. However, you still have a growing interest in technology regardless...");
                smarts = changeStat(smarts, -2);
                happiness = changeStat(happiness, -3);
            }

            uniChoices.remove(rand);
            uniCount.remove(rand);

            health = changeStat(health, -1);
            smarts = changeStat(smarts, 2);

            printStats();

            if (health == 0) {
                life = false;
                break;
            }

            age++;

            System.out.println("");
        }

    }//Closes uni years

    //ages 23-40
    public void adultYears() throws InterruptedException {

        adultChoices.add("You have been looking for a side job to make more money and come across a great oppportunity \n to work as a waiter at Kelseys. Do you take the offer? (Yes or No)");
        adultCount.add(0);

        adultChoices.add("You are taking an online course to help your teaching degree. \nYou have a final coming up soon but your sister has invited you out for drinks to celebrate a new promotion. \nWill you go out with her? (Yes or No)");
        adultCount.add(1);

        adultChoices.add("You have been looking for a way to increase intellectual capabilities and had an interactive game recommended to you by your friend. \nThe game is supposed to help you increase your problem solving skills and overall brain function. Do you want to get the game? (Yes or No)");
        adultCount.add(2);

        adultChoices.add("You have noticed a weird spot on the right side of your ribcage. \nIt could be Nothing, but it could be something. \nWould like like to plan a visit to the dermatologist? (Yes or No)");
        adultCount.add(3);

        adultChoices.add("Recent events have made you question your looks. \nIn a very irrational state of mind, you have ended up in a plastic surgeon's office. \nNow you are contemplating whether you should get plastic surgery. \nDo you follow through with the surgery? (Yes or No)");
        adultCount.add(4);

        adultChoices.add("The lonely struggles of working and studying have started to get to you. \nA loyal companion could be nice, would you like to adopt a pet? (Yes or No)");
        adultCount.add(5);

        adultChoices.add("To deal with the struggles of adulthood, you have started to drink pretty heavily. \nYour friends and family are worried about you and ask you to go to AA meetings. \nDo you want to start attending the meetings? (Yes or No)");
        adultCount.add(6);

        adultChoices.add("Your co-workers have invited you to their adult hockey league. \nThey play on the weekends so it should not conflict with your work too much. \nDo you want to join the league? (Yes or No)");
        adultCount.add(7);

        adultChoices.add("You have been looking for new hobbies to keep you busy during your spare time. \nYour sister has suggested crocheting as she believes it is just what you need. \nDo you take her up on the offer teach you? (Yes or No)");
        adultCount.add(8);

        adultChoices.add("While you are out hiking with your friends you come across a bee. \nYou have two options, you hold your breath and stand still until it goes away or you try to swat it. \nDo you choose to swat it? (Yes or No)");
        adultCount.add(9);

        while (age > 22 && age < 41) {

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

            System.out.println("AGE: " + age);

            switch (age) {
                case 23:
                    System.out.println("You have graduated from Brock University with a Kinesiology degree. You are now ready to enter the work force!");
                    break;
                case 24:
                    System.out.println("After teacher's college, you remark that you have wanted to increase your knowledge for a while and remembered your interest in computer science.\nYou decide to take additional courses in computer science to give you a wider range of opportunities for teaching, \nand find out that you have a strong passion for the subject!");
                    break;
                case 25:
                    System.out.println("You have gotten your first teaching position at your old high school. \nIt is your first official job as a part-time teacher so you are excited to see where it takes you.");
                    smarts = changeStat(smarts, 2);
                    break;
                case 27:
                    System.out.println("You recieved your first official job as a computer science teacher at Our Lady Queen of the World Catholic Academy.");
                    smarts = changeStat(smarts, 2);
                    break;
                case 29:
                    System.out.println("You coached the school baseball team at OLQWCA and went all the way to the finals. \nWith a tragic loss you placed second, however, it was an impressive season nevertheless. ");
                    happiness = changeStat(happiness, 2);
                    break;
                case 33:
                    System.out.println("The robotics team went to the international finals and got to compete in Tokyo. \nAfter a day of travel you headed to the competition and dominated the other team. \nA peak in your teaching career thus far.");
                    happiness = changeStat(happiness, 8);
                    break;
                case 31:
                    System.out.println("At a friendly gathering you end up meeting Jordan. You fall madly in love an decide to elope. \nWithin 9 months, you already have your first child. You are excited to start your new life.");
                    happiness = changeStat(happiness, 5);
                    break;
                case 35:
                    System.out.println("At your child's second birthday, you throw a big pool party for all of the family. \nEverything was going well until you slipped and fracture your hip. Your officially getting old.");
                    health = changeStat(health, -4);
                    break;
                case 37:
                    System.out.println("Having the most experience and prowess within your faculty, you have been promoted to the head of the department. \nThis is a great new opportunity for you with the bonus of a bigger paycheck, but the added responsibility as well.");
                    smarts = changeStat(smarts, 2);
                    break;
                case 39:
                    System.out.println("You had your second child and are excited to give your first child a younger sibling. Truly a high point in your life.");
                    happiness = changeStat(happiness, 3);
                    break;
                default:
                    break;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            if (age % 2 == 0) {
                int rand = (int) (Math.random() * (adultChoices.size() - 1));

                System.out.println(adultChoices.get(rand));

                String choice = in.nextLine();

                if (choice.equalsIgnoreCase("yes") && adultCount.get(rand) == 0) {
                    System.out.println("You chose to take the job and make a lot of extra money! Maybe now you can start gambling...");

                    happiness = changeStat(happiness, 2);
                    smarts = changeStat(smarts, 4);

                } else if (choice.equalsIgnoreCase("no") && adultCount.get(rand) == 0) {

                    if (gender.equalsIgnoreCase("male")) {
                        System.out.println("You declined the position at the restaurant. \nYou are still in need of a job to make some money, but the sperm bank will have to do for now.");
                    } else {
                        System.out.println("You declined the position at the restaurant. \nYou are still in need of a job to make some money, but the strip club will do for now.");
                    }

                    smarts = changeStat(smarts, -2);

                } else if (choice.equalsIgnoreCase("yes") && adultCount.get(rand) == 1) {
                    System.out.println("You decided to go out with your sister for drinks. You had a fun nights and celebrated her accomplishment, \nbut you did end up failing the upcoming assessment which lead to you failing the entire course. \nMaybe your next online course should be on time management instead.");

                    happiness = changeStat(happiness, 1);
                    smarts = changeStat(smarts, -3);

                } else if (choice.equalsIgnoreCase("no") && adultCount.get(rand) == 1) {
                    System.out.println("You chose to prioritize your upcoming assessment and it paid off. \nYou got a great mark and finished off the course with an outstanding grade. \nHowever, your sister has not talked to you since you bailed on her, \nyou should probably use your newly found freetime to mend the relationship.");

                    happiness = changeStat(happiness, -2);
                    smarts = changeStat(smarts, 4);

                } else if (choice.equalsIgnoreCase("yes") && adultCount.get(rand) == 2) {
                    System.out.println("After deciding to get the game, you get hooked. You find a new passion for games and you can sense your intelligence increasing with every time you play. \nSoon you will be able to take over the world with your intelligence, just gotta continue playing.");

                    happiness = changeStat(happiness, 2);
                    smarts = changeStat(smarts, 4);

                } else if (choice.equalsIgnoreCase("no") && adultCount.get(rand) == 2) {
                    System.out.println("You did not take your friends personal recommendation, however, gaming did sound intriguing. You choose to purchase a different and more popular game to see how it goes. \nBefore you know it, you're addicted. You spend night and day held up in your room playing games and surviving on red bull and instant noodles. ");

                    happiness = changeStat(happiness, -2);
                    smarts = changeStat(smarts, -3);                    
                    health = changeStat(health, -3);

                } else if (choice.equalsIgnoreCase("yes") && adultCount.get(rand) == 3) {
                    System.out.println("During your visit to the dertamologist you are told that the spot on your ribcage is actually a third nipple. \nIt serves no purpose but its an interesting conversation starter in the bedroom. ");

                    health = changeStat(health, 2);
                    smarts = changeStat(smarts, 2);

                } else if (choice.equalsIgnoreCase("no") && adultCount.get(rand) == 3) {
                    System.out.println("You avoid going to the dermatologist and continue to worry about the spot you found. \nEventually the stress gives you really bad acne, forcing you to the dermatologist anyway. \nIt appears that the spot was a benign tumor that needs to get removed. Surgery was not an enjoyable experience.");

                    health = changeStat(health, -2);
                    smarts = changeStat(smarts, -2);
                    looks = changeStat(looks, -2);
                    if (health == 0) {
                        life = false;
                        break;
                    }

                } else if (choice.equalsIgnoreCase("yes") && adultCount.get(rand) == 4) {
                    System.out.println("You commit to the plastic surgery and choose to get a brazilian butt lift. \nFeeling better than ever you go back to into the world, hoping the recovery will be smooth and easy.");

                    health = changeStat(health, -2);
                    looks = changeStat(looks, 8);
                    if (health == 0) {
                        life = false;
                        break;
                    }

                } else if (choice.equalsIgnoreCase("no") && adultCount.get(rand) == 4) {
                    System.out.println("You chose to save some money by bailing on the surgery. \nHowever, you are still self conscious about your appearance. \nEventually you choose to sign up for a gym and get into shape to \nimprove your looks and make you healthier in the process. ");

                    happiness = changeStat(happiness, -3);
                    looks = changeStat(looks, 2);
                    health = changeStat(health, 4);

                } else if (choice.equalsIgnoreCase("yes") && adultCount.get(rand) == 5) {
                    System.out.println("You decided to get a pet. After some research you ended up choosing to get an alpaca named Arthur. \nHe brings lots of joy to your life, which makes all the feces on the floor all worth it. ");

                    happiness = changeStat(happiness, 5);
                    health = changeStat(health, -2);
                    if (health == 0) {
                        life = false;
                        break;
                    }

                } else if (choice.equalsIgnoreCase("no") && adultCount.get(rand) == 5) {
                    System.out.println("You chose not to get a pet. The lack of companionship has made you spiral into depression. \nIn an attempt to fill the void, you befriend the racoon that lives on your street.\nOne particularily sad day you go to hug it and it bites you. You now have rabies. ");

                    happiness = changeStat(happiness, -3);
                    health = changeStat(health, -5);
                    if (health == 0) {
                        life = false;
                        break;
                    }

                } else if (choice.equalsIgnoreCase("yes") && adultCount.get(rand) == 6) {
                    System.out.println("You begin attending AA meetings to help your drinking problem. \nThe meetings help you slowly get over your alcoholism and introduce you to new people. \nA few months in, you meet a childhood friend and catch up with one another. \nIts a relationsip worth exploring, lets see where it goes.");

                    happiness = changeStat(happiness, 3);
                    smarts = changeStat(smarts, 2);
                    health = changeStat(health, 3);

                } else if (choice.equalsIgnoreCase("no") && adultCount.get(rand) == 6) {
                    System.out.println("Your drinking problem continues to get worse and you grow fruther and further apart from your friends and family. \nThey eventually try to force you into rehab but you resist and end up causing a car crash. \nYou put youself and your entire family into the hospital, causing them to resent you. ");

                    happiness = changeStat(happiness, -4);
                    smarts = changeStat(smarts, -2);
                    health = changeStat(health, -5);
                    if (health == 0) {
                        life = false;
                        break;
                    }

                } else if (choice.equalsIgnoreCase("yes") && adultCount.get(rand) == 7) {
                    System.out.println("You joined the workplace hockey league, playing every friday night. \nSoon you became the mvp and carried your team to the top of the leaderboards. \nIt was a great experience and has made you consider exploring other hobbies.");

                    happiness = changeStat(happiness, 3);
                    health = changeStat(health, 2);

                } else if (choice.equalsIgnoreCase("no") && adultCount.get(rand) == 7) {
                    System.out.println("Deciding to not participate in the hockey league means you had to hear about all of the fun that your coworkers \nhad without you. Missing out also meant you had no exercise at all and slowly started to get fat. \nYour coworkers have started to disclude you from group events and activites making work unenjoyable as a whole.");

                    happiness = changeStat(happiness, -3);
                    health = changeStat(health, -3);
                    looks = changeStat(looks, -3);
                    if (health == 0) {
                        life = false;
                        break;
                    }

                } else if (choice.equalsIgnoreCase("yes") && adultCount.get(rand) == 8) {
                    System.out.println("You choose to take up crocheting as a hobby. It ends up being much more enjoyable than you thought. \nIt has helped with your stresses, anxieties, and boredom in addition to giving you a good excuse to bond with your sister. \nIt has been an overall good pastime and your new crochet elephant agrees.");

                    happiness = changeStat(happiness, 5);
                    health = changeStat(health, 1);

                } else if (choice.equalsIgnoreCase("no") && adultCount.get(rand) == 8) {
                    System.out.println("You rejected your sisters kind offer. \nNow with severe boredom and an annoyed sister you need to come up with a solution to both problems. \nYou decide to take up horseback riding and ask your sister to join you as a shared hobby. \nSeems like a perfect solution until you fall of your horse one day andd get trampled. \nYour face and body get messed up pretty bad. Maybe outdoor activities aren't for you. ");

                    health = changeStat(health, -5);
                    looks = changeStat(looks, -4);
                    if (health == 0) {
                        life = false;
                        break;
                    }

                } else if (choice.equalsIgnoreCase("yes") && adultCount.get(rand) == 9) {
                    System.out.println("You attempt to swat the bee but you miss. Having infuriated the bee you get stung. \nAs chance would have it, you are deathly allergic to bee stings and end up dying from anaphlactic shock. ");

                    health = changeStat(health, -100);
                    life = false;
                    naturalDeath = false;
                    break;

                } else if (choice.equalsIgnoreCase("no") && adultCount.get(rand) == 9) {
                    System.out.println("In an attempt to make the bee go away, you hold your breath and stand still. \nIt pays off and the bee moves on but you get made fun of for looking stupid and being afraid of bees by your friends. Either way you are glad that you were not stung.");

                    happiness = changeStat(happiness, -2);
                    smarts = changeStat(smarts, 2);

                }

                adultChoices.remove(rand);
                adultCount.remove(rand);

            }

            //Decrease the health by 2 and looks by 1 each year
            health = changeStat(health, -2);
            looks = changeStat(looks, -1);

            printStats();

            if (health == 0) {
                life = false;
                break;
            }

            age++;

            System.out.println("");

        }
    }//closes adult years

    //ages 41-50
    public void middleAgedYears() throws InterruptedException {

        middleAgedChoices.add("After many years of hard work and saving up, you have finally saved up enough to by something nice for yourself. \nYour first thought is to buy a new sports car that would leave all the teenagers in the dust but you are not sure. \nWould you like to buy a new sports car? (Yes or No)");
        middleAgedCount.add(0);

        middleAgedChoices.add("It is nearing the end of the school year and you have left all of your marking to the last week. \nDo you want to stay up for the next 3 nights and catch up? (Yes or No)");
        middleAgedCount.add(1);

        middleAgedChoices.add("Your sister is getting married and you are considering doing something special as her older sibling. \nWould you like to take piano lesson to be able to serenade your sister as she walks down the aisle? (Yes or No)");
        middleAgedCount.add(2);

        middleAgedChoices.add("After a long look in the mirror, you started to notice some white hairs starting to take root. \nYou fear it may make you seem old but are aware of existing remedies. \nWould you like to start colouring your hair to maintain your young appearance? (Yes or No)");
        middleAgedCount.add(3);

        middleAgedChoices.add("Your friend has recently bought a new home and is planning to move shortly. \nThey request your help, amongst others, to help them move. Will you help your friend out? (Yes or No)");
        middleAgedCount.add(4);

        middleAgedChoices.add("There has been some striking pain in your abdomin. After some research on WebMD, you are told that you have cancer. \nWould you like to visit the doctor to make sure? (Yes or No)");
        middleAgedCount.add(5);

        middleAgedChoices.add("Your doctor has recommended reading books as a pastime to increase brain functions as you age through your middle ages. \nWill you listen to your doctor's recommendation? (Yes or No)");
        middleAgedCount.add(6);

        middleAgedChoices.add("You had a minor fall down the stairs which left a few bruises. Normally not an issue, however, \nthe bruises have been there a while. You are not sure if that is concerning or not. \nWould you like to look into it? (Yes or No)");
        middleAgedCount.add(7);

        middleAgedChoices.add("Your nieces and newphews have been making fun of your wardrobe lately. They offer to go shopping with you. \nDo you take them up on the offer to give you a make over? (Yes or No)");
        middleAgedCount.add(8);

        middleAgedChoices.add("You have noticed that your student have been more stressed than usual. A colleague recommends planning a field trip. \nAlthough there can be complications it sounds like a great idea. Would you like to plan a field trip? (Yes or No)");
        middleAgedCount.add(9);

        while (age > 40 && age < 51) {

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

            System.out.println("AGE: " + age);

            switch (age) {
                case 41:
                    System.out.println("You have entered your middle aged years. Hope you make it through to the end.");
                    break;
                case 43:
                    System.out.println("After a difficult year of hard work you were given a gift by your students. \nSeeing your struggle with your old computer, they banded together and raised enough money to purchase you a new one. \nYou got to build the super computer with them and enjoy bonding time in addition to recieving the greatest gift ever.");
                    happiness = changeStat(happiness, 4);
                    break;
                case 45:
                    System.out.println("After 2 decades of work, you have finally been giving a job as the principal of OLQWCA. \nIt is a great honour and the final step in your career.");
                    smarts = changeStat(smarts, 2);
                    break;
                case 47:
                    System.out.println("Due to an unfortunate accident, one of your friends lost their life. \nThey had a beautiful ceremony and will be forever remembered.");
                    happiness = changeStat(happiness, -5);
                    break;
                case 49:
                    System.out.println("Your first grandchild has been born. It is one of the most joyous times of your life. \nYou can't wait to watch them grow up.");
                    happiness = changeStat(happiness, 3);
                    break;
                default:
                    break;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            if (age % 2 == 0) {
                int rand = (int) (Math.random() * (middleAgedChoices.size() - 1));

                System.out.println(middleAgedChoices.get(rand));

                String choice = in.nextLine();

                if (choice.equalsIgnoreCase("yes") && middleAgedCount.get(rand) == 0) {
                    System.out.println("You bought yourself a new sports car, and as you suspected, you're undefeated on the streets. \nAlthough it was expensive, it was well worth it.");

                    happiness = changeStat(happiness, 5);
                    smarts = changeStat(smarts, -3);

                } else if (choice.equalsIgnoreCase("no") && middleAgedCount.get(rand) == 0) {
                    System.out.println("You chose to save money instead of buying a new car. Ironically your old car ended up breaking down. \nIn doing so, you ended up flying through the windshield when you crashed into another car. \nGetting a new car doesn't seem so bad now");

                    happiness = changeStat(happiness, -3);
                    smarts = changeStat(smarts, 3);
                    health = changeStat(health, -3);
                    if (health == 0) {
                        life = false;
                        break;
                    }

                } else if (choice.equalsIgnoreCase("yes") && middleAgedCount.get(rand) == 1) {
                    System.out.println("You did the responsible thing and stayed up for three nights in a row to mark the assignments on time. \nThe sleep deprivation got to you on the 4 day and caused you to pass out an hti your head on a table. \nYou now have a concussion. Should've marked them on time in the first place.");

                    health = changeStat(health, -3);
                    smarts = changeStat(smarts, 3);
                    if (health == 0) {
                        life = false;
                        break;
                    }

                } else if (choice.equalsIgnoreCase("no") && middleAgedCount.get(rand) == 1) {
                    System.out.println("You prioritized your beauty sleep over your duties as a teacher. Confident there will be little to no precautions, \nyou head to school on report card day as normal. Little did you know that your students wrote a formal complaint. \nWith classfuls of upset parents things escalated and caused you to get fired. ");

                    happiness = changeStat(happiness, -4);
                    smarts = changeStat(smarts, -3);

                } else if (choice.equalsIgnoreCase("yes") && middleAgedCount.get(rand) == 2) {
                    System.out.println("You took private piano lessons to be able to perform for your sister's special day. \nShe really appreciated the gesture and you greatly enjoyed seeing her excitement when she first saw you. \nThe results were worth every penny. ");

                    happiness = changeStat(happiness, 5);
                    smarts = changeStat(smarts, 3);

                } else if (choice.equalsIgnoreCase("no") && middleAgedCount.get(rand) == 2) {
                    System.out.println("You chose to simply attend the wedding as a supporting sibling without any special surprises. \nHowever, your sister was disappointed that you did not play a bigger role at her wedding being her older sibling. \nThat made you feel guilty anf ruined your mood a little.");

                    smarts = changeStat(smarts, -3);
                    happiness = changeStat(happiness, -3);

                } else if (choice.equalsIgnoreCase("yes") && middleAgedCount.get(rand) == 3) {
                    System.out.println("The final verdict was to begin recolouring your hair. The results were phenomenal. \nYou look ten years younger and have had better luck with the opposite gender ever since. Your confidence has increased.");

                    happiness = changeStat(happiness, 3);
                    looks = changeStat(looks, 5);

                } else if (choice.equalsIgnoreCase("no") && middleAgedCount.get(rand) == 3) {
                    System.out.println("You opted to let nature take its course and accepted your gray hairs. They still make you look older than you are. \nAlthough your looks are not benefiting, you are still happy with your decision.");

                    happiness = changeStat(happiness, 2);
                    looks = changeStat(looks, -4);

                } else if (choice.equalsIgnoreCase("yes") && middleAgedCount.get(rand) == 4) {
                    System.out.println("You chose to help your friend out. In return you were provided with food and an invitation to their house warming party. \nYou had a great time socializing with your coworkers and partying.");

                    happiness = changeStat(happiness, 3);

                } else if (choice.equalsIgnoreCase("no") && middleAgedCount.get(rand) == 4) {
                    System.out.println("You decided to be lazy and a bad coworker. Your transgressions have lead to you being discluded from work events. \nThis included the recent house warming party. Work has become awkward and embarassing, might have to be kinder next time.");

                    happiness = changeStat(happiness, -3);

                } else if (choice.equalsIgnoreCase("yes") && middleAgedCount.get(rand) == 5) {
                    System.out.println("After a visit to your doctor, you find out that you are cancer free, however you have a kidney infection. \nYou are now on antibiotics with an estimated 3 months recovery time. You are still happy that you visited the doctor.");

                    happiness = changeStat(happiness, 2);
                    health = changeStat(health, -3);
                    if (health == 0) {
                        life = false;
                        break;
                    }

                } else if (choice.equalsIgnoreCase("no") && middleAgedCount.get(rand) == 5) {
                    System.out.println("You decide against seeing a doctor but take the WebMD results with a grain of salt. \nIt appears that you do indeed have cancer. It was a hard fought battle, however, the cancer took its course, \nthen took your life.");
                    health = changeStat(health, -100);
                    life = false;
                    naturalDeath = false;
                    break;

                } else if (choice.equalsIgnoreCase("no") && middleAgedCount.get(rand) == 6) {
                    System.out.println("You know better than your doctor and decided that you don't need books to keep up your brain function. \nYour only goal is to prove your doctor wrong by functioning at 100% until you dying days.");

                    smarts = changeStat(smarts, -3);
                    health = changeStat(health, -3);
                    if (health == 0) {
                        life = false;
                        break;
                    }

                } else if (choice.equalsIgnoreCase("yes") && middleAgedCount.get(rand) == 6) {
                    System.out.println("Originally the decision was to maintain good health but you hsve taken a special liking to reading. \nMaybe reading has multiple perks aside from keeping your brain at tip top shape.");

                    happiness = changeStat(happiness, 5);
                    smarts = changeStat(smarts, 3);
                    health = changeStat(health, 2);

                } else if (choice.equalsIgnoreCase("yes") && middleAgedCount.get(rand) == 7) {
                    System.out.println("With further investigation, you discover that you are hemophilic. This could cause some serious future problem. \nYou decide to take medicin to help, but the side effect cause you to develop minor depression and anxiety in the process.");

                    happiness = changeStat(happiness, -4);
                    health = changeStat(health, -2);
                    if (health == 0) {
                        life = false;
                        break;
                    }

                } else if (choice.equalsIgnoreCase("no") && middleAgedCount.get(rand) == 7) {
                    System.out.println("Your bruises are most likely not a big deal. \nWith this mindset, you continue your days until you end up cutting youself with a knife when preparing dinner.\nUnbeknownst to you, you have hemophilia, meaning that you do not stop bleeding. You ended up bleeding out and die from your cut.");
                    health = changeStat(health, -100);
                    life = false;
                    naturalDeath = false;
                    break;

                } else if (choice.equalsIgnoreCase("yes") && middleAgedCount.get(rand) == 8) {
                    System.out.println("You ended up visiting Upper Canada Mall with your nephews and nieces. \nWith a whole plethora of new clothing to wear, you have sevrely enhanced your style. \nFrom now on you know that you're looking good when you go out.");

                    happiness = changeStat(happiness, 3);
                    looks = changeStat(looks, 7);

                } else if (choice.equalsIgnoreCase("no") && middleAgedCount.get(rand) == 8) {
                    System.out.println("Thinking nothing of your initial rejection, you went to visit your nieces and nephews. \nTo your dismay, they had been awaiting your arrival in order to tease and toture you and your clothing. \nNext time you should just submit to their wishes and let them give you a full makeover.");

                    happiness = changeStat(happiness, -2);
                    looks = changeStat(looks, -3);

                } else if (choice.equalsIgnoreCase("yes") && middleAgedCount.get(rand) == 9) {
                    System.out.println("You planned a trip to wonderland for your students. As expected, the trip worked like a charm. \nBoth you and your students had a great time at wonderland and even bonded over some shared trauma on leviathan.");

                    happiness = changeStat(happiness, 5);
                    smarts = changeStat(smarts, 3);

                } else if (choice.equalsIgnoreCase("no") && middleAgedCount.get(rand) == 9) {
                    System.out.println("The trip seemed to be much too difficult a task, therefore you chose to scrap the idea. \nThe stress of your students continued to fester until one by one they gave up and stopped showing up to school. \nThe mostly empty classrooms really upset you and made you regret bailing on the trip idea.");

                    happiness = changeStat(happiness, -5);
                    smarts = changeStat(smarts, -2);

                }

                middleAgedChoices.remove(rand);
                middleAgedCount.remove(rand);

            }

            health = changeStat(health, -2);
            looks = changeStat(looks, -1);

            printStats();

            if (health == 0) {
                life = false;
                break;
            }

            age++;

            System.out.println("");

        }

    }//closes middle aged years

    //Prints the updated stats bar
    public void printStats() {
        System.out.println("Happiness: " + happiness + "%");
        System.out.println("Health: " + health + "%");
        System.out.println("Smarts: " + smarts + "%");
        System.out.println("Looks: " + looks + "%");
    }

    //Generates random stats at the beginning of the game (up to 100% for each one)
    public void generateStats() {
        happiness = (int) (Math.random() * 75 + 25);
        health = (int) (Math.random() * 75 + 25);
        smarts = (int) (Math.random() * 75 + 25);
        looks = (int) (Math.random() * 75 + 25);
    }

    public int changeStat(int stat, int change) {

        //Adds or subtract the given change from the original stat to update it
        stat += change;

        //Ensures that stats remain from 1-100
        if (stat > 100) {
            stat = 100;
        } else if (stat < 0) {
            stat = 0;
        }
        return stat;
    }

}
