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

    public String ladybug() {
        kill(50);
        if(!alive) {
            return "All insects killed on plant";
        }
        else {
            return "50 insects killed on plant, " + num + " remain on plant.";
        }
    }

    public String pesticide() {
        kill(100);
        return "All insects killed on plant but the required fertilizer has increased due to the pesticide!";
    }

    public void kill(int spray) {
        type = "";
        days_on_plant = 0;
        num = num - spray;
        if(num <= 0) {
            alive = false;
        }
    }

    public String status() {
        if(alive) {
            return type + ", days on plant: " + days_on_plant + ", number of insects: " + num + "\n";
        }
        else return "none";
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
