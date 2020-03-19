public class plant
{
    // name and alive are not used yet
    private String name;
    private boolean alive;
    insect ist;

    // Naming conventions
    // variable_[received, min, max]
    // water_received
    // water_min
    // water_max

    private int water_received=0; // How many times this plant has been watered
    private int water_min; // Min water needed before DYING!!!!
    private int water_max; // Max water needed
    private int water_increment; // How much water goes up every day

    // This function is a getter for water_received
    public int water_received_getter()
    {
        return this.water_received;
    }

    // This function is a getter for min_water_needed
    public int water_min_getter()
    {
        return this.water_min;
    }

    // This function is a getter for max_water_needed
    public int water_max_getter()
    {
        return this.water_max;
    }

    public int water_increment_getter()
    {
        return this.water_increment;
    }

    // This function is a setter for water_needed
    // Every plant type (rose, daisy, etc) just has to use this to define how much water it needs
    public void water_min_setter(int x)
    {
        this.water_min=x;
        // this.water_increment=x; // setter is only called when plant is constructed.
    }

    // This function is a setter for water_max
    // Every plant type (rose, daisy, etc) just has to use this to define how much water it needs
    public void water_max_setter(int x)
    {
        this.water_max=x;
    }

    public void water_increment_setter(int x)
    {
        this.water_increment=x;
    }

    // This function waters the plant n times. +N to water_received
    public void water_this_plant(int n)
    {
        this.water_received = this.water_received + n;
    }
}