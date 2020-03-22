public class grim_reaper
{
    public rose[] rose_killer(rose[] r)
    {
        for(int i=0; i<r.length; i++)
        {
            if(
                    (r[i].water_max_getter() < r[i].water_received_getter()) ||
                            (r[i].water_min_getter() > r[i].water_received_getter()) || // Add more later
                            (r[i].fertilizer_max_getter() < r[i].water_received_getter()) ||
                            (r[i].fertilizer_min_getter() > r[i].fertilizer_received_getter()) ||
                            (r[i].ist.days_on_plant > 3)
            )
            {
                r[i].life_setter(false); // set alive to "false"
                log.write_line("Rose " + i + " has perished.", demo.day);
            }
	/*
			else{
				System.out.println("no kill");
				r[i].life_setter(true); // default set alive to "true"
			}
	*/
        }
        return r;
    }
    public daisy[] daisy_killer(daisy[] d)
    {
        for(int i=0; i<d.length; i++)
        {
            if(
                    d[i].water_max_getter() < d[i].water_received_getter() ||
                            d[i].water_min_getter() > d[i].water_received_getter() ||// Add more later
                            (d[i].fertilizer_max_getter() < d[i].water_received_getter()) ||
                            (d[i].fertilizer_min_getter() > d[i].fertilizer_received_getter()) ||
                            (d[i].ist.days_on_plant > 3)
            )
            {
                // Log death
                d[i].life_setter(false); // set alive to "false"
                log.write_line("Daisy " + i + " has perished.", demo.day);
            }
        }
        return d;
    }


    public cactus[] cactus_killer(cactus[] c)
    {
        for(int i=0; i<c.length; i++)
        {
            if(
                    c[i].water_max_getter() < c[i].water_received_getter() ||
                            c[i].water_min_getter() > c[i].water_received_getter() ||// Add more later
                            (c[i].fertilizer_max_getter() < c[i].water_received_getter()) ||
                            (c[i].fertilizer_min_getter() > c[i].fertilizer_received_getter()) ||
                            (c[i].ist.days_on_plant > 3)
            )
            {
                // Log death
                c[i].life_setter(false); // set alive to "false"
                log.write_line("Cactus " + i + " has perished.", demo.day);
            }
        }
        return c;
    }

    public orchid[] orchid_killer(orchid[] o)
    {
        for(int i=0; i<o.length; i++)
        {
            if(
                    o[i].water_max_getter() < o[i].water_received_getter() ||
                            o[i].water_min_getter() > o[i].water_received_getter() ||// Add more later
                            (o[i].fertilizer_max_getter() < o[i].water_received_getter()) ||
                            (o[i].fertilizer_min_getter() > o[i].fertilizer_received_getter()) ||
                            (o[i].ist.days_on_plant > 3)
            )
            {
                // Log death
                o[i].life_setter(false); // set alive to "false"
                log.write_line("Orchid " + i + " has perished.", demo.day);
            }
        }
        return o;
    }


}
