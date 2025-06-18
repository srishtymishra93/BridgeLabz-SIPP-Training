import java.util.*;
class DoubleOpt{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	// input three numbers
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		double num3=sc.nextDouble();
	// applying operators as per question 
		double a=num1+num2*num3;
		double b=num1*num2+num3;
		double c=num3+num1/num2;
		double d=num1%num2+num3;
	// displaying output
		System.out.println("The result of DoubleOpt are "+a+" , "+b+" , "+c+" and "+d);
	}
}