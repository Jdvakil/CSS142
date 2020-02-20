/**
 * This program uses crypto-arithmetic to assign numbers from 0-9 for the code TOO + TOO + TOO = GOOD.
 * Everything is calculated in the main method using four nested for code blocks and two if statements.
 * @author Jay Darshan Vakil
 * @version 02/11/2019
 */
public class H4P1
{
    /**
     * This is the main method, here all the calculations are carried out using four nested for loops. Here 4*(TOO) = GOOD is reduced to four letters
     * "T", "O", "G", "D". 
     */
    public static void main(String[] args)
    {
        int T, O, G, D;//too, good can be reduced to t,o,g,d.
        for (T = 0 ; T < 10 ; T++)
        {
            for (O = 0 ; O < 10 ; O++)
            {
                for (G = 0 ; G < 10 ; G++)
                {
                    for (D = 0 ; D < 10 ; D++)
                    {
                        if ((D == G) || (D == O) || (D == T) || (G == O) || (G == T) || (O == T))
                        {
                            //This if statement continues the loop if any of the variable equals each other or 0. 
                            continue;
                        }
                        if (400*T + 40*O + 4*O == 1000*G + 100*O + 10*O + D)
                        {
                            //this assigns the crypted numbers to each letter of TOO + TOO + TOO = GOOD
                            System.out.println("T = " + T + ", O = " + O + ", G = " + G + ", D = " + D);
                            break;
                        }
                    }
                }
            }
        }
    }
}