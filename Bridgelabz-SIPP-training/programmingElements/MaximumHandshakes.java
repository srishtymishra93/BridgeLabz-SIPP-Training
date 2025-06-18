import java.util.*;
class MaximumHandshakes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	//to find number of maximum possible handshakes.
		int combination=(n*(n-1))/2;
		System.out.println("The number of maximum possible handshakes are "+combination);
	}
}