import java.util.*;
class KilometersToMilesWithInput{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
	//conversion of kilometer to miles by taking user input
		double kilometers = sc.nextDouble();
		double miles = kilometers*0.621371;
		System.out.println("The total milles is " + miles +" mile for the given "+kilometers+"km" );
	}
}