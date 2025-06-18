class StudentFee{
	public static void main(String[] args){
	// claculating the discounted fee of students
		double fee = 125000;
		double discountPercent = 10;
		double discount = (fee*10)/100;
		double discountedFee = fee-discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+ discountedFee );
	}
}