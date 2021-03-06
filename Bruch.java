/**
 * Write a description of class Bruch here.
 * @author ()
 * @version ()
 */
public class Bruch {
// instance variables
	private int zNenner;
	private int zZaehler;

// Constructor
	public Bruch(int pZaehler, int pNenner) {
		zZaehler = pZaehler;
		zNenner = pNenner;
	}
	public void setNenner(int pNenner) {
		zNenner = pNenner;
	}
	public void setZaehler(int pZaehler) {
		zZaehler = pZaehler;
	}
	public int getNenner() {
		return zNenner;
	}
	public int getZaehler() {
		return zZaehler;
	}
	public Bruch addieren(Bruch pB2) {
		int zaehler = (zZaehler * pB2.getNenner()) + (pB2.getZaehler() * zNenner);
		int gemNenner = zNenner * pB2.getNenner();
		return new Bruch(zaehler, gemNenner);
	}
	public Bruch subtrahieren(Bruch pB2) {
		int zaehler = +(zZaehler * pB2.getNenner()) - (pB2.getZaehler() * zNenner);
		int gemNenner = zNenner * pB2.getNenner();
		return new Bruch(zaehler, gemNenner);
	}
	public Bruch multiplizieren(Bruch pB2) {
		int zaehler = zZaehler * pB2.getZaehler();
		int nenner = zNenner * pB2.getNenner();
		return new Bruch(zaehler, nenner);
	}
	public Bruch dividieren(Bruch pB2) {
		return multiplizieren(pB2.kehrwert());
	}
	public Bruch kehrwert() {
		return new Bruch(zNenner, zZaehler);
	}
}
