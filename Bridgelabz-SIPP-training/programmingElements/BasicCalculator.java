import java.util.*;
class BasicCalculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	// input of two numbers
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
	// applying arithmatic operation on these number
		double addition = num1+num2;
		double subtraction = num1-num2;
		double multiplication = num1*num2;
		double division = num1/num2;
	// output display
		System.out.println("The addition,subtraction,multiplication and division value of 2 numbers "+ num1+ " and" + num2+ " is " +addition+ "," +subtraction+ "," + multiplication+ ", and" +division);
	}
}