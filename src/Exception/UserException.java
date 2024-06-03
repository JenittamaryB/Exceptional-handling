package Exception;

public class UserException {

	public static void main(String[] args) throws PassportException
	{
		PassportException u=new PassportException();
		u.checkNationality("india");
		u.checkNationality("kenya");//it is call method in passport class it is same print india not same throws exception in main method
		/*try 
		 {
		u.checkNationality("kenya");
		}
		catch(PassportException e) 
		{
			System.out.println(e.getMessage());
			e.getStackTrace();		
			}*/
	}

}
