package Campionato;

import java.util.Comparator;

public class SquadraComparator implements Comparator<Squadra>{
	
	public int compare(Squadra s1, Squadra s2) {
		
		int diffPunti= -(s1.getPunti()-s2.getPunti());
		if(diffPunti != 0){
			return diffPunti;
		}else{
			int scontriDiretti= scontriDiretti(s1,s2);
			if(scontriDiretti != 0){
				return scontriDiretti;
			} else{
			     int diffReti= s1.getDifferenzaReti()-s2.getDifferenzaReti();
			     return diffReti;
			      }
		}
		
	}
	
     public int scontriDiretti(Squadra s1, Squadra s2){
		
		int retiS1=0;
		int retiS2=0;
		
		for(Partita p:s1.getPartiteGiocate()){
			if(p.getsCasa().equals(s1) && p.getsOspite().equals(s2)){
				retiS1+= s1.getRetiFatte();
				retiS2+= s2.getRetiFatte();
			}
		}
		for(Partita p:s2.getPartiteGiocate()){
		    if(p.getsCasa().equals(s2) && p.getsOspite().equals(s1)){
			    retiS1+= s1.getRetiFatte();
			    retiS2+= s2.getRetiFatte();
		    }
		}
		
		return retiS1-retiS2;
	}


}
