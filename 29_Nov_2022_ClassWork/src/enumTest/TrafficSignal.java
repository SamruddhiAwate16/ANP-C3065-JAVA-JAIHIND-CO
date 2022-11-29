package enumTest;

public enum TrafficSignal {
GREEN(30),RED(60),ORANGE(5);

	int time;
	TrafficSignal(int time){
		this.time=time;
	}
	int time() {
		return time;
	}
}
