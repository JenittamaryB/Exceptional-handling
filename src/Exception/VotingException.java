package Exception;

public class VotingException extends RuntimeException// this RuntimeException to show exception or error at runtime
{
	public static void main(String[] args)throws VotingException 
	{
		VotingException n=new VotingException();
		n.verifyCode(18);
		//n.verifyCode(7);//this throws an exception
		try {
		n.verifyCode(7);
		}
		catch(Exception e) 
		{
		System.out.println(n.getMessage());
		System.out.println("bye");
	}
	}
	
	

	public void verifyCode(int age) throws VotingException
	{
		if(age>=18)
		{
			System.out.println(" eligible your OTP is.. 12&0");
		}
		else {
			VotingException v =new VotingException();
			throw v;
			
		}

}
}
