package project;

public class Location {

	private String address;
	private double latitude;
	private double longitude;
	private int location_id;
	
	public String getAddress() {
		return this.address;
	}
	
	public double getLat() {
		return this.latitude;
	}
	
	public double getLong() {
		return this.longitude;
	}
	
	public int getID() {
		return this.location_id;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setLat(double latitude) {
		this.latitude = latitude;
	}
	
	public void setLong(double longitude) {
		this.longitude = longitude;
	}
	
	public void setID(int location_id) {
		this.location_id = location_id;
	}
}
