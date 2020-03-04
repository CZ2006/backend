package project;

import java.util.ArrayList;
import java.util.Date;

public class Participant extends User {

	private ArrayList<Request> requests;
	
	public Participant(String username, String password, String name, String email, Gender gender, Date birthday, String job, ArrayList<String> interest) {
		super(username, password, name, email, gender, birthday, job, interest);
		this.requests = new ArrayList<Request>();
	}
	
	public boolean sendRequest() {
		Request request = new Request();
		requests.add(request);
		return true;
	}

	public void removeRequest(Request request) {
		requests.remove(request);
	}
	
}
