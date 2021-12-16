package Kathrin.PinguinBeispiel;

public class Forscher implements Beobachter{
	private String forscherName;
	private Pinguin pinguin;
	public Forscher(Pinguin pinguin, String forscherName) {
		this.pinguin = pinguin;
		this.forscherName = forscherName;
		pinguin.registriereBeobachter(this);
	}
	@Override
	public void aktualisiere() {
		System.out.println("Forscher " + forscherName + "sieht, Pinguin macht: " + pinguin.getAktion());
	}
	
}
