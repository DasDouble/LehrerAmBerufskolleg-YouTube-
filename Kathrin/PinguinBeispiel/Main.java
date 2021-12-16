package Kathrin.PinguinBeispiel;

public class Main {
	public static void main(String[] args) {
		Pinguin pinguin = new Pinguin();
		
		Forscher Hans = new Forscher(pinguin, "Frank");
		Forscher Frank = new Forscher(pinguin, "Hans");
		
		pinguin.setAktion("essen");
		pinguin.setAktion("coden");
		pinguin.setAktion("koten");
	}
}
