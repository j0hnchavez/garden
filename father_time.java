import java.util.concurrent.ThreadLocalRandom;

public class father_time
{
    //rose[] r;
    public rose[] rose_ager(rose[] r)
    {
        int len = r.length;
        int bugs;
        for(int i=0; i<len; i++)
        {
            // Get, increment, and set water_min
            int min = r[i].water_min_getter(); // Get
            min = min + r[i].water_increment_getter(); // Increment
            r[i].water_min_setter(min); // Set

            int max = r[i].water_max_getter(); // Get
            max = max + r[i].water_increment_getter(); // Increment
            r[i].water_max_setter(max); // Set

            int fmin = r[i].fertilizer_min_getter(); //Get
            fmin = fmin + r[i].fertilizer_increment_getter(); // Increment
            r[i].fertilizer_min_setter(fmin); // Set

            int fmax = r[i].fertilizer_max_getter(); //Get
            fmax = fmax + r[i].fertilizer_increment_getter(); // Increment
            r[i].fertilizer_min_setter(fmax); // Set

            bugs = ThreadLocalRandom.current().nextInt(0, 8);
            if(bugs == 1 && !r[i].ist.alive && r[i].alive) {
                r[i].ist = new aphid();
                System.out.println("Alert: One of your plants has been infected with aphids!");
                log.write_line("Rose " + i + " has been infected with aphids", demo.day);
            }
            else if(bugs == 2 && !r[i].ist.alive && r[i].alive) {
                r[i].ist = new leaf_miner();
                System.out.println("Alert: One of your plants has been infected with leaf miners!");
                log.write_line("Rose " + i + " has been infected with leaf miners", demo.day);
            }
        }
        return r;
    }
    //daisy[] d;
    public daisy[] daisy_ager(daisy[] d)
    {
        int len = d.length;
        int bugs;
        for(int i=0; i<len; i++)
        {
            // Get, increment, and set water_min
            int min = d[i].water_min_getter(); // Get
            min = min + d[i].water_increment_getter(); // Increment
            d[i].water_min_setter(min); // Set

            int max = d[i].water_max_getter(); // Get
            max = max + d[i].water_increment_getter(); // Increment
            d[i].water_max_setter(max); // Set

            int fmin = d[i].fertilizer_min_getter(); //Get
            fmin = fmin + d[i].fertilizer_increment_getter(); // Increment
            d[i].fertilizer_min_setter(fmin); // Set

            int fmax = d[i].fertilizer_max_getter(); //Get
            fmax = fmax + d[i].fertilizer_increment_getter(); // Increment
            d[i].fertilizer_min_setter(fmax); // Set

            bugs = ThreadLocalRandom.current().nextInt(0, 12);
            if(bugs == 1 && !d[i].ist.alive && d[i].alive) {
                d[i].ist = new aphid();
                System.out.println("Alert: One of your plants has been infected with aphids!");
                log.write_line("Daisy " + i + " has been infected with aphids", demo.day);
            }
            else if(bugs == 2 && !d[i].ist.alive  && d[i].alive) {
                d[i].ist = new leaf_miner();
                System.out.println("Alert: One of your plants has been infected with leaf miners!");
                log.write_line("Daisy " + i + " has been infected with leaf miners", demo.day);
            }
        }
        return d;
    }

    //cactus[] c;
    public cactus[] cactus_ager(cactus[] c)
    {
        int len = c.length;
        int bugs;
        for(int i=0; i<len; i++)
        {
            // Get, increment, and set water_min
            int min = c[i].water_min_getter(); // Get
            min = min + c[i].water_increment_getter(); // Increment
            c[i].water_min_setter(min); // Set

            int max = c[i].water_max_getter(); // Get
            max = max + c[i].water_increment_getter(); // Increment
            c[i].water_max_setter(max); // Set

            int fmin = c[i].fertilizer_min_getter(); //Get
            fmin = fmin + c[i].fertilizer_increment_getter(); // Increment
            c[i].fertilizer_min_setter(fmin); // Set

            int fmax = c[i].fertilizer_max_getter(); //Get
            fmax = fmax + c[i].fertilizer_increment_getter(); // Increment
            c[i].fertilizer_min_setter(fmax); // Set

            bugs = ThreadLocalRandom.current().nextInt(0, 8);
            if(bugs == 1 && !c[i].ist.alive && c[i].alive) {
                c[i].ist = new aphid();
                System.out.println("Alert: One of your plants has been infected with aphids!");
                log.write_line("Cactus " + i + " has been infected with aphids", demo.day);
            }
            else if(bugs == 2 && !c[i].ist.alive && c[i].alive) {
                c[i].ist = new leaf_miner();
                System.out.println("Alert: One of your plants has been infected with leaf miners!");
                log.write_line("Cactus " + i + " has been infected with leaf miners", demo.day);
            }
        }
        return c;
    }

    //orchid[] o;
    public orchid[] orchid_ager(orchid[] o)
    {
        int len = o.length;
        int bugs;
        for(int i=0; i<len; i++)
        {
            // Get, increment, and set water_min
            int min = o[i].water_min_getter(); // Get
            min = min + o[i].water_increment_getter(); // Increment
            o[i].water_min_setter(min); // Set

            int max = o[i].water_max_getter(); // Get
            max = max + o[i].water_increment_getter(); // Increment
            o[i].water_max_setter(max); // Set

            int fmin = o[i].fertilizer_min_getter(); //Get
            fmin = fmin + o[i].fertilizer_increment_getter(); // Increment
            o[i].fertilizer_min_setter(fmin); // Set

            int fmax = o[i].fertilizer_max_getter(); //Get
            fmax = fmax + o[i].fertilizer_increment_getter(); // Increment
            o[i].fertilizer_min_setter(fmax); // Set

            bugs = ThreadLocalRandom.current().nextInt(0, 8);
            if(bugs == 1 && !o[i].ist.alive && o[i].alive) {
                o[i].ist = new aphid();
                System.out.println("Alert: One of your plants has been infected with aphids!");
                log.write_line("Orchid " + i + " has been infected with aphids", demo.day);
            }
            else if(bugs == 2 && !o[i].ist.alive && o[i].alive) {
                o[i].ist = new leaf_miner();
                System.out.println("Alert: One of your plants has been infected with leaf miners!");
                log.write_line("Orchid " + i + " has been infected with leaf miners", demo.day);
            }
        }
        return o;
    }

}
