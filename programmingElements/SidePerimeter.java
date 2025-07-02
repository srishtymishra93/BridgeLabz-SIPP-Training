import java.util.*;
class SideOfSquare{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	//finding sides of the square from perimeter
		double perimeter=sc.nextDouble();
		double side = perimeter/4;
		System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
	}
}