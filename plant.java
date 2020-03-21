public class plant
{
    // name is not used yet
    private String name;

    // Naming conventions
    // variable_[received, min, max]
    // water_received
    // water_min
    // water_max
    //fertilizer_min
    //fertilizer_max

    private int water_received=0; // How many times this plant has been watered
    private int water_min; // Min water needed before DYING!!!!
    private int water_max; // Max water needed
    private int water_increment; // How much water goes up every day
    public boolean alive=true;
    private int fertilizer_received=0; // How many times this plant has been fertilized
    private int fertilizer_min; // Min fertilizer needed
    private int fertilizer_max; // Max fertilizer needed
    private int fertilizer_increment; // How much fertilizer goes up every day
    insect ist;

    /////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////             GETTERS             ////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////

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

    // Return the life value of plant
    public boolean life_getter()
    {
        return alive;
    }

    //This function is a getter for fertilizer received
    public int fertilizer_received_getter() {return this.fertilizer_received; }

    // This function is a getter for fertilizer_min
    public int fertilizer_min_getter()
    {
        return this.fertilizer_min;
    }

    // This function is a getter for fertilizer_max
    public int fertilizer_max_getter()
    {
        return this.fertilizer_max;
    }

    //This function is a getter for how much water was incremented by
    public int fertilizer_increment_getter() {return this.fertilizer_increment; }
    /////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////             SETTERS             ////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////


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

    // Set the life value of plant
    public void life_setter(boolean a)
    {
        this.alive=a;
    }

    //This function is a setter for fertilizer_min
    // Every plant type (rose, daisy, etc) just has to use this to define how much fertilizer it needs
    public void fertilizer_min_setter(int x)
    {
        this.fertilizer_min=x;
    }

    // This function is a setter for fertilizer_max
    // Every plant type (rose, daisy, etc) just has to use this to define how much fertilizer it needs
    public void fertilizer_max_setter(int x)
    {
        this.fertilizer_max=x;
    }

    public void fertilizer_increment_setter(int x) {this.fertilizer_increment=x; }

    //This function fertilizes the plant n times. +N to fertilizer_received
    public void fertilize_this_plant(int n) { this.fertilizer_received = this.water_received + n;}
}
