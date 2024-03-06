public class TestVar{

	public static void main (String[] args){

		int i;  //declare int
		double dVal;
		int k = 5; // decleration and initial asignment

		i = 1;

		System.out.println("result is " + i/k); //integer dividie

		System.out.println("result is " + ((double)i/k)); // floating pt. divide

		i = 3;
		System.out.println(i++); //postincrement
		System.out.println(i); //veirfy that it was done
	} //end main
} //end class