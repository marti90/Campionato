package Biblio;

import java.util.ArrayList;
import java.util.List;

public class Utente implements ValidaDati{
	
	protected String nome="";
	protected String cognome="";
	
	private List<Libro> libriInPrestito = new ArrayList<Libro>();
	
	public Utente(){
		
	}
	
	public Utente(String nome, String cognome) {
		
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public List<Libro> getLibriInPrestito() {
		return libriInPrestito;
	}

	public void setLibriInPrestito(List<Libro> libriInPrestito) {
		this.libriInPrestito = libriInPrestito;
	}
	
	public String toString(){
		return nome+" "+cognome;
	}

	@Override
	public boolean isValid() {
		boolean res=false;
		if((!nome.isEmpty() && nome!=null)&&(!cognome.isEmpty() && cognome!=null)){
			res=true;
		}
		return res;
	}

}
