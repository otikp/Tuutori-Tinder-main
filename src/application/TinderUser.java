package application;

public class TinderUser extends UserProfile {

	private boolean isTudor;
	private String skillz;
	
	
	public TinderUser(String loginname, String email, String password, String campus, String fName, String lName,
			String info, String major, boolean isTudor, String skillz) 
	{
		super(loginname, email, password, campus, fName, lName, info, major);
		// TODO Auto-generated constructor stub
		this.isTudor=isTudor;
		this.skillz=skillz;
	}
	public String getSkillz(String skillz)
	{
		return this.skillz;
	}
	public Boolean getisTudor(boolean isTudor)
	{
		return this.isTudor;
	}
	public void setSkillz(String skillz)
	{
		this.skillz=skillz;
	}
	public void setisTudor(boolean isTudor)
	{
		this.isTudor=isTudor;
	}
}
	
