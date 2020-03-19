import java.util.concurrent.ThreadLocalRandom;

public class daisy extends plant
{
    // Constructor for daisy
    public daisy()
    {
        ist = new insect();
        water_min_setter(ThreadLocalRandom.current().nextInt(0, 2));
        water_max_setter(ThreadLocalRandom.current().nextInt(3, 6));
        water_increment_setter(2);
    }
}