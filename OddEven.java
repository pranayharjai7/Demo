import java.util.Random;
import java.util.Scanner;

public class OddEvenGame
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String Play = "yes";
        while(Play.startsWith("y")||Play.startsWith("Y"))
        {
            System.out.println("Welcome to the game of ODDS AND EVENS!");
            String choice = UserChoice(input);
            String OddorEve = game(input);
            System.out.println("The sum is " + OddorEve);
            if (choice.equals(OddorEve))
                System.out.println("You Won!");
            else
                System.out.println("You lost :(");
            System.out.print("Play again?: ");
            Play = input.next();
        }
    }

    public static String UserChoice(Scanner input)
    {
        String userchoice,pcchoice;
        System.out.print("Choose (O)DD or (E)VEN: ");
        String choice = input.next();
        if ( choice.startsWith("o")||choice.startsWith("O") )
        {
            userchoice = "ODD";
            pcchoice = "EVEN";
        }
        else
        {
            userchoice = "EVEN";
            pcchoice = "ODD";
        }
        System.out.println("Your choice is "+userchoice+"\nPC's choice is "+pcchoice);
        return userchoice;
    }

    public static String game(Scanner input)
    {
        String OddorEve;
        System.out.print("Enter your number(1-10): ");
        int UserNum = input.nextInt();
        Random rand = new Random();
        int PCNum = rand.nextInt(11);
        System.out.println("Pc's choice is "+PCNum);
        int sum = UserNum+PCNum;
        if(sum%2==0)
            OddorEve = "EVEN";
        else
            OddorEve = "ODD";
        return OddorEve;
    }
}
