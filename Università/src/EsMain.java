import Biblio.*;
import Università.*;


public class EsMain {

	public static void main(String[] args) {
		
		Segreteria s= new Segreteria();
		Università u= new Università("Politecnico");
		
		Studente s1= s.registraStudente("Martina", "Debernardi", u);
		Studente s2= s.registraStudente("Luca", "Umoretto", u);
		Studente s3= s.registraStudente("Irene", "Aimone", u);
		
		
		for(Studente stud: u.getStudenti()){
			System.out.println(stud);
		}
		
		Docente d1= s.registraDocente("Rita", "Lauritano","RTLRT90kahsdkuYWE", u);
		Docente d2= s.registraDocente("Giulia", "Sciroccale","BKUWE15SEFKJ", u);
		
		System.out.println();
				
		for(Docente doc: u.getDocenti()){
			System.out.println(doc);
		}
		
		System.out.println();
		
		Corso c1= s.registraCorso("Ingegneria del Software", 120, u);
		Corso c2= s.registraCorso("Logistica", 200, u);
		Corso c3= s.registraCorso("Inglese", 80, u);
		
		for(Corso c: u.getCorsi()){
			System.out.println(c);
		}
		
		System.out.println();
		
		s.aggiungiStudenteACorso(s1, c1, u);
		s.aggiungiStudenteACorso(s2, c1, u);
		s.aggiungiStudenteACorso(s1, c2, u);
		s.aggiungiStudenteACorso(s3, c2, u);
		s.aggiungiStudenteACorso(s1, c3, u);
		
		for(Studente stud: c1.getStudentiDelCorso()){
			System.out.println(stud);
		}
		
		System.out.println();
		
		for(Studente stud: c2.getStudentiDelCorso()){
			System.out.println(stud);
		}
		
		s.aggiungiDocenteACorso(d1, c1, u);
		s.aggiungiDocenteACorso(d2, c1, u);
		
        System.out.println();
		
		for(Docente d: c1.getDocentiDelCorso()){
			System.out.println(d);
		}
		
		System.out.println();
		
		Gestione g= new Gestione();
		Biblioteca b= new Biblioteca("Centrale Politecnico");
		u.setB(b);
		
		g.registraLibro("Cent'anni di solitudine", "Garcia Marquez", 2, b);
		g.registraLibro("Delitto e castigo", "Fedor Dostoevskij", 4, b);
		g.registraLibro("Anna Karenina", "Lev Tolstoj", 1, b);
		g.registraLibro("Il processo", "Franz Kafka", 2, b);
		g.registraLibro("Il vecchio e il mare", "Hernest Hemingway", 3, b);
		System.out.println(g.registraLibro("Delitto e castigo", "Fedor Dostoevskij", 2, b));
		System.out.println(g.registraLibro("Anna Karenina", "Lev Tolstoj", 3, b));
		
		g.registraUtente("Martina", "Debernardi", b);
		g.registraUtente("Luca", "Umoretto", b);
		g.registraUtente("Irene", "Aimone", b);
		
		System.out.println();
		
		for(Libro l:b.getLibri()){
			System.out.println(l.toString());
		}
		
		System.out.println();
		
		for(Utente ut:b.getUtenti()){
			System.out.println(ut.toString());
		}
		
		System.out.println();
		
		g.prestaLibro("Cent'anni di solitudine", "Garcia Marquez", "Martina", "Debernardi", b);
		g.prestaLibro("Delitto e castigo", "Fedor Dostoevskij", "Martina", "Debernardi", b);
		g.prestaLibro("Anna Karenina", "Lev Tolstoj", "Martina", "Debernardi", b);
		g.prestaLibro("Il processo", "Franz Kafka", "Martina", "Debernardi", b);
		g.prestaLibro("Anna Karenina", "Lev Tolstoj", "Luca", "Umoretto", b);
		
		System.out.println();
		
		Utente utente = null;
		for(Utente utemp:b.getUtenti()){
			if((utemp.getNome().equals("Martina"))&&(utemp.getCognome().equals("Debernardi"))){
				utente=utemp;
		    }
		}
		
		for(Libro l: utente.getLibriInPrestito()){
			System.out.println(l.toString());
		}
		
		g.restituzioneLibro("Delitto e castigo", "Fedor Dostoevskij","Martina", "Debernardi","26/09/2016", b);
		g.restituzioneLibro("Cent'anni di solitudine", "Garcia Marquez","Martina", "Debernardi","26/09/2016", b);
		
		System.out.println();
		
		for(Libro l: utente.getLibriInPrestito()){
			System.out.println(l.toString());
		}

	}

}
