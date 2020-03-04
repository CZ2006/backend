package project;

import java.util.*;

public class Invitation {
	
	private Activity activity;
	private Date time_period;
	Location location;
	
	public Activity getActivity() {
		return this.activity;
	}
	
	public Date getTimePeriod() {
		return this.time_period;
	}
	
	public Location getLocation() {
		return this.location;
	}
	
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	
	public void setTimePeriod(Date time_period) {
		this.time_period = time_period;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
}
