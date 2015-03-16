package pkg.implementor.concrete;

import pkg.implementor.DeviceImplementor;

public class DeviceDvdPhilips extends DeviceImplementor {

	//
	// Constructor
	//

	public DeviceDvdPhilips(int newDeviceState, int newMaxSetting) {
		deviceState = newDeviceState;
		maxSetting = newMaxSetting;
	}

	//
	//
	//

	@Override
	public void buttonFivePressed() {
		System.out.println("DVD Philips Channel down");
		deviceState--;
	}

	@Override
	public void buttonSixPressed() {
		System.out.println("DVD Philips Channel up");
		deviceState++;
	}

}
