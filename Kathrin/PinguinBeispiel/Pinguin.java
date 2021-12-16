package Kathrin.PinguinBeispiel;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

@SuppressWarnings("unused")
public class Pinguin implements Subjekt{

	private List<Beobachter> beobachterListe = new ArrayList<Beobachter>();
	private String aktion;
	
	@Override
	public void registriereBeobachter(Beobachter beobachterName) {
		this.beobachterListe.add(beobachterName);
	}

	@Override
	public void entferneBeobachter(Beobachter beobachterName) {
		this.beobachterListe.remove(beobachterName);
		
	}

	@Override
	public void benachrichtigeBeobachter() {
		for(int i=0; i<beobachterListe.size(); i++) {
			beobachterListe.get(i).aktualisiere();
		}
	}
		
	public String getAktion() {
		return aktion;
	}
	
	public void setAktion(String aktion) {
		this.aktion=aktion;
		benachrichtigeBeobachter();
	}

}
