//package garden;
//import garden.*;

import java.util.Scanner;

public class demo {
    static int day = 0;
    public static void main(String[] args) {

        // Garden initialization!
        // I'm sorry everything is over-indented. These things happen.

        // Entrance statements
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                          Welcome to Gardenbot 2000!");
        System.out.println("                Today is your first day of being a virtual gardener.");
        System.out.println("         You can plant up to 10 different plants to start off your garden.");
        System.out.println("            Available plant types: roses, daisies, cacti, and orchids.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");

        // Start off with 0 plants
        int total_num = 0;

        log.create_log();

        // Prompt user for number of roses they'd like
        // Their input is restricted so they can't exceed 20 plants total
        // Create an array of rose inputs with a length of user input
        // Throughout the project, the user's 5th rose will be referenced by r[4].
        System.out.println("How many roses would you like?");
        System.out.print(">> ");
        Scanner r_scan = new Scanner(System.in);
        int r_num;
        r_num = r_scan.nextInt();
        while (r_num + total_num > 10) {
            System.out.println("Sorry, that's too many plants. You can only add " + (10 - total_num) + " more plants. Please try again");
            System.out.println("If you're already at 10 plants, enter 0 for the rest of the plant types.");
            System.out.print(">> ");
            r_num = r_scan.nextInt();
        }

        // Array creation
        rose[] r = new rose[r_num];
        for (int r_i = 0; r_i < r_num; r_i++) {
            r[r_i] = new rose();
            log.write_line("Planted 1 rose", day);
        }


        // Update total number of plants
        total_num = total_num + r_num;
        System.out.println("(Total plants: " + total_num + ") (Remaining spots: " + (10 - total_num) + ")");

        // Same process but for daisies
        System.out.println("");
        System.out.println("How many daisies would you like?");
        System.out.print(">> ");
        Scanner d_scan = new Scanner(System.in);
        int d_num;
        d_num = d_scan.nextInt();
        while (d_num + total_num > 10) {
            System.out.println("Sorry, that's too many plants. You can only add " + (10 - total_num) + " more plants. Please try again");
            System.out.println("If you're already at 10 plants, enter 0 for the rest of the plant types.");
            System.out.print(">> ");
            d_num = d_scan.nextInt();
        }
        daisy[] d = new daisy[d_num];
        for (int d_i = 0; d_i < d_num; d_i++) {
            d[d_i] = new daisy();
            log.write_line("Planted 1 daisy", day);
        }
        // Update total number of plants
        total_num = total_num + d_num;
        System.out.println("(Total plants: " + total_num + ") (Remaining spots: " + (10 - total_num) + ")");


        // Same process but for cactus
        System.out.println("");
        System.out.println("How many cacti would you like?");
        System.out.print(">> ");
        Scanner c_scan = new Scanner(System.in);
        int c_num;
        c_num = c_scan.nextInt();
        while (c_num + total_num > 10) {
            System.out.println("Sorry, that's too many plants. You can only add " + (10 - total_num) + " more plants. Please try again");
            System.out.println("If you're already at 10 plants, enter 0 for the rest of the plant types.");
            System.out.print(">> ");
            c_num = c_scan.nextInt();
        }

        // Cacti array creation
        cactus[] c = new cactus[c_num];
        for (int c_i = 0; c_i < c_num; c_i++) {
            c[c_i] = new cactus();
            log.write_line("Planted 1 cactus", day);
        }

        // Update total number of plants
        total_num = total_num + c_num;
        System.out.println("(Total plants: " + total_num + ") (Remaining spots: " + (10 - total_num) + ")");


        // Same process but for orchid
        System.out.println("");
        System.out.println("How many orchids would you like?");
        System.out.print(">> ");
        Scanner o_scan = new Scanner(System.in);
        int o_num;
        o_num = o_scan.nextInt();
        while (o_num + total_num > 10) {
            System.out.println("Sorry, that's too many plants. You can only add " + (10 - total_num) + " more plants. Please try again");
            System.out.println("If you're already at 10 plants, enter 0 for the rest of the plant types.");
            System.out.print(">> ");
            o_num = o_scan.nextInt();
        }

        // Orchid array creation
        orchid[] o = new orchid[o_num];
        for (int o_i = 0; o_i < o_num; o_i++) {
            o[o_i] = new orchid();
            log.write_line("Planted 1 orchid", day);
        }

        // Update total number of plants
        total_num = total_num + o_num;
        System.out.println("(Total plants: " + total_num + ") (Remaining spots: " + (10 - total_num) + ")");

		/*
			father_time f = new father_time();
			r = f.rose_ager(r);
			d = f.daisy_ager(d);
		*/

        day = day + 1;

        while (day < 100) {
            System.out.println("");
            System.out.println("====================================================================================");
            System.out.println("                                      DAY " + day);
            System.out.println("====================================================================================");

            int lvl0 = 1;
            while (lvl0 == 1) {
                System.out.println("");
                System.out.println("What would you like to do? Enter the number of your choice");
                System.out.println("| 1 | Check on your plants");
                System.out.println("| 2 | Water a plant");
                System.out.println("| 3 | Fertilize a plant");
                System.out.println("| 4 | Use pesticides or distribute ladybugs");
                System.out.println("| 5 | Go to sleep and move forward one day");

                Scanner lvl1_picker = new Scanner(System.in);
                int lvl1;
                System.out.print(">> ");
                lvl1 = lvl1_picker.nextInt();

                // Option 1: Get status update on every plant.
                if (lvl1 == 1) {
                    System.out.println("");
                    System.out.println("Plant Status Update");

                    // Rose update
                    System.out.println("Roses:");
                    if (r_num == 0) {
                        System.out.println("You have no roses");
                    } else {
                        for (int rz = 0; rz < r_num; rz++) {
                            System.out.print("R[" + rz + "]: ");
                            if (r[rz].life_getter()) {
                                System.out.print("Water received: " + r[rz].water_received_getter() + " | ");
                                System.out.print("Min water needed: " + r[rz].water_min_getter() + " | ");
                                System.out.println("Max water needed: " + r[rz].water_max_getter() + " ");
                                System.out.print("Fertilizer received: " + r[rz].fertilizer_received_getter() + " | ");
                                System.out.print("Min fertilizer needed: " + r[rz].fertilizer_min_getter() + " | ");
                                System.out.print("Max fertilizer needed: " + r[rz].fertilizer_max_getter() + " \n");
                                System.out.println("Current insect infestation: " + r[rz].ist.status());
                            } else if (!r[rz].life_getter()) {
                                System.out.println("DEAD!");
                            }
                        }
                    }

                    System.out.println("");

                    // Daisy update
                    System.out.println("Daisies:");
                    if (d_num == 0) {
                        System.out.println("You have no daisies");
                    } else {
                        for (int dz = 0; dz < d_num; dz++) {
                            System.out.print("D[" + dz + "]: ");
                            if (d[dz].life_getter()) {
                                System.out.print("Water received: " + d[dz].water_received_getter() + " | ");
                                System.out.print("Min water needed: " + d[dz].water_min_getter() + " | ");
                                System.out.println("Max water needed: " + d[dz].water_max_getter() + "  ");
                                System.out.print("Fertilizer received: " + d[dz].fertilizer_received_getter() + " | ");
                                System.out.print("Min fertilizer needed: " + d[dz].fertilizer_min_getter() + " | ");
                                System.out.print("Max fertilizer needed: " + d[dz].fertilizer_max_getter() + " \n");
                                System.out.println("Current insect infestation: " + d[dz].ist.status());
                            } else {
                                System.out.println("DEAD!");
                            }
                        }
                    }

                    // Cactus update
                    System.out.println("Cacti:");
                    if (c_num == 0) {
                        System.out.println("You have no cacti");
                    } else {
                        for (int cz = 0; cz < c_num; cz++) {
                            System.out.print("D[" + cz + "]: ");
                            if (c[cz].life_getter()) {
                                System.out.print("Water received: " + c[cz].water_received_getter() + " | ");
                                System.out.print("Min water needed: " + c[cz].water_min_getter() + " | ");
                                System.out.println("Max water needed: " + c[cz].water_max_getter() + "  ");
                                System.out.print("Fertilizer received: " + c[cz].fertilizer_received_getter() + " | ");
                                System.out.print("Min fertilizer needed: " + c[cz].fertilizer_min_getter() + " | ");
                                System.out.print("Max fertilizer needed: " + c[cz].fertilizer_max_getter() + " \n");
                                System.out.println("Current insect infestation: " + c[cz].ist.status());
                            } else {
                                System.out.println("DEAD!");
                            }
                        }
                    }

                    // Orchid update
                    System.out.println("Orchids:");
                    if (o_num == 0) {
                        System.out.println("You have no orchids");
                    } else {
                        for (int oz = 0; oz < o_num; oz++) {
                            System.out.print("O[" + oz + "]: ");
                            if (o[oz].life_getter()) {
                                System.out.print("Water received: " + o[oz].water_received_getter() + " | ");
                                System.out.print("Min water needed: " + o[oz].water_min_getter() + " | ");
                                System.out.println("Max water needed: " + o[oz].water_max_getter() + "  ");
                                System.out.print("Fertilizer received: " + o[oz].fertilizer_received_getter() + " | ");
                                System.out.print("Min fertilizer needed: " + o[oz].fertilizer_min_getter() + " | ");
                                System.out.print("Max fertilizer needed: " + o[oz].fertilizer_max_getter() + " \n");
                                System.out.println("Current insect infestation: " + o[oz].ist.status());
                            } else {
                                System.out.println("DEAD!");
                            }
                        }
                    }
                }

                // Option 2: Water a plant.
                else if (lvl1 == 2) {
                    int lvl2 = 0;
                    System.out.println("");
                    System.out.println("Water");
                    System.out.println("Which plant type would you like to water?");
                    System.out.println("Enter the number that corresponds with your choice");
                    System.out.println("| 1 | Rose");
                    System.out.println("| 2 | Daisy");
                    System.out.println("| 3 | Cactus");
                    System.out.println("| 4 | Orchids");
                    System.out.println("| 5 | Cancel / Go back");

                    Scanner lvl2_picker = new Scanner(System.in);
                    System.out.print(">>");
                    lvl2 = lvl2_picker.nextInt();

                    // Rose
                    if (lvl2 == 1) {
                        Scanner rose_zone = new Scanner(System.in);
                        System.out.println("Which rose?");
                        for (int i = 0; i < r.length; i++) {
                            int ii = i + 1;  // Is this worth it?
                            System.out.println("| " + ii + " |	R[" + i + "]");
                        }
                        System.out.print(">>");
                        int lvl3 = rose_zone.nextInt();

                        System.out.println("How many times do you want to water this rose?");
                        System.out.print(">>");
                        int num = rose_zone.nextInt();

                        System.out.println("Are you sure you want to water R[" + lvl3 + "] " + num + " times?");
                        System.out.println("| 1 | Yes");
                        System.out.println("| 2 | No, cancel");

                        System.out.print(">>");
                        int confirm = rose_zone.nextInt();
                        if (confirm == 1) {
                            r[lvl3 - 1].water_this_plant(num);
                            log.write_line("Watered rose " + (lvl3 - 1) + " " + num + " times", day);
                        }

                    }

                    // Daisy
                    if (lvl2 == 2) {
                        Scanner daisy_zone = new Scanner(System.in);
                        System.out.println("Which daisy?");
                        for (int i = 0; i < d.length; i++) {
                            int ii = i + 1;  // Is this worth it?
                            System.out.println("| " + ii + " |	D[" + i + "]");
                        }
                        System.out.print(">>");
                        int lvl3 = daisy_zone.nextInt();

                        System.out.println("How many times do you want to water this daisy?");
                        System.out.print(">>");
                        int num = daisy_zone.nextInt();

                        System.out.println("Are you sure you want to water D[" + lvl3 + "] " + num + " times?");
                        System.out.println("| 1 | Yes");
                        System.out.println("| 2 | No, cancel");

                        System.out.print(">>");
                        int confirm = daisy_zone.nextInt();
                        if (confirm == 1) {
                            d[lvl3 - 1].water_this_plant(num);
                            log.write_line("Watered daisy " + (lvl3 - 1) + " " + num + " times", day);
                        }
                    }

                    // Cactus
                    if (lvl2 == 3) {
                        Scanner cactus_zone = new Scanner(System.in);
                        System.out.println("Which cacti?");
                        for (int i = 0; i < c.length; i++) {
                            int ii = i + 1;  // Is this worth it?
                            System.out.println("| " + ii + " |	D[" + i + "]");
                        }
                        System.out.print(">>");
                        int lvl3 = cactus_zone.nextInt();

                        System.out.println("How many times do you want to water this daisy?");
                        System.out.print(">>");
                        int num = cactus_zone.nextInt();

                        System.out.println("Are you sure you want to water D[" + lvl3 + "] " + num + " times?");
                        System.out.println("| 1 | Yes");
                        System.out.println("| 2 | No, cancel");

                        System.out.print(">>");
                        int confirm = cactus_zone.nextInt();
                        if (confirm == 1) {
                            c[lvl3 - 1].water_this_plant(num);
                            log.write_line("Watered cacti " + (lvl3 - 1) + " " + num + " times", day);
                        }
                    }

                    // Orchids
                    if (lvl2 == 4) {
                        Scanner orchid_zone = new Scanner(System.in);
                        System.out.println("Which orchid?");
                        for (int i = 0; i < o.length; i++) {
                            int ii = i + 1;  // Is this worth it?
                            System.out.println("| " + ii + " |	O[" + i + "]");
                        }
                        System.out.print(">>");
                        int lvl3 = orchid_zone.nextInt();

                        System.out.println("How many times do you want to water this orchid?");
                        System.out.print(">>");
                        int num = orchid_zone.nextInt();

                        System.out.println("Are you sure you want to water O[" + lvl3 + "] " + num + " times?");
                        System.out.println("| 1 | Yes");
                        System.out.println("| 2 | No, cancel");

                        System.out.print(">>");
                        int confirm = orchid_zone.nextInt();
                        if (confirm == 1) {
                            o[lvl3 - 1].water_this_plant(num);
                            log.write_line("Watered orchids " + (lvl3 - 1) + " " + num + " times", day);
                        }
                    }

                }

                // Option 3: Fertilize a plant.
                else if (lvl1 == 3) {
                    int lvl2 = 0;
                    System.out.println("");
                    System.out.println("Fertilize");
                    System.out.println("Which plant type would you like to fertilize?");
                    System.out.println("Enter the number that corresponds with your choice");
                    System.out.println("| 1 | Rose");
                    System.out.println("| 2 | Daisy");
                    System.out.println("| 3 | Cactus");
                    System.out.println("| 4 | Orchids");
                    System.out.println("| 5 | Fertilizer");
                    System.out.println("| 6 | Cancel / Go back");

                    Scanner lvl2_picker = new Scanner(System.in);
                    System.out.print(">>");
                    lvl2 = lvl2_picker.nextInt();

                    // Rose
                    if (lvl2 == 1) {
                        Scanner rose_zone = new Scanner(System.in);
                        System.out.println("Which rose?");
                        for (int i = 0; i < r.length; i++) {
                            int ii = i + 1;  // Is this worth it?
                            System.out.println("| " + ii + " |	R[" + i + "]");
                        }
                        System.out.print(">>");
                        int lvl3 = rose_zone.nextInt();

                        System.out.println("How many times do you want to fertilize this rose?");
                        System.out.print(">>");
                        int num = rose_zone.nextInt();

                        System.out.println("Are you sure you want to fertilize R[" + lvl3 + "] " + num + " times?");
                        System.out.println("| 1 | Yes");
                        System.out.println("| 2 | No, cancel");

                        System.out.print(">>");
                        int confirm = rose_zone.nextInt();
                        if (confirm == 1) {
                            r[lvl3 - 1].fertilize_this_plant(num);
                            log.write_line("Fertilized rose " + (lvl3 -1) + " " + num + " times", day);
                        }

                    }

                    // Daisy
                    if (lvl2 == 2) {
                        Scanner daisy_zone = new Scanner(System.in);
                        System.out.println("Which daisy?");
                        for (int i = 0; i < d.length; i++) {
                            int ii = i + 1;  // Is this worth it?
                            System.out.println("| " + ii + " |	D[" + i + "]");
                        }
                        System.out.print(">>");
                        int lvl3 = daisy_zone.nextInt();

                        System.out.println("How many times do you want to fertilize this daisy?");
                        System.out.print(">>");
                        int num = daisy_zone.nextInt();

                        System.out.println("Are you sure you want to fertilize D[" + lvl3 + "] " + num + " times?");
                        System.out.println("| 1 | Yes");
                        System.out.println("| 2 | No, cancel");

                        System.out.print(">>");
                        int confirm = daisy_zone.nextInt();
                        if (confirm == 1) {
                            d[lvl3 - 1].fertilize_this_plant(num);
                            log.write_line("Fertilized daisy " + (lvl3 -1) + " " + num + " times", day);
                        }
                    }

                    // Cactus
                    if (lvl2 == 3) {
                        Scanner cactus_zone = new Scanner(System.in);
                        System.out.println("Which cactus?");
                        for (int i = 0; i < c.length; i++) {
                            int ii = i + 1;  // Is this worth it?
                            System.out.println("| " + ii + " |	C[" + i + "]");
                        }
                        System.out.print(">>");
                        int lvl3 = cactus_zone.nextInt();

                        System.out.println("How many times do you want to fertilize this cactus?");
                        System.out.print(">>");
                        int num = cactus_zone.nextInt();

                        System.out.println("Are you sure you want to fertilize C[" + lvl3 + "] " + num + " times?");
                        System.out.println("| 1 | Yes");
                        System.out.println("| 2 | No, cancel");

                        System.out.print(">>");
                        int confirm = cactus_zone.nextInt();
                        if (confirm == 1) {
                            c[lvl3 - 1].fertilize_this_plant(num);
                            log.write_line("Fertilized cacti " + (lvl3 -1) + " " + num + " times", day);
                        }
                    }


                    // Orchids
                    if (lvl2 == 4) {
                        Scanner orchid_zone = new Scanner(System.in);
                        System.out.println("Which orchid?");
                        for (int i = 0; i < c.length; i++) {
                            int ii = i + 1;  // Is this worth it?
                            System.out.println("| " + ii + " |	O[" + i + "]");
                        }
                        System.out.print(">>");
                        int lvl3 = orchid_zone.nextInt();

                        System.out.println("How many times do you want to fertilize this orchid?");
                        System.out.print(">>");
                        int num = orchid_zone.nextInt();

                        System.out.println("Are you sure you want to fertilize O[" + lvl3 + "] " + num + " times?");
                        System.out.println("| 1 | Yes");
                        System.out.println("| 2 | No, cancel");

                        System.out.print(">>");
                        int confirm = orchid_zone.nextInt();
                        if (confirm == 1) {
                            o[lvl3 - 1].fertilize_this_plant(num);
                            log.write_line("Fertilized orchids " + (lvl3 -1) + " " + num + " times", day);
                        }
                    }



                }

                // Option 4: use pesticides or ladybugs
                else if(lvl1 == 4) {
                    System.out.println("");
                    System.out.println("Pesticides / Ladybugs");
                    System.out.println("Which plant type would you like to spray?");
                    System.out.println("Enter the number that corresponds with your choice");
                    System.out.println("| 1 | Rose");
                    System.out.println("| 2 | Daisy");
                    System.out.println("| 3 | Cactus");
                    System.out.println("| 4 | Orchids");
                    System.out.println("| 5 | Cancel / Go back");

                    int lvl2 = 0;

                    Scanner lvl2_picker = new Scanner(System.in);
                    System.out.print(">>");
                    lvl2 = lvl2_picker.nextInt();

                    // Rose
                    if (lvl2 == 1) {
                        Scanner rose_zone = new Scanner(System.in);
                        System.out.println("Which rose?");
                        for (int i = 0; i < r.length; i++) {
                            int ii = i + 1;  // Is this worth it?
                            System.out.println("| " + ii + " |	R[" + i + "]");
                        }
                        System.out.print(">>");
                        int lvl3 = rose_zone.nextInt();

                        System.out.println("Do you want to use pesticides(1) or ladybugs(2)? or cancel (3)");
                        System.out.print(">>");
                        int num = rose_zone.nextInt();
                        while(num != 1 && num != 2 && num != 3) {
                            System.out.println("Please enter 1 for pesticides or 2 for ladybugs, 3 to cancel.");
                        }

                        if(num == 1) {
                            System.out.println(r[lvl3 - 1].ist.pesticide());
                            r[lvl3 -1].water_max_setter(3);
                            r[lvl3 -1].water_min_setter(3);
                            log.write_line("Sprayed pesticides on rose " + (lvl3 -1), day);
                        }
                        else if(num == 2) {
                            System.out.println(r[lvl3 -1].ist.ladybug());
                            log.write_line("Put ladybugs on rose " + (lvl3 -1), day);
                        }

                    }

                    // Daisy
                    if (lvl2 == 2) {
                        Scanner daisy_zone = new Scanner(System.in);
                        System.out.println("Which daisy?");
                        for (int i = 0; i < d.length; i++) {
                            int ii = i + 1;  // Is this worth it?
                            System.out.println("| " + ii + " |	D[" + i + "]");
                        }
                        System.out.print(">>");
                        int lvl3 = daisy_zone.nextInt();

                        System.out.println("Do you want to use pesticides(1) or ladybugs(2)? or cancel (3)");
                        System.out.print(">>");
                        int num = daisy_zone.nextInt();
                        while(num != 1 && num != 2 && num != 3) {
                            System.out.println("Please enter 1 for pesticides or 2 for ladybugs, 3 to cancel.");
                        }

                        if(num == 1) {
                            System.out.println(d[lvl3 - 1].ist.pesticide());
                            d[lvl3 -1].water_max_setter(3);
                            d[lvl3 -1].water_min_setter(3);
                            log.write_line("Sprayed pesticides on daisy " + (lvl3 -1), day);
                        }
                        else if(num == 2) {
                            System.out.println(d[lvl3 -1].ist.ladybug());
                            log.write_line("Put ladybugs on daisy " + (lvl3 -1), day);
                        }
                    }

                    // Cactus
                    if (lvl2 == 3) {
                        Scanner cactus_zone = new Scanner(System.in);
                        System.out.println("Which cactus?");
                        for (int i = 0; i < c.length; i++) {
                            int ii = i + 1;  // Is this worth it?
                            System.out.println("| " + ii + " |	C[" + i + "]");
                        }
                        System.out.print(">>");
                        int lvl3 = cactus_zone.nextInt();

                        System.out.println("Do you want to use pesticides(1) or ladybugs(2)? or cancel (3)");
                        System.out.print(">>");
                        int num = cactus_zone.nextInt();
                        while(num != 1 && num != 2 && num != 3) {
                            System.out.println("Please enter 1 for pesticides or 2 for ladybugs, 3 to cancel.");
                        }

                        if(num == 1) {
                            System.out.println(c[lvl3 - 1].ist.pesticide());
                            c[lvl3 -1].water_max_setter(3);
                            c[lvl3 -1].water_min_setter(3);
                            log.write_line("Sprayed pesticides on cacti " + (lvl3 -1), day);
                        }
                        else if(num == 2) {
                            System.out.println(d[lvl3 -1].ist.ladybug());
                            log.write_line("Put ladybugs on cacti " + (lvl3 -1), day);
                        }
                    }

                    // Orchids
                    if (lvl2 == 3) {
                        Scanner orchid_zone = new Scanner(System.in);
                        System.out.println("Which orchid?");
                        for (int i = 0; i < o.length; i++) {
                            int ii = i + 1;  // Is this worth it?
                            System.out.println("| " + ii + " |	O[" + i + "]");
                        }
                        System.out.print(">>");
                        int lvl3 = orchid_zone.nextInt();

                        System.out.println("Do you want to use pesticides(1) or ladybugs(2)? or cancel (3)");
                        System.out.print(">>");
                        int num = orchid_zone.nextInt();
                        while(num != 1 && num != 2 && num != 3) {
                            System.out.println("Please enter 1 for pesticides or 2 for ladybugs, 3 to cancel.");
                        }

                        if(num == 1) {
                            System.out.println(c[lvl3 - 1].ist.pesticide());
                            o[lvl3 -1].water_max_setter(3);
                            o[lvl3 -1].water_min_setter(3);
                            log.write_line("Sprayed pesticides on orchids " + (lvl3 -1), day);
                        }
                        else if(num == 2) {
                            System.out.println(o[lvl3 -1].ist.ladybug());
                            log.write_line("Put ladybugs on orchids " + (lvl3 -1), day);
                        }
                    }

                }

                // Option 5: Next Day
                else if (lvl1 == 5) {
                    grim_reaper g = new grim_reaper();
                    r = g.rose_killer(r);
                    d = g.daisy_killer(d);

                    day = day + 1;
                    lvl0 = 0;
                    System.out.println("Day is over.");

                    father_time f = new father_time();
                    r = f.rose_ager(r);
                    d = f.daisy_ager(d);
                }
            }


        }


    }


}


