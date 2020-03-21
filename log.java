import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class log {
    static File garden_log;
    public static void create_log() {
        System.out.println("Creating log...");
        try {
            garden_log = new File("log.txt");
            if (garden_log.createNewFile()) {
                System.out.println("File created: " + garden_log.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void write_line(String s, int d) {
        try {
            // Open given file in append mode.
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(garden_log, true));
            out.write( "Day: " + d + " " + s + "\n");
            out.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }

}