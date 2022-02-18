import java.util.Scanner;
public final class login {
	int logAT=3;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String userID="Ajay",passwd="password";
		int logAT=0;
		while(true) 
		{
			System.out.println("Please Enter User ID");
			String uID=sc.next();
			System.out.println("Please Enter Passowrd");
			String pWD=sc.next();
			if(uID.equals(userID) && pWD.equals(passwd))
			{
				System.out.println("Welcome"+userID);
				break;
			}
			else {
				logAT++;
				if(logAT==3) 
				{
					System.out.println("You have entered wrong credentials more than 3 times");
					System.out.println("Contact Admin");
					break;
				}
				System.out.println("You have entered the wrong credentials");
				System.out.println("Please enter the correct credentials");
				System.out.println("\n");
		}
		
	}

}}
