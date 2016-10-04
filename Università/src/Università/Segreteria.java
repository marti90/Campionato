package Università;

public class Segreteria {
	
	private static int m = 1000;
	
	public Studente registraStudente(String nome, String cognome,Università u){
		
		Studente s = cercaStudente(nome, cognome, u);
		
		if(s==null){
			s= new Studente(nome,cognome);
			if(s.isValid()){
				u.getStudenti().add(s);
				s.setMatricola(m);
				m++;
			}
		}
		
		return s;
	}
	
	public Docente registraDocente(String nome, String cognome, String cf, Università u){
		
		Docente d = cercaDocente(nome, cognome, cf, u);
		
		if(d==null){
			d= new Docente(nome,cognome,cf);
			if(d.isValid()){
				u.getDocenti().add(d);
			}
		}
		return d;
	}
	
	public Corso registraCorso(String nome, int ore, Università u){
		
		Corso c = cercaCorso(nome, ore, u);
		
		if(c==null){
			c= new Corso(nome,ore);
			if(c.isValid()){
				u.getCorsi().add(c);
			}
		}
		return c;
	}
	
	public boolean aggiungiStudenteACorso(Studente s, Corso c, Università u){
		
		if((s.isValid()) && (c.isValid())){
			c.getStudentiDelCorso().add(s);
			return true;
		} else
			return false;
	}
	
	public boolean aggiungiDocenteACorso(Docente d, Corso c, Università u){
		
		if((d.isValid())&& (c.isValid())){
			c.getDocentiDelCorso().add(d);
			return true;
		} else
			return false;
	}

	private Corso cercaCorso(String nome, int ore, Università u) {
		Corso c = null;
		
		for(Corso corso: u.getCorsi()){
			if((corso.getNome().equals(nome)) && (corso.getOre()==ore)){
				c=corso;
			}
		}
		return c;
	}

	private Docente cercaDocente(String nome, String cognome, String cf,
			Università u) {
		Docente d = null;
		
		for(Docente docente: u.getDocenti()){
			if((docente.getNome().equals(nome)) && (docente.getCognome().equals(cognome)) && (docente.getCf().equals(cf))){
				d=docente;
			}
		}
		return d;
	}

	private Studente cercaStudente(String nome, String cognome, Università u) {
		Studente s=null;
		
		for(Studente studente: u.getStudenti()){
			if((studente.getNome().equals(nome)) && (studente.getCognome().equals(cognome))){
				s=studente;
			}
		}
		return s;
	}
	
}
