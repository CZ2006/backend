package project;
import java.util.*; 

public class User {
	
	private String username;
	private String password;
	private String name;
	private String email;
	private Gender gender;
	private Date birthday;
	private String job;
	private ArrayList<String> interest;
	
	public User(String username, String password, String name, String email, Gender gender, Date birthday, String job, ArrayList<String> interest) {
		this.username = username.toUpperCase();
		this.name = name.toUpperCase();
		this.email = email.toUpperCase();
		this.gender = gender;
		this.birthday = birthday;
		this.job = job.toUpperCase();
		this.interest = interest; 
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public Gender getGender() {
		return this.gender;
	}
	
	public Date getBirthday() {
		return this.birthday;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public ArrayList<String> getInterest() {
		return this.interest;
	}
	
	public void setUsername(String username) {
		this.username = username.toUpperCase();
	}
	
	public void setPassword(String password) {
		this.password = password.toUpperCase();
	}
	
	public void setName(String name) {
		this.name = name.toUpperCase();
	}
	
	public void setEmail(String email) {
		this.email = email.toUpperCase();
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public void setJob(String job) {
		this.job = job.toUpperCase();
	}
	
	public void setInterest(ArrayList<String> interest) {
		this.interest = interest;
	}
	
}
