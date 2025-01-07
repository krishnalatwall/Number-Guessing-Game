import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        game(); //Function call
    }

    //Function that implements the number guessing game
    static void game(){
        //Scanner class
        Scanner sc = new Scanner(System.in);
        int randomNumber = 1 + (int) (100 * Math.random()); //Generating a random number b/w 0-100

        //Given 5 chances
        int chances = 5;

        System.out.println(
                "A number is chosen"
                        + " between 1 to 100."
                        + "Guess the number"
                        + " within 5 trials.");
        //Iterate over given chances
        for (int i = 1; i <= chances ; i++) {

            System.out.print("Guess a number : ");
            //Take input to guess
            int guess = sc.nextInt();

            //If the number is guessed
            if(guess == randomNumber){
                System.out.println("You guessed it right! \n The number is : " + randomNumber);
                break;
            }else if(guess > randomNumber && i != chances){
                    System.out.println("The number is smaller than : " + guess);
            } else if (guess < randomNumber && i != chances){
                System.out.println("The number is higher than : " + guess);
            }

            if(i == chances){
                System.out.println("You have exhausted " + chances + " trials.");
                System.out.println("The number was " + guess);
            }
        }

    }
}