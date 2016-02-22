
public class RemoteControlTest {
	public static void main(String[] args){
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		
		remoteControl.setCommand(lightOn);
		remoteControl.buttonPressed();
		remoteControl.setCommand(garageDoorOpen);
		remoteControl.buttonPressed();
	}
}
