import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = 1+(int)(1000*Math.random());
        int limits = 15;
        int attempts = 0;
        while(attempts < limits){
            System.out.println("Guess the number between 1 and 1000");
            int guess = sc.nextInt();
            if(guess== number){
                System.out.println("Congratulations! You guessed the number in " + (attempts+1) + " attempts.");
                break;
            }
            else if(guess>number){
                System.out.println("Too high! Try again.");
            }
            else{
                System.out.println("Too low! Try again.");
            }
            attempts++; 
        }
        if(attempts == limits){
            System.out.println("Sorry! You've used all your attempts. The number was: " + number);
        }
        sc.close();
    } 
}
