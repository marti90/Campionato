package Campionato;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Squadra{
	
	private String nome="";
	private int punti=0;
	private int retiFatte=0;
	private int retiSubite=0;
	private int differenzaReti= retiFatte-retiSubite;
	
	private Map<String,Giocatore> giocatoriSquadra=new TreeMap<String,Giocatore>(); 
	private List<Partita> partiteGiocate=new ArrayList<Partita>();
	
	public Squadra(){
		
	}
	
	public Squadra(String nome) {
	
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}

	public int getRetiFatte() {
		return retiFatte;
	}

	public void setRetiFatte(int retiFatte) {
		this.retiFatte = retiFatte;
	}

	public int getRetiSubite() {
		return retiSubite;
	}

	public void setRetiSubite(int retiSubite) {
		this.retiSubite = retiSubite;
	}

	public int getDifferenzaReti() {
		return differenzaReti;
	}

	public boolean isValid() {
		boolean res=false;
		if((!nome.isEmpty() && nome!=null)){
			res=true;
		}
		return res;
	}
	
	public String toString(){
		return nome;
	}

	public Map<String, Giocatore> getGiocatoriSquadra() {
		return giocatoriSquadra;
	}

	public void setGiocatoriSquadra(Map<String, Giocatore> giocatoriSquadra) {
		this.giocatoriSquadra = giocatoriSquadra;
	}

	public List<Partita> getPartiteGiocate() {
		return partiteGiocate;
	}

	public void setPartiteGiocate(List<Partita> partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}
	
	

}
