package pkg.implementor;

// Implementor
public abstract class DeviceImplementor {

	public int deviceState;	// Current channel (TV) or current chapter (DVD)
	public int maxSetting; // Max. channel number possible /TV) or max. chapter (DVD)
	public int volumeLevel = 0;
	
	public abstract void buttonFivePressed();
	public abstract void buttonSixPressed();
	
	public void deviceFeedback() {
		
		if (deviceState > maxSetting || deviceState < 0) {
			deviceState = 0;
		}
		
		System.out.println("On " + deviceState);
	}
	
	public void buttonSevenPressed() {
		volumeLevel++;
		System.out.println("Volume at " + volumeLevel);
	}
	
	public void buttonEightPressed() {
		volumeLevel--;
		System.out.println("Volume at " + volumeLevel);
	}
	
}
