package cptlorena;

public class Dictionary extends CPTLorena {

    Dictionary() throws InterruptedException {

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("WELCOME TO THE MR. MORRISON Dictionary!!!");
        System.out.println("There are 8 words/phrases unique to Mr. Morrison's speech.");
        System.out.println("Those that are unfamiliar with his speech might be a little lost at times.");
        System.out.println("For this reason we have compiled this Dictionary to help the avergae John/Jane Doe to keep up in conversation.");
        System.out.println("Please select an option: \n1 - View Dictionary \n2 - Back to menu");
        int decision = in.nextInt();
        System.out.println("");
        
        if (decision == 1) {

            System.out.println("Here are the words/phrases. Select the corresponding number to the definition you would like to view.");

            while (true) {
                System.out.println("");
                
                System.out.println("1 - 'Speak now or forever hold your peace'"
                        + "\n2 - 'It's a doozy'"
                        + "\n3 - 'Bob's your uncle'"
                        + "\n4 - 'Uber'"
                        + "\n5 - 'Top of the class'"
                        + "\n6 - 'Cool beans'"
                        + "\n7 - 'You picking up what I'm putting down'"
                        + "\n8 - 'You gotta play country'"
                        + "\n9 - Back to menu");

                int dict = in.nextInt();

                //Break out of the dictionary and go back to main menu if they choose that option
                if (dict == 9) {
                    break;
                }

                //Based on the user input, display the definition of the phrase 
                switch (dict) {
                    case 1:
                        System.out.println("A common phrase used after a lengthy explanation of an assignment and or assessment. \nIt is meant to allow the recipient to share any concerns they may have.");
                        break;
                    case 2:
                        System.out.println("A phrase used to describe a challenging or confusing task that usually requires more effort \nand a greater application of one's knowledge based on recently learned concepts.");
                        break;
                    case 3:
                        System.out.println("A statement used at the end of an explanation or lesson to declare that it as come to an end. \nUsually utilized when running a program that impements all the concepts covered within a given day. \nSimply put Bob = Uncle");
                        break;
                    case 4:
                        System.out.println("This word is a word that describes emphasis or exaggeration. Ex. 'The question shouldn't be uber difficult...'");
                        break;
                    case 5:
                        System.out.println("A statement that is used in reference to one or two students who answer a question correctly, \nimplying that they have been listening and are at the 'top of the class'.");
                        break;
                    case 6:
                        System.out.println("A term originating from the 2007 movie 'Hot Rod' commonly used as a very unique way of saying 'ok', 'good to go', or 'cool'. \nVery often used to end a thought process or is said through instinct to reassure everyone that everything is alright.");
                        break;
                    case 7:
                        System.out.println("A phrase used to suggest that there is a clue or hint that could help the class. \nUsually not very subtle, but greatly appreciated by his students. This statement can also be used when teaching \na lesson as a form of confirmation from the class that they are understanding the lesson.");
                        break;
                    case 8:
                        System.out.println("Pretty self explanatory. If you're gonna play some music, YOU GOTTA PLAY COUNTRY.");
                        break;
                    default:
                        break;
                }

                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                }

            }
        }

    }

}
