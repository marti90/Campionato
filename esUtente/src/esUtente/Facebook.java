package esUtente;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Facebook {
	
	private List<Utente> utenti= new ArrayList<Utente>();
	private Map<String,List<Utente>> gruppiFacebook = new TreeMap<String,List<Utente>>();
	
	public Facebook(){
		
	}
	
	public void registraUtente(String nome, String cognome, int eta, char sesso, String email){
		
			if(email.contains("@")==false){
				System.out.println("Errore: email errata!");
			} else {
				Utente u = new Utente(nome,cognome,eta,sesso,email);
				utenti.add(u);
			}
	}
	
	public void aggiungiAmici(String nomeCognome1, String nomeCognome2){
		
		Utente u1=null;
		Utente u2=null;
		
		for(Utente u:utenti){
			String strtemp= u.getNome()+" "+u.getCognome();
			if(nomeCognome1.equals(strtemp)==true){
				u1=u;
			}
		}
		for(Utente u:utenti){
			String strtemp= u.getNome()+" "+u.getCognome();
			if(nomeCognome2.equals(strtemp)==true){
				u2=u;
			}
		}
		if((u1!=null) && (u2!=null)){
			u1.aggiungiA(u2);
			u2.aggiungiA(u1);
		}
		
	}
	
	public String getAmiciDiUnUtente(String nome, String cognome){
		String strtemp="";
		Utente u=null;
		for(Utente ut:utenti){
			if((ut.getNome().equals(nome)==true) && (ut.getCognome().equals(cognome)==true)){
				u=ut;
			}
		}
		
		//ciclo sulla mia lista di amici. Per ogni amico ne stampo nome e cognome.
			for(Utente utente:u.getAmici()){
				strtemp+=utente.getNome()+" "+utente.getCognome()+"\n";
			}
		return strtemp;
	}
	
	public String getAmiciDiAmici(String nome, String cognome){
		
		String strtemp="";
		List<Utente> amiciDiAmici = new ArrayList<Utente>();
		Utente u=null;
		for(Utente ut:utenti){
			if((ut.getNome().equals(nome)==true) && (ut.getCognome().equals(cognome)==true)){
				u=ut;
			}
		}
		
		//ciclo sui miei amici
		for(Utente utente : u.getAmici()){
				
		//per ogni amico del mio amico controllo che non sia contenuto già neimiei amici.
		//in quel caso aggiungo alla lista di amici di amici. Tolgo inoltre i duplicati
			for(Utente uten:utente.getAmici()){
				if(!(amiciDiAmici.contains(uten))&& !(u.getAmici().contains(uten))){
					amiciDiAmici.add(uten);
				}
			}
		}
		
		//rimuovo mestesso dalla lista di amici di amici
		amiciDiAmici.remove(u);
		
		for(Utente utente:amiciDiAmici){
			strtemp+=utente.getNome()+" "+utente.getCognome()+"\n";
		}
		
		return strtemp;
	}
	
	public String amiciInComune(String nomeCognome1, String nomeCognome2){
		
		Utente u1=null;
		Utente u2=null;
		
		for(Utente u:utenti){
			String strtemp= u.getNome()+" "+u.getCognome();
			if(nomeCognome1.equals(strtemp)==true){
				u1=u;
			}
		}
		for(Utente u:utenti){
			String strtemp= u.getNome()+" "+u.getCognome();
			if(nomeCognome2.equals(strtemp)==true){
				u2=u;
			}
		}
		String amiciInComune="";
		for(Utente amico1: u1.getAmici()){
			for(Utente amico2: u2.getAmici()){
				if(amico1.equals(amico2)){
					amiciInComune+=amico2+"\n";
				}
			}
		}
		
		return amiciInComune;
		
	}
	
	public boolean creaGruppo(String nome, Utente u){
		
		Utente utemp=null;
		for(Utente utente:utenti){
			if(utente.getNome().equals(u.getNome()) && utente.getCognome().equals(u.getCognome())){
				utemp=u;
			}
		}
		if(utemp != null){
			List<Utente> utentiGruppo = new ArrayList<Utente>();
			utentiGruppo.add(utemp);
			gruppiFacebook.put(nome, utentiGruppo);
			return true;
		} else
			return false;
		
	}
	
	public boolean aggiungiUtenteAGruppo(String nome, Utente u){
		
		Utente utemp=null;
		for(Utente utente:utenti){
			if(utente.getNome().equals(u.getNome()) && utente.getCognome().equals(u.getCognome())){
				utemp=u;
			}
		}
		if(utemp != null){
			gruppiFacebook.get(nome).add(utemp);
			return true;
		} else
			return false;
		
	}

	public Map<String, List<Utente>> getGruppiFacebook() {
		return gruppiFacebook;
	}

	public void setGruppiFacebook(Map<String, List<Utente>> gruppiFacebook) {
		this.gruppiFacebook = gruppiFacebook;
	}

}
