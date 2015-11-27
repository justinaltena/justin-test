package justin;

public class Hello {
	
	private int legs;
	private boolean hasTail;

	
	public Hello (int legs, boolean hasTail, String color, boolean awake) {
		this.legs = legs;

	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setLegs(int newLegs) {
		this.legs = newLegs;
	}

}
