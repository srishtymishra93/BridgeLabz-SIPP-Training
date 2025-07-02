import java.util.*;
class QuotientRemainder{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	// finding the quotient and remainder after dividing two numbers
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int quotient=num1/num2;
		int remainder = num1%num2;
		System.out.println("The quotient is "+quotient+" and remainder is "+remainder+" of two numbers "+num1+" and "+num2);
	}
}