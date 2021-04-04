//Implement a java program to find the memory size in bytes given the input as address length. 
class MemorySize{
	public static void main(String args[]){
		int StartAddr = 25768;
		int EndAddr = 28868;
		int bytes = (EndAddr - StartAddr)/8;
		System.out.println("Memory size in bytes : "+bytes);
	}
}