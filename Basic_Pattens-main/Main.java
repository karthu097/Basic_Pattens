import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) +1;//picks any random number
        int guess =0;
        int attempts=0;
        System.out.println("Guess My Number (1-100): ");

        while(guess !=number){
            System.out.print("Your guess:");
            guess = scanner.nextInt();
            attempts++;

            if(guess < number){
                System.out.println("Too low!");
            }else if(guess > number){
                System.out.println("Too high");
            }else{
                System.out.println("Correct you got it in " +attempts + "tries");
            }
        }
    }
}