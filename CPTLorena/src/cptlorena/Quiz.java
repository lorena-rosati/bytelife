package cptlorena;

public class Quiz extends CPTLorena {

    Quiz() throws InterruptedException {

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("WELCOME TO THE MR. MORRISON QUIZ!!!");
        System.out.println("There are 13 questions that you must answer.");
        System.out.println("Select the option that you would like to select: \n1 - Start Quiz \n2 - Back to menu");
        int decision = in.nextInt();
        System.out.println("");

        //Start the quiz
        if (decision == 1) {

            int correct = 0; //counter for the number of correct answers

            System.out.println("First question: Where was Mr. Morrison born? \n1 - Richmond Hill \n2 - Thornhill \n3 - North York \n4 - Vaughan");
            int q1 = in.nextInt();

            if (q1 == 3) {
                correct++; //If the answer is correct, increase the counter for the number of correct answers (this comment applies to code below)
            } else {
            System.out.println("Correct answer: North York");
            }
            System.out.println("");

            System.out.println("Second question: What was Mr. Morrison's undergrad major? \n1 - Computer Science \n2 - Computer Engineering \n3 - Kinesiology \n4 - Political Science");
            int q2 = in.nextInt();

            if (q2 == 3) {
                correct++;
            } else {
                        System.out.println("Correct answer: Kinesiology");
            }
            System.out.println("");

            System.out.println("Third question: What is Mr. Morrison's favourite genre of music? \n1 - Hip Hop \n2 - Rap \n3 - Country \n4 - Reggae");
            int q3 = in.nextInt();

            if (q3 == 3) {
                correct++;
            } else {
            System.out.println("Correct answer: Country");
            }

            System.out.println("");

            System.out.println("Fourth question: What is Mr. Morrison's favourite sport? \n1 - Hockey \n2 - Basketball \n3 - Baseball \n4 - Volleyball");
            int q4 = in.nextInt();

            if (q4 == 1) {
                correct++;
            } else {
            System.out.println("Correct answer: Hockey");
            }
            System.out.println("");

            System.out.println("Fifth question: What is Mr. Morrison's favourite food? \n1 - Pizza \n2 - Pasta \n3 - Ice cream\n4 - Fries");
            int q5 = in.nextInt();

            if (q5 == 2) {
                correct++;
            } else {
            System.out.println("Correct answer: Pasta");
            }
            System.out.println("");

            System.out.println("Sixth question: What is Mr. Morrison's favourite coding language? \n1 - Java \n2 - C++ \n3 - Python \n4 - Java Script");
            int q6 = in.nextInt();

            if (q6 == 1) {
                correct++;
            } else {
            System.out.println("Correct answer: Java");
            }
            System.out.println("");

            System.out.println("Seventh question: Which famous youtuber was Mr. Morrison friends with? \n1 - Cody Ko \n2 - King Bach \n3 - Domics \n4 - Vanoss Gaming");
            int q7 = in.nextInt();

            if (q7 == 4) {
                correct++;
            } else {
            System.out.println("Correct answer: Vanoss Gaming");
            }
            System.out.println("");

            System.out.println("Eight question: How old is Mr. Morrison (as of June 2022)? \n1 - 28 \n2 - 29 \n3 - 30 \n4 - 31");
            int q8 = in.nextInt();

            if (q8 == 2) {
                correct++;
            } else {
            System.out.println("Correct answer: 29");
            }
            System.out.println("");

            System.out.println("Ninth question: Which highschool did Mr. Morrison attend? \n1 - Jean Vanier CHS/OLQWCA \n2 - Richmond Green Secondary school \n3 - St. Theresa of Liseux CHS \n4 - Richmond Hill High School");
            int q9 = in.nextInt();

            if (q9 == 3) {
                correct++;
            } else {
            System.out.println("Correct answer: St. Theresa of Lisieux CHS");
            }
            System.out.println("");

            System.out.println("Tenth question: Which university did Mr. Morrison attend for his undergrad? \n1 - UofT \n2 - York University \n3 - University of Guelph \n4 - Brock University");
            int q10 = in.nextInt();

            if (q10 == 4) {
                correct++;
            } else {
            System.out.println("Correct answer: Brock University");
            }
            System.out.println("");

            System.out.println("Eleventh question: Which teacher currently working at OLQWCA did NOT teach Mr. Morrison? \n1 - Mr. Correia \n2 - Ms. Henson \n3 - Ms. Carafa \n4 - Mr. Tonon");
            int q11 = in.nextInt();

            if (q11 == 2) {
                correct++;
            } else {
            System.out.println("Correct answer: Ms. Henson");
            }
            System.out.println("");

            System.out.println("Twelfth question: How many siblings does Mr. Morrison have? \n1 - 0 siblings \n2 - 1 sibling \n3 - 2 siblings \n4 - 3 siblings");
            int q12 = in.nextInt();

            if (q12 == 3) {
                correct++;
            } else {
            System.out.println("Correct answer: 2 siblings");
            }
            System.out.println("");

            System.out.println("Spot the Morri: Which is a childhood picture of Mr. Morrison? (Type the corresponding number in the output console.)");
            Graphics.bbMorri();
            int q13 = in.nextInt();
            System.out.println("");

            if (q13 == 1 || q13 == 2) {
                correct++;
            } else {
            System.out.println("Correct answer: Image 1 AND 2");
            }

            //Print score
            System.out.println("You got " + correct + "/13 correct.");

        }

    }

}
