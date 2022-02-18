import java.util.Scanner;
public class simple 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pricipal: ");
		double p=sc.nextDouble();
		System.out.println("Enter the rate: ");
		double r=sc.nextDouble();
		System.out.println("Enter the time: ");
		int n=sc.nextInt();
		double si=(p*n*r)/100;
		double f=Math.pow((1+r), n);
		double cp=p*(f)-p;
		System.out.println("Principal: "+p);
		System.out.println("Interest Rate: "+r);
		System.out.println("Term of Loan: "+n);
		System.out.println("Simple Interest :"+si);
		System.out.println("Compound Interest: " +cp);
	}

}