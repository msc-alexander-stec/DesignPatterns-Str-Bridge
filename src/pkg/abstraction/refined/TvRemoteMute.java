package pkg.abstraction.refined;

import pkg.abstraction.RemoteButton;
import pkg.implementor.DeviceImplementor;

// Refined Abstraction
public class TvRemoteMute extends RemoteButton {

	public TvRemoteMute(DeviceImplementor newDevice) {
		super(newDevice);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV button 9 was pressed: muted");
	}

}
