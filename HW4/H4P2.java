import java.util.Random;
import java.util.Scanner;
/**
 * This program is a game between the user and the computer. Here the user starts by generating a random number from 1 to 6(like a dice). 
 * If the user rolls between 2 to 6 then their score adds us but if the user rolls a 1, then its the other players turn and they lose all the points 
 * accumulted in the current run. The user then has a choice to keep rolling or hold the score they got. whoever reaches 100 first wins. 
 * @author Jay Darshan Vakil
 * @version 02/11/2019
 */
public class H4P2{
    public static Random r;
    public static Scanner sc=new Scanner(System.in);
    /**
     * This is the main class, here all calling of methods and the storage of users/computers total score is recorded.
     */
    public static void main(String[] args) {
        int user_tot_score=0,comp_tot_score=0;//the users and computers total score
        r = new Random();

        System.out.println("Welcome to the game of Pig!");

        while(true)
        {

            user_tot_score=usersTurn(user_tot_score);

            comp_tot_score=computersTurn(comp_tot_score);

        }
    }

    /**
     * This method is the users turn. Here conditions are set so that the user can play and choose between Roll or Hold, using if/else statements in a 
     * while loop block.
     * @param user_tot_score the total score for the user.
     * @return user_tot_score the total score after the users turn.
     */
    public static int usersTurn(int user_tot_score) {
        char ch;
        int rand=0,user_temp_tot=0,user_turn_score=0;
        while(true)
        {

            rand=rollDie();
            if(rand==1)
            {
                System.out.println("You rolled: "+rand);
                user_temp_tot=0;
                user_turn_score=0;
                break;
            }
            System.out.println("\nYou rolled: "+rand);
            user_turn_score+=rand;

            user_temp_tot=user_tot_score+user_turn_score;

            System.out.println("Your turn score is "+user_turn_score+" and your total score is "+user_tot_score);
            System.out.println("If you hold, you will have "+user_temp_tot+" points");
            System.out.println("Enter 'R' to roll again, 'H' to hold.");
            ch = sc.next(".").charAt(0);
            if(ch=='r'||ch=='R')
                continue;
            else
            {
                if(user_temp_tot>=100)
                {
                    System.out.println("User Wins !");
                    user_tot_score=user_temp_tot;
                    System.out.println("The User's score is "+user_tot_score);
                    System.exit(0);
                }
                user_tot_score=user_temp_tot;
                System.out.println("Your score is "+user_tot_score);
                user_turn_score=0;
                user_temp_tot=0;
                break;
            }
        }
        return user_tot_score;
    }

    /**
     * This method is the computers turn, here the computer plays its die until it reaches a score of 20 or rolls a 1.
     * @param comp_tot_score the totalscore for the computer
     * @return comp_tot_score the total computer score 
     */
    public static int computersTurn(int comp_tot_score)
    {
        int rand1,com_turn_score=0,com_temp_tot=0;
        System.out.println("\nIt is the computer's turn.\n");
        while(true)
        {
            rand1=rollDie();
            System.out.println("The computer rolled: "+rand1);
            if(rand1==1)
            {
                System.out.println("The computer lost its turn!");
                System.out.println("The computer's score is "+comp_tot_score);
                com_turn_score=0;
                com_temp_tot=0;
                break;
            }
            com_turn_score+=rand1;
            com_temp_tot=comp_tot_score+com_turn_score;
            if(com_temp_tot>=100)
            {
                System.out.println("Computer Wins !");
                comp_tot_score=com_temp_tot;
                System.out.println("The computer's score is "+comp_tot_score);
                System.exit(0);
            }
            if(com_turn_score>=20 )
            {
                comp_tot_score+=com_turn_score;
                System.out.println("The computer holds.");
                System.out.println("The computer's score is "+comp_tot_score);

                com_turn_score=0;
                break;
            }
            else
            {
                continue;
            }

        }
        return comp_tot_score;

    }

    /**
     * This method generates a random number from 1-6 the represents a die.
     * @return die the die value.
     */
    public static int rollDie()
    {
        int die = r.nextInt(6) + 1;
        return die;
    }

}