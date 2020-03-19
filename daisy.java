package garden;
import garden.*;

iimport java.util.concurrent.ThreadLocalRandom;

public class daisy extends plant
{
    // Constructor for daisy
    public daisy()
    {
        ist = new insect();
        water_min_setter(ThreadLocalRandom.current().nextInt(0, 2));
        water_max_setter(ThreadLocalRandom.current().nextInt(3, 6));
        water_increment_setter(2); 
        fertilizer_min_setter(ThreadLocalRandom.current().nextInt(1,4));
        fertilizer_max_setter(ThreadLocalRandom.current().nextInt(5,8));
    }
}
