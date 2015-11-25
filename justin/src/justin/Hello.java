package justin;

public class Hello {
	
	private int legs;
	private boolean hasTail;
	private String color;
	private boolean awake;
	
	public Hello (int legs, boolean hasTail, String color, boolean awake) {
		this.legs = legs;
		this.hasTail = hasTail;
		this.color = color;
		this.awake = awake; 
	}
	
	public static void main(String[] args) {
		Hello benno = new Hello(17, false, "purple", true);
		
	}

}
