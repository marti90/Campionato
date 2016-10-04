package Biblio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements ValidaDati{
	
	private String nome="";
	private List<Libro> libri = new ArrayList<Libro>();
	private List<Utente> utenti = new ArrayList<Utente>();
	private List<Prestito> prestiti = new ArrayList<Prestito>();

	public Biblioteca(){
		
	}
	
	public Biblioteca(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Libro> getLibri() {
		return libri;
	}

	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}
	
	public List<Utente> getUtenti() {
		return utenti;
	}

	public void setUtenti(List<Utente> utenti) {
		this.utenti = utenti;
	}

	public List<Prestito> getPrestiti() {
		return prestiti;
	}

	public void setPrestiti(List<Prestito> prestiti) {
		this.prestiti = prestiti;
	}
	
	@Override
	public boolean isValid() {
		boolean res=false;
		if(!nome.isEmpty() && nome!=null){
			res=true;
		}
		return res;
	}

}
