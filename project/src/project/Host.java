package project;

import java.util.ArrayList;
import java.util.Date;

public class Host extends User {
	
	private ArrayList<Invitation> invitations;

	public Host(String username, String password, String name, String email, Gender gender, Date birthday, String job, ArrayList<String> interest) {
		super(username, password, name, email, gender, birthday, job, interest);
		this.invitations = new ArrayList<Invitation>();
	}
	
	public boolean createInvitation() {
		Invitation invitation = new Invitation();
		invitations.add(invitation);
		return true;
	}

	public void acceptRequest(Request request) {
		
	}
	
	public void rejectRequest(Request request) {
		
	}
	
}
