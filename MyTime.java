import java.util.Random;

public class MyTime {


	private int hour;
	private int min;
	private double sec;


	public myTime(){
		this.hour = 0;
		this.min = 0;
		this.sec = 0.0;
		//this(0,0,0.);
	}


	public myTime(int hour, int min, double sec){
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public String toString(){
		return String.format("%02d:%02d:%04.1f ",hour,min,sec);

	}

	public boolean equals(MyTime otherTime){
		return (hour == otherTime.hour && min == otherTime.min && sec == otherTime.sec);
	}

	public boolean equals(Object otherTime){

		if (otherTime instancof MyTime){
			MyTime o = (MyTime) otherTime;
			if (hour ==o.hour && min == o.min && sec = o.sec)
				return True;
			else {return false};
		}
		else reutrn false;
	}

	public MyTime add(MyTime t2){
		MyTime t3 = new MyTime();
		t3.hour = hour + t2.hour;
		t3.min = min + t2.min;
		t3.sec = sec + t2.sec;

		if (t3.sec >= 60.0){
			t3.sec -=60.0;
			t3.min += 1;
		}

		if (t3.min >= 60){
			t3.min -= 60;
			t3.hour += 1;		
		}

		return t3;
	}

	public static void main (String[] args){
	 // first test
	 MyTime classTime = new MyTime(9,30,0.0);
	 System.out.println("class starts at " + classTime);
	 MyTime duration = new MyTime(1,15,0);
	 MyTime endTime = classTime.add(duration);
	 System.out.println("class ends at " + endTime);
	 // second test
	 MyTime[] classTimes = new MyTime [15];
	 Random ranGen = new Random();
	 for (int i=0; i<classTimes.length; i++){
	 classTimes[i] = new MyTime(ranGen.nextInt(24), ranGen.nextInt(61),
	 60*ranGen.nextDouble());
	 	}
	}





}