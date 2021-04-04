//Implement a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour
class displayspeed{
	public static void main(String args[]){
		double distance = 350; // in meters
		int sec = 45;
		int min = 25;
		int hour = 2;
		
		double totalSec= (double)(sec + (min * 60) + ( hour * 60 * 60));
		double meterspersec = distance/ totalSec;
		double kmetersperhr = 3.6 * meterspersec;
		double milesperhr = 2.23694 * meterspersec;
		
		System.out.println("Meters/sec : "+meterspersec+"  Kilometers/hr : "+kmetersperhr+"   Miles/hr: "+milesperhr); 
		
	}
}