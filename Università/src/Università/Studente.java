package Università;

import Biblio.Utente;

public class Studente extends Utente{
	
	private int matricola=0;
	private double media;
	
	public Studente(String nome,String cognome) {
		super(nome,cognome);
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	public String toString(){
		return nome+" "+cognome+" "+matricola;
	}

}
