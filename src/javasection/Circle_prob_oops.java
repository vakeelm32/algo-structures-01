package javasection;
class TestCircle
{
	public double radius;
	public double area()
	{
		return Math.PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double circumferance()
	{
		return  perimeter();
	
		
	}
	}


public class Circle_prob_oops {
	public static void main(String[] args)
	{
		TestCircle c1=new TestCircle();
		c1.radius=7;
		System.out.println("Area :" +c1.area());
		System.out.println("perimeter :" +c1.perimeter());
		System.out.println("circumferance :" +c1.circumferance());
		}
	}


