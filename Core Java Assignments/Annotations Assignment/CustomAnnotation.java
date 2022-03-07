package Annotations_Assignment;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
	int ID();
	String Name();
	String Date();
	String Time();
	float Version();
}

@info(ID=0, Name = "Akshay", Date = "07/03//2022", Time = "09:46", Version = 5.8f)
class use_custom{
	int ID;
	String Name;
	String Date;
	String Time;
	float Version;
	public use_custom(int i, String name, String date, String time, float d) {
		super();
		ID = i;
		Name = name;
		Date = date;
		Time = time;
		Version = d;
	}
	public String toString() {
		return "AuthorID: "+ID+" || Author: "+Name+" || Date: "+Date+" || Time: "+Time+" || Version: "+Version;
	}
}
public class CustomAnnotation {

	public static void main(String[] args) {
		use_custom dep = new use_custom(101,"Akshay", "07/03//2022", "09:46", 5.8f);
		System.out.println(dep.toString());

	}

}