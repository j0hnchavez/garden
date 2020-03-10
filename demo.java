package garden;
import garden.*;
import java.util.Scanner;

public class demo
{
	public static void main (String[] args)
	{
		int day = 0;
		// Garden initialization!
		if(day==0)
		{
			// Entrance statements
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Welcome to Gardenbot 2000!");
			System.out.println("Today is your first day of being a virtual gardener.");
			System.out.println("You can plant up to 20 different plants to start off your garden.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
			
			// Start off with 0 plants
			int total_num=0;

			// Prompt user for number of roses they'd like
			// Their input is restricted so they can't exceed 20 plants total
			// Create an array of rose inputs with a length of user input
			// Throughout the project, the user's 5th rose will be referenced by r[4].
			System.out.println("How many roses would you like?");
			System.out.print("Roses >> ");
			Scanner r_scan = new Scanner(System.in);
			int r_num;
			r_num = r_scan.nextInt();
			while(r_num + total_num >  20)
			{
				System.out.println("Sorry, that's too many plants. You can only add "+(20-total_num)+" more plants. Please try again");
				System.out.println("If you're already at 20 plants, enter 0 for the rest of the plant types.");
				System.out.print("Roses >> ");
				r_num = r_scan.nextInt();
			}

			// Array creation
			rose[] r = new rose[r_num];
			for (int r_i = 0; r_i < r_num; r_i++)
			{
				r[r_i] = new rose();
			}


			// Update total number of plants
			total_num = total_num + r_num;
			System.out.println("(Total plants: "+total_num+") (Remaining spots: "+(20-total_num)+")");

			// Same process but for daisies
			System.out.println("How many daisies would you like?");
			System.out.print("Daisies >> ");
			Scanner d_scan = new Scanner(System.in);
			int d_num;
			d_num = d_scan.nextInt();
			while(d_num + total_num >  20)
			{
				System.out.println("Sorry, that's too many plants. You can only add "+(20-total_num)+" more plants. Please try again");
				System.out.println("If you're already at 20 plants, enter 0 for the rest of the plant types.");
				System.out.print("Roses >> ");
				d_num = d_scan.nextInt();
			}
			daisy[] d = new daisy[d_num];
			for (int d_i = 0; d_i < d_num; d_i++)
			{
				d[d_i] = new daisy();
			}


			
			// Update total number of plants
			total_num = total_num + d_num;
			System.out.println("(Total plants: "+total_num+") (Remaining spots: "+(20-total_num)+")");


			System.out.println("Amount of water daisy 1 needs: "+d[0].water_needed_getter());	
		}
	}
}
