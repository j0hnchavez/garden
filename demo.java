package garden;
import garden.*;

public class demo
{
	public static void main(String[] args)
	{
		rose r = new rose();
		System.out.println("Rose has been watered "+r.water_received_getter()+" times");
		System.out.println("Roses need to be watered "+r.water_needed_getter()+" times");
		System.out.println("Watering... (user will make this happen)");
		r.water_this_plant();
		System.out.println("Rose has been watered "+r.water_received_getter()+" times");
	}
}
