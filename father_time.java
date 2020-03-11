package garden;
import garden.*;

public class father_time
{
	//rose[] r;
	public rose[] rose_ager(rose[] r)
	{
		int len = r.length;
		for(int i=0; i<len; i++)
		{
			// Get, increment, and set water_min
			int min = r[i].water_min_getter(); // Get
			min = min + r[i].water_increment_getter(); // Increment
			r[i].water_min_setter(min); // Set

			int max = r[i].water_max_getter(); // Get
			max = max + r[i].water_increment_getter(); // Increment
			r[i].water_max_setter(max); // Set
		}
		return r; 
	}
	//daisy[] d;
	public daisy[] daisy_ager(daisy[] d)
	{
		int len = d.length;
		for(int i=0; i<len; i++)
		{
			// Get, increment, and set water_min
			int min = d[i].water_min_getter(); // Get
			min = min + d[i].water_increment_getter(); // Increment
			d[i].water_min_setter(min); // Set

			int max = d[i].water_max_getter(); // Get
			max = max + d[i].water_increment_getter(); // Increment
			d[i].water_max_setter(max); // Set
		}
		return d; 
	}
}
