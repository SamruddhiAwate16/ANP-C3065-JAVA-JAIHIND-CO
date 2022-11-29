package enumTest;

public class TrafficSignalTest {
	
	TrafficSignal timer;
	 TrafficSignalTest(TrafficSignal timer){
		this.timer=timer;
	}
	 
	 void selectColour(TrafficSignal colour) {
			
		TrafficSignal light=colour;
		
			switch(light) {
			case GREEN:
				System.out.println(timer.time());
				break;
			case RED:
				System.out.println(timer.time());
				break;
			case ORANGE:
				System.out.println(timer.time());
				break;	
		}
			
	} 
	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Please Enter Traffic Light:");
		String colour = sc.next();
		
		TrafficSignalTest timer= new TrafficSignalTest(TrafficSignal.valueOf(colour));
		
		System.out.println("Timer is:");
		timer.selectColour(TrafficSignal.valueOf(colour));
	}

}
