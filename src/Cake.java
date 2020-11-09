
public class Cake {

	private int bites = 10;

	public Cake() {
		// nothing to implement
	}

	public void takeABite() {
		--bites;
		System.out.println("Yum");
	}

	public boolean isEmpty() {
		return bites == 0;
		// looks like an empty cake
	}
}
