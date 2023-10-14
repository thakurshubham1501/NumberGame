package Number;

import java.util.*;
public class NumberGame
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
Random rand=new Random();
System.out.println("=================================");
System.out.println("* WELCOME TO GUESS NUMBER  GAME *");
System.out.println("=================================");
int randomno=rand.nextInt(100);
System.out.println("");
System.out.println("You Will Be Asked To Guess A Number To Win The Game" + "\n");
System.out.println("You Have Maximum Only 5 Attempt Limit");
int Totallimit=5;
int x=0;
   while(x<Totallimit)
	{
		    System.out.println("\n" + "Enter a Guess No. between 1 to 100");
		    int GuessNo = scan.nextInt();
		    x++;
		    if(GuessNo > 100)
		    {
		       System.out.println("Please Enter Valid No.");
		    }    
		
		    if(GuessNo == randomno)
		    {
		        System.out.println("Congrats.., Your No. is Correct. You Won The Game!");
		
		        break;
		    }
		    else if(GuessNo < randomno)
		    {
		        System.out.println("Your No. is Lower Than Random No. Try Again..");
		    }
		    else 
		    {
		        if(GuessNo > randomno)
		        {
		        System.out.println("Your No. is Greater Than Random No. Try Again..");
		        }
		    }
		    if(x==Totallimit && GuessNo != randomno ) {
		    	System.out.println("\n" + "You have Lost the Game..." + "\n" + "Please Try Next Time...");
		    }
     }
}
}
