import java.util.*;
class A{
public int a,b,sum;
public void inp()
{
	Scanner obj=new Scanner(System.in);
	System.out.print("enter first element");
	a=obj.nextInt();
	System.out.println("enter the second element");
	b=obj.nextInt();
	}
	}
		class B extends  A
		{
		public void addi(){
		sum=a+b;
		}
		}
	class C extends  B
	{
	public void display()
	{
	System.out.println(sum);
	}
	}
class summation
{
public static void main(String[]args)
{
C obj1=new C();
obj1.inp();
obj1.addi();
obj1.display();
}
}
			
