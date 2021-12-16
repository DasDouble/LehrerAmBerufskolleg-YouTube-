package Kathrin.PinguinBeispiel;

public interface Subjekt {
	public void registriereBeobachter(Beobachter beobachterName);
	public void entferneBeobachter(Beobachter beobachterName);
	public void benachrichtigeBeobachter();
}
