package application;

//tämä luokka luo tuutor-olion
public class Users {
	private String name;
	private String major;
	private String skill;
	private String email;
	
	
	public Users(String name, String bio, String skill, String email) {
		this.name = name;
		this.major = bio;
		this.skill = skill;
		this.email = email;
	}
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor()
	{
		return this.major;
	}
	public String getSkill()
	{
		return this.skill;
	}
	public String getEmail()
	{
		return this.email;
	}
}

