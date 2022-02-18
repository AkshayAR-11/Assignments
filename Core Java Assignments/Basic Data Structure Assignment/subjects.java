import java.util.Scanner;

public class subjects {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the marks of student 1");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Please enter the marks of student 2");
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		int c2=sc.nextInt();
		System.out.println("Please enter the marks of student 3");
		int a3=sc.nextInt();
		int b3=sc.nextInt();
		int c3=sc.nextInt();
		int total=(a1+a2+a3+b1+b2+b3+c1+c2+c3);
		int Tavg=(total/3);
		int TotA=(a1+a2+a3);
		int TotB=(b1+b2+b3);
		int TotC=(c1+c2+c3);
		int Aavg=(TotA/3);
		int Bavg=(TotB/3);
		int Cavg=(TotC/3);
		System.out.println("Total marks of all Students is all subjects - "+total);
		System.out.println("Average marks of all the students in all subjects - "+Tavg);
		System.out.println("Total marks scored by students in subject A - "+TotA);
		System.out.println("Average marks scored by students in subject A - "+Aavg);
		System.out.println("Total marks scored by students in subject B - "+TotB);
		System.out.println("Average marks scored by students in subject B - "+Bavg);
		System.out.println("Total marks scored by students in subject C - "+TotC);
		System.out.println("Average marks scored by students in subject C - "+Cavg);
	}

}
