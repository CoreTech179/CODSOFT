import java.util.Scanner;
import java.util.Random;

class NewGame{

    public int startGame(){
        // Calling the random class from java.util.Random and creating an object of the Random class

        Random rand = new Random();

        // Generating an random number b/w 1-100

        int computerNo = rand.nextInt(100);

        System.out.println("Guess the number between 1 to 100!");

        // Returning the random number generated by the computer 

        return computerNo;
    }

}

public class Game{

    public static void isCorrectNumber(int userNo, int computerNo){

        if(userNo==computerNo){
            System.out.println("Congratulations you have guessed the correct Number!!");
        }
        else if(userNo>computerNo){
            System.out.println("Your Number is Greater than Computer Number!! Guess Something Smaller!");
        }
        else{
            System.out.println("Your Number is Smaller than Computer Number!! Guess Something Larger!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfGuess = 0;

        NewGame g = new NewGame();

        int computerNo = g.startGame();

        int userNumber;

        
        do {

            System.out.print("Enter Your Number:");
            userNumber = sc.nextInt();
    
            isCorrectNumber(userNumber, computerNo);
            numberOfGuess++;
            
        } while (userNumber!=computerNo);
        
        System.out.println("You Won te game by " + numberOfGuess +" "+"no of guesses!!");
        
        sc.close();
    }
}