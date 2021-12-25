package mq.java.constructors;

public class gmail 
{

	public void Create_account() 
	{
		System.out.println("Account created");
	}
	
	public void Signin()
	{
		System.out.println("user logged in");
	}
	
	public void sent_mail_to_individual()
	{
		System.out.println("Email sent to individua");
	}
	
	public void main(String[] args)
	{
		gmail mail=new gmail();
		mail.Create_account();
		mail.Signin();
		mail.sent_mail_to_individual();
	}
	
}
