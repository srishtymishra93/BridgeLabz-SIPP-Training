import java.util.*;
class VolumeOfEarth{
	public static void main(String[] args){
	
	//claculating the volume of earth in km and miles
		double in_km=(4/3)*(3.14)*Math.pow(6378,3);	
		double in_miles = in_km*0.621371;
	
		System.out.println("The volume of earth in cubic kilometers is "+in_km+" and cubic miles is "+in_miles);
	}
}