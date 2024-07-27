package vezba5;

public class Fudbaler {

	
	public String ime;
	public String klub;
	public int godine;
	private boolean ozenjen;
	@Override
	public String toString() {
		return "Fudbaler [ime=" + ime + ", klub=" + klub + "]";
	}
	
	void ispis() {
		
		System.out.println("ime fudbalera je " + ime + "trenutno igra " + klub);
	}
	
}
