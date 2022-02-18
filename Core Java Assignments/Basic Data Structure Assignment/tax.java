import java.util.Scanner;
public class tax {

	public static void main(String[] args) 
	{
		double t=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Income :");
		double i=sc.nextDouble();
		t=incomeTax(i);
		System.out.println("Income Tax amount is "+t);
	}
static double incomeTax(double i)
{
	double tax;
	if(i<=180000)
		tax=0;
	else if(i<=300000 && i>180000)
		tax=0.1*(i-180000);
	else if(i<=500000 && i>300000)
		tax=(0.2*(i-300000))+1000;
	else if(i>500000 && i<=1000000)
		tax=(0.3*(i-500000))+50000;
	else 
		tax=(0.4*(i-1000000))+200000;
	return tax;
}

}