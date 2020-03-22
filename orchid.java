import java.util.concurrent.ThreadLocalRandom;

public class orchid extends plant
{
    // Constructor for daisy
    public orchid()
    {
        ist = new insect();
        water_min_setter(ThreadLocalRandom.current().nextInt(10, 15));
        water_max_setter(ThreadLocalRandom.current().nextInt(15, 20));
        water_increment_setter(2);
        fertilizer_min_setter(ThreadLocalRandom.current().nextInt(5,10));
        fertilizer_max_setter(ThreadLocalRandom.current().nextInt(8,10));
    }
}