import java.util.Random;
import java.util.Scanner;
class Number_game {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();

        int minrange=1;
        int maxrange=100;
        int maxattempts=10;
        int score=0;



        boolean playagain=true;
        while(playagain){
            int targetnumber=random.nextInt(maxrange-minrange+1)+minrange;
            System.out.println("welcome to the number game");
            System.out.println("i have selected a number between "+minrange+"and"+maxrange+"try to guess it");
            int attempts=0;
            while(attempts<maxattempts){

                System.out.println("enter your guess number:");
                int userguess=sc.nextInt();
                attempts++;

                if(userguess<targetnumber){
                    System.out.println("too low! try again");

                } else if (userguess>targetnumber) {
                    System.out.println("too high! try again");

                }
                else {
                    System.out.println("congratulation !you guesses the number"+targetnumber+"in"+attempts+"attempts");
                    score+=maxattempts-attempts+1;
                    break;
                }


            }
            if(attempts==maxattempts){
                System.out.println("sorry,you've reached the maximum number of attempts.the correct number is"+targetnumber);
            }
            System.out.println("do you want to play again?(yes/no):");
            String playagainresponce=sc.next().toLowerCase();
            playagain=playagainresponce.equals("yes");

        }
        System.out.println("thanks for playing!your total score is:"+score);
    }


}
