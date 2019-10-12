package Clock;

public class Clock {
	
	private int Seconds;
	private int Minutes;
	private int Hours;
	
	public void tick() {
		Seconds=Seconds+1;
		Minutes=Minutes+Seconds/60;
		Hours=Hours+Minutes/60;
		Seconds=Seconds%60;
		Minutes=Minutes%60;
		Hours=Hours%24;
	}
	
	public void Show() {
		System.out.println("The Clock is : "+Hours+":"+Minutes+":"+Seconds);
		System.out.println();
	}
	
}
