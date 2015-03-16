package pkg.abstraction.refined;

import pkg.abstraction.RemoteButton;
import pkg.implementor.DeviceImplementor;

// Refined Abstraction
public class DvdRemote extends RemoteButton {

	public DvdRemote(DeviceImplementor newDevice) {
		super(newDevice);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("DVD button 9 was pressed: recording");
	}

}
