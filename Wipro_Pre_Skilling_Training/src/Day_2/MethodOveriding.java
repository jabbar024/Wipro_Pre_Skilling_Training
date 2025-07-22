package Day_2;

class Circle
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}

class Square extends Circle
{
	void draw()
	{
		System.out.println("Drawing Square");
	}
}

public class MethodOveriding 
{
	
	public static void main(String[] args) 
	{
		Circle c = new Square() ;
		
		c.draw();
	}
}
