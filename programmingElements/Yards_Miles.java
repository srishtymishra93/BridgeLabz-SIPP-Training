import java.util.*;
class Yards_Miles{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double feet=sc.nextDouble();
	//conversion of feet to yards and to miles
		double yard=feet/3;
		double mile = yard/1760;
		System.out.println("The distance in feet is "+feet+" in yards "+yard+" in miles "+mile);
	}
}