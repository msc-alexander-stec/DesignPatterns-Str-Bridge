package pkg.abstraction.refined;

import pkg.abstraction.RemoteButton;
import pkg.implementor.DeviceImplementor;

// Refined Abstraction
public class TvRemotePause extends RemoteButton {

	public TvRemotePause(DeviceImplementor newDevice) {
		super(newDevice);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV button 9 was pressed: paused");
	}

}
