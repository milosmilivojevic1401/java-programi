package vezba5;

public class Main {

	public static void main(String[] args) {
	
  Fudbaler f1 = new Fudbaler();
  
  f1.ime = "Ronaldo";
  f1.klub = "Mancester";
  
  
  f1.ispis();
  
  
Reprezentacija srbija = new Reprezentacija("Srbija", f1);

System.out.println(srbija);

for(int i = 0;i<10;i++) {
	System.out.println(i);
}
  

	}

}
