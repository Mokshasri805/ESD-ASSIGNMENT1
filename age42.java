//If the total ages of Iqbal and Shikhar is 12 years more than the total age of Shikhar and Charu. Charu is how many years younger than Iqbal? Generalize this program and provide a JAVA program to get input and find the age.
class Age{

	void age(int iqbal, int shikar)
	{
		int charu = iqbal+shikar-shikar-12;
		System.out.println("Charu is 12 years younger than Iqbal");
		System.out.println("Charu age is "+charu);
	}

	public static void main(String[] args) {
		
		Age obj = new Age();
		obj.age(14,11);
	}
}