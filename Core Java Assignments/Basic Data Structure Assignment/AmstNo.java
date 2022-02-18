import java.util.Scanner;
public class AmstNo {

	public static void main(String[] args) 
	{
		for(int i=100;i<1000;i++)
		{
			int n=i;
			int d=0,s=0;
			while(n>0)
			{
				d=(n%10);
				s+=Math.pow(d, 3);
						n/=10;
			}
			if(i==s)
			{
				System.out.println(i+ " is Armstrong number");
			}
		}
		
	}

}
