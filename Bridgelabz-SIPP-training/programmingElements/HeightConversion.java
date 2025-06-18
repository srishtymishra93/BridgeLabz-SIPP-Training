import java.util.*;
class HeghtConversion{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	//input centimeters
		double cm=sc.nextDouble();
	//conversion into inches and to foot
		double inches= cm/2.54;
		double foot = inches/12;
	//output
		System.out.println("Your Height in cm is "+cm+" while in feet is "+foot+" and in inches is "+inches);
	}
}