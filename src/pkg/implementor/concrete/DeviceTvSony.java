package pkg.implementor.concrete;

import pkg.implementor.DeviceImplementor;

public class DeviceTvSony extends DeviceImplementor {

	//
	// Constructor
	//

	public DeviceTvSony(int newDeviceState, int newMaxSetting) {
		deviceState = newDeviceState;
		maxSetting = newMaxSetting;
	}

	//
	//
	//

	@Override
	public void buttonFivePressed() {
		System.out.println("TV Sony Channel down");
		deviceState--;
	}

	@Override
	public void buttonSixPressed() {
		System.out.println("TV Sony Channel up");
		deviceState++;
	}

}
