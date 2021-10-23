package application;

public class UserProfile extends Account {
	


	public UserProfile(String loginname, String email, String password, String campus, String fName, String lName, String info, String major) 
	{
		super(loginname, email, password);
		this.campus=campus;
		this.fName=fName;
		this.lName=lName;
		this.info=info;
		this.major=major;
		// TODO Auto-generated constructor stub
	}
	private String fName;
	private String campus;
	private String major;
	private String lName;
	private String info;
	

	public void setFname(String fName)
	{
		this.fName=fName;
	}
	public void setLname(String lName)
	{
		this.lName=lName;
	}
	public void setMajor(String major)
	{
		this.major=major;
	}
	public void setCampus(String campus)
	{
		this.campus=campus;
	}
	public void setinfo(String info)
	{
		this.info=info;
	}
	public String getFname()
	{
		return fName;
	}
	public String getLname()
	{
		return lName;
	}
	public String getCampus()
	{
		return campus;
	}
	public String getMajor()
	{
		return major;
	}
	public String getInfo()
	{
		return info;
	}
	@Override
	public String toString()
	{
		return (this.campus + " " + this.fName + " " + this.info + " " + this.lName + " " + this.major);
	}
	
	
}
