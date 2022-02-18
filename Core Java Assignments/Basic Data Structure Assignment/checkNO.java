import java.util.Scanner;
public class checkNO 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ar[]= {5,12,14,6,78,19,1,23,26,35,37,52,86,47},noCh=0;
		System.out.println("Please enter the number to be searched");
		noCh=sc.nextInt();
		for(int i=0;i<(ar.length);i++)
		{
			if(noCh==ar[i])
				System.out.println("Value is in the Array");
			else {
				System.out.println("Value is not in the Array");
				break;
			}
		}
	}

}