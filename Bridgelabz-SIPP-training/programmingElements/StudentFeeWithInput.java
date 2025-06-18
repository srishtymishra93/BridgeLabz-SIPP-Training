import java.util.*;
class StudentFeeWithInput{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double fee = sc.nextDouble();
		double discountPercent = sc.nextDouble();
	// calculating discounted fee of student with user given inputs
		double discount = (fee*discountPercent)/100;
		double discountedFee = fee-discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+ discountedFee );
	}
}