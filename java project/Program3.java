import java.util.Scanner;

public class Program3 {
    public static void main(String args[]) {
        int userScore = 0; 

        Scanner Sc = new Scanner(System.in);
        char choice;
        do {
            int trial = 1;
            int userPredictNumber = 0;
            int correctNumber = 1 + (int) (100 * Math.random());

            System.out.println("Welcome to My Number Guessing Game !\n");
            System.out.println("Guess the number between the range (1 to 100) :-\n");
            System.out.println("limitation :- You have only 5 attempts\n");

            do {
                System.out.print("Enter a number between the range given above:-\n");

                if (Sc.hasNextInt()) {
                    userPredictNumber = Sc.nextInt();
                    if (userPredictNumber == correctNumber) {
                        System.out.println("Congratulations! Your Number is Correct. You Win the Game!");
                        userScore += (6 - trial); 
                        break;
                    } else if (userPredictNumber < correctNumber) {
                        System.out.println("Predict Number is too low.");
                    } else if (userPredictNumber > correctNumber) {
                        System.out.println("Predict Number is too high.");
                    }

                    if (trial == 5) {
                        System.out.println("Your limit is over, The correct number was: " + correctNumber);
                        break;
                    }

                    trial++;
                } else {
                    System.out.println("Enter a Valid Integer Number");
                    break;
                }
            } while (userPredictNumber != correctNumber);

            System.out.println("Your current score: " + userScore);

            System.out.print("Would you like to play the game again (Y/N): ");
            choice = Sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you for playing the game. Your final score: " + userScore);
        Sc.close();
    }
}