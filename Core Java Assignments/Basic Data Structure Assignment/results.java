import java.util.Scanner;
public class results {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sb1=0,sb2=0,sb3=0;
		System.out.println("Please enter the marks for 3 subjects");
		sb1=sc.nextInt();
		sb2=sc.nextInt();
		sb3=sc.nextInt();
		
		//conditional cases to determine the pass/fail
		if(sb1>60 && sb2>60 && sb3>60)
			System.out.println("Passed");
		else if(sb1>60 && sb2>60 || sb2>60 && sb3>60 || sb3>60 && sb1>60)
			System.out.println("Promoted");
		else
			System.out.println("Failed");
	}
}