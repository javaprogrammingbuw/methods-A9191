import java.util.Scanner;

public class Circle {
	
	static double PI = 3.14;
	static double radius = 0;
	static double diameter;
	static double area;
	static double circumference;
		
	
	public static void main(String[]args){		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius value:");
        radius=input.nextInt();
        diameter(radius);
        area(radius);
        circumference(radius);      
	}

	public static void diameter(double radius){
		diameter=(radius*2);		
        	System.out.println("diameter is "+ diameter);
        } 
        
        public static void area(double radius){
 	        area= (radius*radius*PI);	
	        System.out.println("area is" + area);
        }
        
        public static void circumference(double radius){        
		circumference=(radius*2*PI);
        	System.out.println("circumference is "+ circumference);
        }
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
}
