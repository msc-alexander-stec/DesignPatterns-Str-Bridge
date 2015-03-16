package pkg.abstraction;

import pkg.implementor.DeviceImplementor;

// Abstraction
public abstract class RemoteButton {

	private DeviceImplementor theDevice;

	//
	// Constructor
	//

	public RemoteButton(DeviceImplementor newDevice) {
		theDevice = newDevice;
	}

	//
	// Bridges (like a Adapter DesignPattern)
	//

	public void buttonFivePressed() {
		theDevice.buttonFivePressed();
	}

	public void buttonSixPressed() {
		theDevice.buttonSixPressed();
	}

	//
	//
	//

	public void deviceFeedback() {
		theDevice.deviceFeedback();
	}

	public abstract void buttonNinePressed();

}
