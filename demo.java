import java.util.Scanner;

public class demo
{
    public static void main (String[] args)
    {
        int day = 0;

        // Garden initialization!
        // I'm sorry everyhing is over-indented. These things happen.

        // Entrance statements
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                          Welcome to Gardenbot 2000!");
        System.out.println("                Today is your first day of being a virtual gardener.");
        System.out.println("         You can plant up to 20 different plants to start off your garden.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");

        // Start off with 0 plants
        int total_num=0;

        // Prompt user for number of roses they'd like
        // Their input is restricted so they can't exceed 20 plants total
        // Create an array of rose inputs with a length of user input
        // Throughout the project, the user's 5th rose will be referenced by r[4].
        System.out.println("How many roses would you like?");
        System.out.print(">> ");
        Scanner r_scan = new Scanner(System.in);
        int r_num;
        r_num = r_scan.nextInt();
        while(r_num + total_num >  20)
        {
            System.out.println("Sorry, that's too many plants. You can only add "+(20-total_num)+" more plants. Please try again");
            System.out.println("If you're already at 20 plants, enter 0 for the rest of the plant types.");
            System.out.print(">> ");
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
        System.out.println("");
        System.out.println("How many daisies would you like?");
        System.out.print(">> ");
        Scanner d_scan = new Scanner(System.in);
        int d_num;
        d_num = d_scan.nextInt();
        while(d_num + total_num >  20)
        {
            System.out.println("Sorry, that's too many plants. You can only add "+(20-total_num)+" more plants. Please try again");
            System.out.println("If you're already at 20 plants, enter 0 for the rest of the plant types.");
            System.out.print(">> ");
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

		/*
			father_time f = new father_time();
			r = f.rose_ager(r);
			d = f.daisy_ager(d);
		*/

        day=day+1;

        while(day<100)
        {
            System.out.println("");
            System.out.println("====================================================================================");
            System.out.println("                                      DAY "+day);
            System.out.println("====================================================================================");

            int lvl0 = 1;
            while(lvl0 == 1)
            {
                System.out.println("");
                System.out.println("What would you like to do? Enter the number of your choice");
                System.out.println("| 1 | Check on your plants");
                System.out.println("| 2 | Water a plant");
                System.out.println("| 3 | Go to sleep and move forward one day");

                Scanner lvl1_picker = new Scanner(System.in);
                int lvl1;
                System.out.print(">> ");
                lvl1 = lvl1_picker.nextInt();

                if(lvl1 == 1)
                {
                    // Get status update on every plant.
                    System.out.println("");
                    System.out.println("Plant Status Update");

                    // Rose update
                    System.out.println("Roses:");
                    if(r_num==0) { System.out.println("You have no roses"); }
                    else
                    {
                        for (int rz=0; rz<r_num; rz++)
                        {
                            System.out.print("R["+rz+"]: ");
                            System.out.print("Water received: "+r[rz].water_received_getter()+" ");
                            System.out.print("Min water needed: "+r[rz].water_min_getter()+" ");
                            System.out.println("Max water needed: "+r[rz].water_max_getter()+" ");
                        }
                    }

                    System.out.println("");

                    // Daisy update
                    System.out.println("Daisies:");
                    if(d_num==0) { System.out.println("You have no daisies"); }
                    else
                    {
                        for (int dz=0; dz<d_num; dz++)
                        {
                            System.out.print("D["+dz+"]: ");
                            System.out.print("Water received: "+d[dz].water_received_getter()+" ");
                            System.out.print("Min water needed: "+d[dz].water_min_getter()+" ");
                            System.out.println("Max water needed: "+d[dz].water_max_getter()+" ");
                        }
                    }

                }

                // Water a plant.
                else if(lvl1 == 2)
                {
                    int lvl2=0;
                    System.out.println("");
                    System.out.println("Water");
                    System.out.println("Which plant type would you like to water?");
                    System.out.println("Enter the number that corresponds with your choice");
                    System.out.println("| 1 | Rose");
                    System.out.println("| 2 | Daisy");
                    System.out.println("| 3 | Cancel / Go back");

                    Scanner lvl2_picker = new Scanner(System.in);
                    System.out.print(">>");
                    lvl2 = lvl2_picker.nextInt();

                    if(lvl2 == 1)
                    {
                        Scanner rose_zone = new Scanner(System.in);
                        System.out.println("Which rose?");
                        for(int i=0; i<r.length; i++)
                        {
                            int ii = i+1;  // Is this worth it?
                            System.out.println("| "+ii+" |	R["+i+"]");
                        }
                        System.out.print(">>");
                        int lvl3 = rose_zone.nextInt();

                        System.out.println("How many times do you want to water this rose?");
                        System.out.print(">>");
                        int num = rose_zone.nextInt();

                        System.out.println("Are you sure you want to water R["+lvl3+"] "+num+" times?");
                        System.out.println("| 1 | Yes");
                        System.out.println("| 2 | No, cancel");

                        System.out.print(">>");
                        int confirm = rose_zone.nextInt();
                        if(confirm == 1)
                        {
                            r[lvl3-1].water_this_plant(num);
                        }

                    }
                    if(lvl2 == 2)
                    {
                        Scanner daisy_zone = new Scanner(System.in);
                        System.out.println("Which daisy?");
                        for(int i=0; i<d.length; i++)
                        {
                            int ii = i+1;  // Is this worth it?
                            System.out.println("| "+ii+" |	D["+i+"]");
                        }
                        System.out.print(">>");
                        int lvl3 = daisy_zone.nextInt();

                        System.out.println("How many times do you want to water this daisy?");
                        System.out.print(">>");
                        int num = daisy_zone.nextInt();

                        System.out.println("Are you sure you want to water D["+lvl3+"] "+num+" times?");
                        System.out.println("| 1 | Yes");
                        System.out.println("| 2 | No, cancel");

                        System.out.print(">>");
                        int confirm = daisy_zone.nextInt();
                        if(confirm == 1)
                        {
                            d[lvl3-1].water_this_plant(num);
                        }
                    }
                }

                else if(lvl1 == 3)
                {
                    day=day+1;
                    lvl0=0;
                    System.out.println("Day is over.");
                    father_time f = new father_time();
                    r = f.rose_ager(r);
                    d = f.daisy_ager(d);
                    // Grim reaper called here?
                }
            }



        }



    }


}