import java.util.Random;
import java.util.*;
public class Task1 {
    //define all static variables
    private static final int MIN_RANGE=1;
    private static final int MAX_RANGE=100;
    private static final int MAX_ATTEMPTS=10;
    private static final int MAX_ROUNDS=3;
    public static void main(String args[]){
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int total_score=0;
        System.out.println("....................NUMBER GUESSING GAME...................");
        System.out.println("Total Number Of Rounds=3");
        System.out.println("Attempts To Guess Number In Each Rounds=10");
        for(int i=1;i<=MAX_ROUNDS;i++){
            int number=random.nextInt(MAX_RANGE)+MIN_RANGE;
            int attempts=0;
            System.out.printf("Round %d :Guess The Number In Between %d and %d In %d Attempts.\n",i,MIN_RANGE,MAX_RANGE,MAX_ATTEMPTS);
            while(attempts<MAX_ATTEMPTS){
                System.out.println("Enter Your Guess : ");
                int guess_number=sc.nextInt();
                attempts=attempts+1;

                if(guess_number == number){
                    int score=MAX_ATTEMPTS-attempts;
                     total_score=total_score+score;
                    System.out.printf("Hurray! Number Guessed Successfully.\n Your Total Attempts=%d.\n Round Score=%d.\n",attempts,score);
                    break;
                }
                else if(guess_number < number){
                    System.out.printf("The Number Is Greater Than %d.Attempts Left=%d.\n",guess_number,MAX_ATTEMPTS-attempts);
                }
                else if(guess_number > number){
                    System.out.printf("The Number Is Lesser Than %d.Attempts Left=%d.\n",guess_number,MAX_ATTEMPTS-attempts);
                }
            }
            if(attempts==MAX_ATTEMPTS){
                System.out.printf("Round=%d.\n",i);
                System.out.printf("Attempts=0");
                System.out.printf("The Random Number is : %d.\n",number);
            }
        }
        System.out.printf(".......Game Over!.......\n Total Score=%d.\n",total_score);
        sc.close();
    }
}
