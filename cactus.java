import java.util.concurrent.ThreadLocalRandom;

public class cactus extends plant {
    // Constructor for rose which sets water_needed to 2
    // Other plants will do water_needed_setter() with other values
    public cactus()
    {
        ist = new insect();
        water_min_setter(ThreadLocalRandom.current().nextInt(0, 2));
        water_max_setter(ThreadLocalRandom.current().nextInt(0, 2));
        water_increment_setter(1);
        fertilizer_min_setter(ThreadLocalRandom.current().nextInt(1,2));
        fertilizer_max_setter(ThreadLocalRandom.current().nextInt(3,4));
    }
}
