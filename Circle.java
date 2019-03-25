
import java.util.Scanner;


public class Circle {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		
		double PI = 3.14;
		double radius = 0;
		double diameter;
		double area;
		double circumference;
		 System.out.print("Enter radius value:");

		 //This should have been done in seperate methods, not in the main method

        radius=input.nextInt();

		diameter=(radius*2);
		area= (radius*radius*PI);
		circumference=(radius*2*PI);

		    System.out.println("area is" + area);
	        System.out.println("diameter is "+ diameter);
	        System.out.println("circumference is "+ circumference);
	        
	    } 

	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
}
