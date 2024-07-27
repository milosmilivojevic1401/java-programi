package vezba5;

public class Reprezentacija {
	
	public String ime;
	public Fudbaler fudbaler;
	public int brojtrofeja;
	public boolean kvalifikovan;
	public Reprezentacija(String ime, Fudbaler fudbaler) {
		super();
		this.ime = ime;
		this.fudbaler = fudbaler;
	}
	@Override
	public String toString() {
		return "Reprezentacija [ime=" + ime + ", fudbaler=" + fudbaler + "]";
	}
	
	
	
	

}
