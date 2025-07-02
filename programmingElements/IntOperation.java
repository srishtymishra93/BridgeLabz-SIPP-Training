import java.util.*;
class IntOperation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	//input numbers
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
	//arithmatic operation
		int a=num1+num2*num3;
		int b=num1*num2+num3;
		int c=num3+num1/num2;
		int d=num1%num2+num3;
	//output
		System.out.println("The result of IntOperation are "+a+" , "+b+" , "+c+" and "+d);
	}
}