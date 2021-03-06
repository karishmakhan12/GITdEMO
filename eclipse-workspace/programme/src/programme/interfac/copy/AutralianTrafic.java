package programme.interfac.copy;

public class AutralianTrafic implements CentralTraffic, ContinentalRule {

	public static void main(String[] args) {
		CentralTraffic a = new AutralianTrafic();
		a.greenGo();
		a.redStop();
		a.flashYellow();
		AutralianTrafic at = new AutralianTrafic();
		at.walkonroad();
		ContinentalRule ak = new AutralianTrafic();
		ak.TrainRule();

	}

	@Override
	public void greenGo() {

		System.out.println("greengo implementation");
	}

	@Override
	public void redStop() {
		System.out.println("redstop implementation");

	}

	@Override
	public void flashYellow() {
		System.out.println("flashyellow implementation");

	}

	public void walkonroad() {
		System.out.println("walkonroad implementation");
	}

	@Override
	public void TrainRule() {
		System.out.println("TrainRule implementation");

	}

}
