package Università;

import Biblio.Utente;

public class Docente extends Utente{
	
	private String cf="";

	public Docente(String nome, String cognome, String cf) {
		super(nome, cognome);
		this.cf = cf;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}
	
	
	
	

}
