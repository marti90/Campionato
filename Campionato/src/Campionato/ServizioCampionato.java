package Campionato;


import java.util.ArrayList;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ServizioCampionato {
	
	public Giocatore registraGiocatore(Campionato c, String nome, String cognome, String cf){
		
		Giocatore g=null;
		
		if(!(c.getGiocatoriCampionato().containsKey(cf))){
				
			    g= new Giocatore(nome,cognome,cf);
				if(g.isValid()){
					c.getGiocatoriCampionato().put(cf, g);
				}
		} 
		
		return g;
		
	}
	
	public Squadra registraSquadra(Campionato c, String nome){
		
		Squadra s=null;

		if(!(c.getSquadreCampionato().containsKey(nome))){
			
		    s= new Squadra(nome);
			if(s.isValid()){
				c.getSquadreCampionato().put(nome, s);
			}
	    }
	    return s;
	}
	
	public boolean assegnaGiocatoreASquadra(Campionato c, Giocatore g, Squadra s){
		
		boolean ris=false;
		if((c.getGiocatoriCampionato().containsValue(g)) &&(c.getSquadreCampionato().containsValue(s))){
			s.getGiocatoriSquadra().put(g.getCf(), g);
			ris=true;
		}
		
		return ris;
	}
	
	public Partita registraPartita(Campionato c, Squadra sCasa, Squadra sOspite, int rCasa, int rOspite, 
			Date data, List<Giocatore> retiFatte, List<Giocatore> espulsi, List<Giocatore> ammoniti){
		
		Partita p=null;
		
		for(Partita partita:c.getPartiteCampionato()){
			if(partita.getsCasa().equals(sCasa)&&partita.getsOspite().equals(sOspite)&&partita.getRetiCasa()==rCasa 
					&&partita.getRetiOspite()==rOspite && partita.getD().equals(data)){
				
				p=partita;
			}
		}
		
		if(p==null){
			 
			p= new Partita(data,sCasa,sOspite,rCasa,rOspite);
			if(rCasa==rOspite){
				p.setRisultato('X');
				sCasa.setPunti(sCasa.getPunti()+1);
				sOspite.setPunti(sOspite.getPunti()+1);
				
			} else if(rCasa>rOspite){
				p.setRisultato('1');
				sCasa.setPunti(sCasa.getPunti()+3);
				
			} else {
				p.setRisultato('2');
				sOspite.setPunti(sOspite.getPunti()+3);
			}
			c.getPartiteCampionato().add(p);
				
		}
		
		for(Giocatore g: retiFatte){
			g.setReti(g.getReti()+1);
		}
		
        for(Giocatore g: ammoniti){
			g.setAmmonizioni(g.getAmmonizioni()+1);
		}
        for(Giocatore g: espulsi){
			g.setEspulsioni(g.getEspulsioni()+1);
		}
        
        sCasa.setRetiFatte(rCasa);
        sCasa.setRetiSubite(rOspite);
        sOspite.setRetiFatte(rOspite);
        sOspite.setRetiSubite(rCasa);
        
        sCasa.getPartiteGiocate().add(p);
        sOspite.getPartiteGiocate().add(p);
		
		return p;
	}
	
	public Giocatore getCapocannoniere(Campionato c){
		
		List<Giocatore> giocatoriTemp = new ArrayList<Giocatore>(c.getGiocatoriCampionato().values());
		Collections.sort(giocatoriTemp);
		
		Giocatore g= giocatoriTemp.get(0);
		
		return g;

	}
	
	public Squadra getCampione(Campionato c){
		
		List<Squadra> squadreTemp = new ArrayList<Squadra>(c.getSquadreCampionato().values());
		Collections.sort(squadreTemp,new SquadraComparator());
		
		Squadra s= squadreTemp.get(0);
		
		return s;
	}
	
	


}
