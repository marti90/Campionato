package Università;

import java.util.ArrayList;
import java.util.List;

import Biblio.Biblioteca;
import Biblio.ValidaDati;

public class Università implements ValidaDati{
	
	private String nome="";
	private Biblioteca b = new Biblioteca();
	
	private List<Studente> studenti= new ArrayList<Studente>();
	private List<Docente> docenti= new ArrayList<Docente>();
	private List<Corso> corsi= new ArrayList<Corso>();

	public Università(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean isValid() {
		boolean res=false;
		if(!nome.isEmpty() && nome!=null){
			res=true;
		}
		return res;
	}

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}

	public List<Docente> getDocenti() {
		return docenti;
	}

	public void setDocenti(List<Docente> docenti) {
		this.docenti = docenti;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}

	public Biblioteca getB() {
		return b;
	}

	public void setB(Biblioteca b) {
		this.b = b;
	}

}
