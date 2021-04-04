//Implement a Java program to compute body mass index (BMI).
class BodyMassIndex{
	public static void main(String args[]){
		double weight = 73; //weight in kgs
		double height = 2.25; //height in meters
		double BodyMassIndex = weight/(height * height);
		System.out.println("BodyMassIndex : "+BodyMassIndex);
	}
}
