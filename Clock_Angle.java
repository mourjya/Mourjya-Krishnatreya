import java.util.Scanner;

public class Clock_Angle {
	public static double angle(int hour, int minute)
	{
		double hr_ang; double min_ang; double ang;
		
		if (hour<0 || minute <0 || hour>24 || minute > 60) {
			return -1;
		}
		
		if(hour >= 12)
			hour = hour-12;
		
		if (minute == 60)
			minute = 0;
		 
			 
	hr_ang = ((hour*60)+minute)*0.5;   //MOVEMENT OF HOUR HAND
	 min_ang = minute*6;					// MOVEMENT OF MINUTE HAND

				
	  
	  ang = Math.abs(hr_ang - min_ang );
	double minimum_ang = Math.min(360-ang, ang);
	return minimum_ang;
	
				//or
	 
	/* if(hr_ang>min_ang) {
		 ang = hr_ang-min_ang;
	 }
	 else {
		 ang = min_ang-hr_ang;
	 }
	 if(ang>180)
		 ang = 360-ang;
	 return ang;*/
		 
		}
		
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter hour");
		int h = s.nextInt();
		System.out.println("enter minute");
		int m = s.nextInt();
		
		double a = angle(h, m);
		System.out.println("angle is : "+ a);
	}
}
