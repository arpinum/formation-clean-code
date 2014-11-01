public class Button {

	public void poll() {
		if(/* some condition */) {
			lamp.turnOn();
		} else {
			lamp.turnOff();
		}
	}

	private Lamp lamp;
}

public class Lamp {
	public void turnOn() {

	}

	public void turnOff() {
		
	}
}