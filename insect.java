import java.util.concurrent.ThreadLocalRandom;

public class insect {
    String type;
    int days_on_plant;
    boolean alive;
    int num;

    public insect() {
        type = "";
        days_on_plant = 0;
        alive = false;
        num = 0;
    }

    public void kill(int perc_killed) {
        type = "";
        days_on_plant = 0;
        alive = false;
        int killed = (perc_killed/100) * num;
        num = num - killed;
    }
}

class aphid extends insect {
    public aphid() {
        type = "aphid";
        days_on_plant = 0;
        alive = true;
        num = ThreadLocalRandom.current().nextInt(20, 101);
    }
}

class leaf_miner extends insect {
    public leaf_miner() {
        type = "leaf_miner";
        days_on_plant = 0;
        alive = true;
        num = ThreadLocalRandom.current().nextInt(40, 60);
    }
}
