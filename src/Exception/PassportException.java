package Exception;

public class PassportException extends Exception//in this is compiletime Exception we put runtime Exception also to clear error in compiletime
{
	public static void main(String[] args) 
	{
		PassportException p=new PassportException();

	}
	public void checkNationality(String nationality)throws PassportException//throws used with methods only
	{
		if(nationality.equals("india"))
		{
			System.out.println("you are eligible..");
		}
		else
		{
			PassportException p=new PassportException();
			throw p;//throw the object 
			
		}
	}
}
