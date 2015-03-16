package pkg.implementor.concrete;

import pkg.implementor.DeviceImplementor;

// Concrete Implementor
public class DeviceTvLg extends DeviceImplementor {

	//
	// Constructor
	//

	public DeviceTvLg(int newDeviceState, int newMaxSetting) {
		deviceState = newDeviceState;
		maxSetting = newMaxSetting;
	}

	//
	//
	//

	@Override
	public void buttonFivePressed() {
		System.out.println("TV LG Channel down");
		deviceState--;
	}

	@Override
	public void buttonSixPressed() {
		System.out.println("TV LG Channel up");
		deviceState++;
	}

}