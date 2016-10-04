package Università;

import java.util.ArrayList;
import java.util.List;

import Biblio.ValidaDati;

public class Corso implements ValidaDati{
	
	private String nome="";
	private int ore=0;
	
	private List<Studente> studentiDelCorso = new ArrayList<Studente>();
	private List<Docente> docentiDelCorso = new ArrayList<Docente>();
	
	public Corso(){
		
	}
	public Corso(String nome, int ore) {
		super();
		this.nome = nome;
		this.ore = ore;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getOre() {
		return ore;
	}
	public void setOre(int ore) {
		this.ore = ore;
	}
	
	@Override
	public boolean isValid() {
		boolean res=false;
		if((!nome.isEmpty() && nome!=null)&& ore!=0){
			res=true;
		}
		return res;
	}
	
	public List<Studente> getStudentiDelCorso() {
		return studentiDelCorso;
	}
	
	public void setStudentiDelCorso(List<Studente> studentiDelCorso) {
		this.studentiDelCorso = studentiDelCorso;
	}
	
	public List<Docente> getDocentiDelCorso() {
		return docentiDelCorso;
	}
	
	public void setDocentiDelCorso(List<Docente> docentiDelCorso) {
		this.docentiDelCorso = docentiDelCorso;
	}
	
	public String toString(){
		return nome+" "+ore;
	}

}
