package garden;
import garden.*;

public class rose extends plant
{
	// Constructor for rose which sets water_needed to 2
	// Other plants will do water_needed_setter() with other values
	public rose()
	{
		water_min_setter(2);
		water_max_setter(6);
		water_increment_setter(3);	
	}
}
