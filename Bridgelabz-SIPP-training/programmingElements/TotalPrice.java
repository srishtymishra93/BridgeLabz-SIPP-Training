import java.util.*;
class TotalPrice{
	public static void main(String[] args){
	//calculating total price from user given quantity and unit price
		Scanner sc=new Scanner(System.in);
		double unitPrice=sc.nextDouble();
		double quantity = sc.nextDouble();
		double total = unitPrice*quantity;
		System.out.println("The total purchase price is INR "+total+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}
}