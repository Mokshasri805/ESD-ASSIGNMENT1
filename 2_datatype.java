class Testdatatype {
	
	int m;
	double o;
	float n;
	boolean istrue;
	String i;

	public void printValue() {
		System.out.println("int default value = "+ m);
		System.out.println("double default value = "+ o);
		System.out.println("float default value = "+ n);
		System.out.println("boolean default value = "+ istrue);
		System.out.println("String default value = "+ i);
	}
}

class datatype {
	public static void main(String argv[]) {
		Testdatatype test = new Testdatatype();
		test.printValue();
	}
}