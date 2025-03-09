import java.util.Random;
import java.util.Scanner;
class RandomGame{
    public static void gameFunction(){
        Random ran=new Random();
        long originalNumber=ran.nextLong(100);
        int no=(int)originalNumber%1000;
        int n=Math.abs(no);
        int score=100;
        Scanner sc=new Scanner(System.in);
        int ch=0;
        while(ch!=n){
            ch=sc.nextInt();
            if(ch<n){
                System.out.println("Your guess is smaller");
                score=score-5;
            }
            else if (ch>n) {
                System.out.println("Your guess is larger");
                score=score-5;
            }
            else{
                System.out.println("Your guess is correct");
                score=score+10;
            }

    }
        System.out.println("Final score ="+score);
    }

    public static void main(String[] args){
        System.out.println("Welcome to Random Game!!! \n You have three chances to guess the number right.....\nAll the best....\nLet's get started....\nEnter your first guess:");
        gameFunction();
    }
}