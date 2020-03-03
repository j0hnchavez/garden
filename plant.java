package garden;
import garden.*;

public class plant
{
	// name and alive are not used yet
	private String name;
	private boolean alive;
	// Water received: how many times plant has been watered
	private int water_received=0;
	// Water needed: how much water this plant needs
	private int water_needed;

	// This function is a getter for water_received
	public int water_received_getter()
	{
		return this.water_received;
	}

	// This function is a getter for water_needed
	public int water_needed_getter()
	{
		return this.water_needed;
	}
	
	// This function is a setter for water_needed
	// Every plant type (rose, daisy, etc) just has to use this to define how much water it needs
	public void water_needed_setter(int x)
	{
		this.water_needed=x;
	}

	// This function waters the plant. +1 to water_received
	public void water_this_plant()
	{
		this.water_received = this.water_received + 1;
	}
}
