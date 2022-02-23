import java.util.HashSet;
import java.util.Set;
class Employees
{
//	Use a HashSet to hold Employee Objects. Upon running the application, the details of the
//	employees added to the HashSet should be displayed.
//	Employee <<class>>
//	|-- id
//	|-- name
//	|-- salary
//	|-- department
//	|-- displayDetails()
//	Feel free to add properties and methods to Employee Class
//	Note: if we try to store any object other than Employee Object in HashSet, we should not be
//	allowed to

	
	int empid,empSalary;
	String empName,empDept;
	public Employees(int empid,String empName, int empSalary, String empDept)
	{
		super();
		this.empid=empid;
		this.empName=empName;
		this.empSalary=empSalary;
		this.empDept=empDept;
	}

@Override
	public String toString() {
		return "Employees [empid=" + empid + ", empSalary=" + empSalary + ", empName=" + empName + ", empDept=" + empDept
				+ "]";
	}
}

public class Test_Hash {
	public static void main(String[] args)
	{
		Employees e1=new Employees(101,"Akshay",50000,"Finance");
		Employees e2=new Employees(102,"Amlan",45000,"IT");
		Employees e3=new Employees(103,"Ayush",55000,"Tax");
		Set<Employees> employees= new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		for (Employees employees2 : employees) {
			System.out.println(employees2);	
		}
	}
}