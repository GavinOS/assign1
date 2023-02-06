//import java.util.Scanner;

public class Assignment1 
{
  
	public static void main(String[] args) 
	{
	
	//Scanner input = new Scanner(System.in);
	Triangle triangle = new Triangle(1, 1.5, 1);
	
	triangle.setColor("yellow");
    triangle.setFilled(true);

    System.out.println(triangle);
    System.out.println("The area is " + triangle.getArea());
    System.out.println("The perimeter is "
      + triangle.getPerimeter());
    
   
    
   // input.close();	

  }
	

	
}




