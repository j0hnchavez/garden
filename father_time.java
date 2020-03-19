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
            bugs = ThreadLocalRandom.current().nextInt(0, 8);
            if(bugs == 1 && !r[i].ist.alive) {
                r[i].ist = new aphid();
                System.out.println("Alert: One of your plants has been infected with aphids!");
            }
            else if(bugs == 2 && !r[i].ist.alive) {
                r[i].ist = new leaf_miner();
                System.out.println("Alert: One of your plants has been infected with leaf miners!");
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

            bugs = ThreadLocalRandom.current().nextInt(0, 12);
            if(bugs == 1 && !d[i].ist.alive) {
                d[i].ist = new aphid();
                System.out.println("Alert: One of your plants has been infected with aphids!");
            }
            else if(bugs == 2 && !d[i].ist.alive) {
                d[i].ist = new leaf_miner();
                System.out.println("Alert: One of your plants has been infected with leaf miners!");
            }
        }
        return d;
    }
}