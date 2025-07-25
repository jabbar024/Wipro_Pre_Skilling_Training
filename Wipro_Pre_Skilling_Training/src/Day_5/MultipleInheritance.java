package Day_5;


interface A 
{
	 void printMessage() ;
	 
	 default void aboutIntefaceA()
	 {
		 System.out.println("This is interface A From Default Method");
	 } 
	 static void aboutIntefaceStatic()
	 {
		 System.out.println("This is interface A From Static Method");
	 }
}
interface B
{
	 void printMessage() ;
	 
	 default void aboutIntefaceB()
	 {
		 System.out.println("This is interface B From Default Method");
	 }
	 
	 static void aboutIntefaceStatic()
	 {
		 System.out.println("This is interface B From Static Method");
	 }
	 
}
interface C
{
	 void printMessage() ;
	 
	 default void aboutIntefaceC()
	 {
		 System.out.println("This is interface C From Default Method");
	 }
	 
	 static void aboutIntefaceStatic()
	 {
		 System.out.println("This is interface C From Static Method");
	 }
	 
}


class MultipleInheritanceImplementation implements A,B,C
{
	
	
	public void printMessage()
	{
		System.out.println("This class Inplement Interfce");
	}

}

public class MultipleInheritance
{
	public static void main(String[] args) 
	{
		A a = new MultipleInheritanceImplementation() ;
		a.printMessage();
		a.aboutIntefaceA();
		A.aboutIntefaceStatic();
		
		System.out.println("--------------------------------");
		B b = new MultipleInheritanceImplementation() ;
		b.printMessage();
		b.aboutIntefaceB();
		B.aboutIntefaceStatic();
		
		System.out.println("--------------------------------");
		C c = new MultipleInheritanceImplementation() ;
		c.printMessage();
		c.aboutIntefaceC();
		C.aboutIntefaceStatic();
		
	}

}
