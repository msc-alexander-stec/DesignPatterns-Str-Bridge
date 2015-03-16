package testclient;

import pkg.abstraction.RemoteButton;
import pkg.abstraction.refined.DvdRemote;
import pkg.abstraction.refined.TvRemoteMute;
import pkg.abstraction.refined.TvRemotePause;
import pkg.implementor.concrete.DeviceDvdPhilips;
import pkg.implementor.concrete.DeviceTvLg;

public class TestClient {

	public static void main(String[] args) {

		System.out.println("Start: Bridge");

		RemoteButton remoteControlTv1 = new TvRemoteMute(new DeviceTvLg(1, 200));
		RemoteButton remoteControlTv2 = new TvRemotePause(new DeviceTvLg(1, 200));
		RemoteButton remoteControlDvd = new DvdRemote(new DeviceDvdPhilips(1, 14));

		System.out.println("\nTest TV with mute function");
		remoteControlTv1.buttonFivePressed();
		remoteControlTv1.buttonSixPressed();
		remoteControlTv1.buttonNinePressed();

		System.out.println("\nTest TV with pause function");
		remoteControlTv2.buttonFivePressed();
		remoteControlTv2.buttonSixPressed();
		remoteControlTv2.buttonSixPressed();
		remoteControlTv2.buttonSixPressed();
		remoteControlTv2.buttonNinePressed();
		remoteControlTv2.deviceFeedback();

		System.out.println("\nTest DVD Player with recording function");
		remoteControlDvd.buttonFivePressed();
		remoteControlDvd.buttonSixPressed();
		remoteControlDvd.buttonNinePressed();

	}

}