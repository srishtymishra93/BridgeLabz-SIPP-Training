import java.util.*;
class AreaOfTriangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

	// input in double datatype 

		double base=sc.nextDouble();
		double height=sc.nextDouble();
	//Calculating Area in cm and inches
		double area_in_cm =( base*height)/2;
		double area_in_inches=area_in_cm/(2.54*2.54);
	//Output display
		System.out.println("The area of triangle in square centimeters is "+area_in_cm+" and in square inches is "+area_in_inches);
	}
}