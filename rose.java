import java.util.concurrent.ThreadLocalRandom;

public class rose extends plant
{
    // Constructor for rose which sets water_needed to 2
    // Other plants will do water_needed_setter() with other values
    public rose()
    {
        ist = new insect();
        water_min_setter(ThreadLocalRandom.current().nextInt(1, 4));
        water_max_setter(ThreadLocalRandom.current().nextInt(5, 10));
        water_increment_setter(3);
        fertilizer_min_setter(ThreadLocalRandom.current().nextInt(1,3));
        fertilizer_max_setter(ThreadLocalRandom.current().nextInt(4,6));
    }
}
