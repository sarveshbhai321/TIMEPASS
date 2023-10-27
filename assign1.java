import java.util.*;
class Person
{
String name;
String phno;
String degree;
int percentage;
String sprtname;
public void persondata()
{
	System.out.println("enter the name");
	Scanner obj=new Scanner(System.in);
	name=obj.next();
	System.out.println("enter the phone number ");
	phno=obj.next();
}
}
	class Academic_performance extends Person
	{
	
		public void academicdata()
		{
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter the degree");
		degree=obj1.next();
		System.out.println("enter the percentege");
		
		percentage=obj1.nextInt();
		System.out.println("enter the name of sports");
		Scanner obj2=new Scanner(System.in);
	
	sprtname=obj2.next();
		System.out.println(name);
System.out.println(phno);
System.out.println(degree);
System.out.println(percentage);
		}
	}
	class Sports_performance extends Academic_performance
	{
	
	public Sports_performance()
	{
	
	
System.out.println(sprtname);
}
}
class assign1
{
public static void main(String[]args)
{
 Academic_performance obj3=new Academic_performance();
     obj3.persondata();
	obj3.academicdata();
	Sports_performance obj4=new Sports_performance();
	}
	}
	
	
