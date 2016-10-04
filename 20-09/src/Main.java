import Rubrica.Rubrica;
import Rubrica.Voce;


public class Main {

	public static void main(String[] args) {
		
		Voce v1= new Voce("Martina","Debernardi","3402565863");
		Voce v2= new Voce("Luca","Umoretto","345694123");
		Voce v3= new Voce("Irene","Aimone","3332569745");
		
		Rubrica r1= new Rubrica("Vilma");
		
		r1.setVoce(v1);
		r1.setVoce(v2);
		r1.setVoce(v3);
		
		for(Voce v: r1.getVoci()){
			System.out.println(v.contatto());
		}
		
		System.out.println(r1.trovaNum("Irene", "Aimone"));
		

	}

}
