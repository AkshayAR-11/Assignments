import java.util.*;

//4)	Given a LinkedList of Objects representing date of birth’s (use any inbuild java class to represent date), print the date’s along with the message: Your date of Birth is DD-MM-YYYY, and it (was or was not) a leap year.
//E.g.
//a)     For the date 23-12-2000 
//Your date of birth is 23-12-2000 and it was a leap year
//c)	For the date 23-12-2001
//
//Your date of birth is 23-12-2000 and it was not a leap year
//	
//	Note: You need to access the Dates in the reverse order. I.e. start from the last object and move towards the first object

public class CollectionQ4 {
    int date,month,year;
    
    public CollectionQ4(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return date+"-"+month+"-"+year;
    }

    public int getYear(){
        return year;
    }
    
    public static void main(String[] args) {
        LinkedList<CollectionQ4> dob = new LinkedList<>();
        

        dob.add(new CollectionQ4(07,12,2000));
        dob.add(new CollectionQ4(10,03,1999));
        dob.add(new CollectionQ4(22,04,1998));
        dob.add(new CollectionQ4(06,07,2008));
        dob.add(new CollectionQ4(12,10,2011));
        dob.add(new CollectionQ4(19,05,2012));
        dob.add(new CollectionQ4(21,01,1992));

        for (int i = 0 ; i<dob.size();i++){
            int year = dob.get(i).getYear();
            if (year%400==0 || year%100==0 || year%4==0){
                System.out.println(dob.get(i)+" : Born in Leap Year.");
            }else{
                System.out.println(dob.get(i)+" : Not Born in a Leap Year.");
            }
            
        }
    }
    
}