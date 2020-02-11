
/**
 *
 * @author ()
 * @version (0.0.1)
 */
public class Bruchanwendung
{
    // Instanzvariablen

    /**
     * Konstruktor
     */
    public Bruchanwendung()
    {
    }
    public Bruch addieren(int pZB1,int pNB1,int pZB2,int pNB2){
    Bruch B1 = new Bruch(pZB1,pNB1);
    Bruch B2 = new Bruch(pZB2,pNB2);
    Bruch Ergebnis = B1.addieren(B2);
    return Ergebnis;
}
}
