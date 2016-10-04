package Campionato;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Campionato {
	
	private String nome="";
	
	private Map<String,Giocatore> giocatoriCampionato= new TreeMap<String,Giocatore>();
	private Map<String,Squadra> squadreCampionato= new TreeMap<String,Squadra>();
	private List<Partita> partiteCampionato= new ArrayList<Partita>();

	public Campionato(){
		
	}
	
	public Campionato(String nome) {
		
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<String,Giocatore> getGiocatoriCampionato() {
		return giocatoriCampionato;
	}

	public void setGiocatoriCampionato(Map<String,Giocatore> giocatoriCampionato) {
		this.giocatoriCampionato = giocatoriCampionato;
	}

	public Map<String,Squadra> getSquadreCampionato() {
		return squadreCampionato;
	}

	public void setSquadreCampionato(Map<String,Squadra> squadreCampionato) {
		this.squadreCampionato = squadreCampionato;
	}

	public List<Partita> getPartiteCampionato() {
		return partiteCampionato;
	}

	public void setPartiteCampionato(List<Partita> partiteCampionato) {
		this.partiteCampionato = partiteCampionato;
	}
	
	

}
