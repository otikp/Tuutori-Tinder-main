package application;

public class Account {
	
	private String loginname;
	private String password;
	private String email;
	

	public Account(String loginname, String email, String password) {
		// TODO Auto-generated constructor stub
		this.loginname=loginname;
		this.email=email;
		this.password=password;
	}

	public void setLoginname(String loginname)
	{
		this.loginname=loginname;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getLoginname()
	{
		return loginname;
	}
	public String getPassword()
	{
		return password;
	}
	public String getEmail()
	{
		return email;
	}
	@Override
	public String toString()
	{
		return ("Login: " + this.loginname + " " + "Password:" + this.password + " Email: " + this.email + "");
	}
	
	
	
	
	
}
