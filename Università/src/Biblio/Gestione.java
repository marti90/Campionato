package Biblio;

import java.util.Date;

public class Gestione {
	
	public int registraLibro(String titolo, String autore, int copieDaRegistrare, Biblioteca b){

		Libro l= cercaLibro(titolo,autore,b);
		
		if(l!=null){
		   l.setCopieTotali(l.getCopieTotali()+copieDaRegistrare);
		} else{
			
			l=new Libro(titolo,autore);
			b.getLibri().add(l);
			l.setCopieTotali(copieDaRegistrare);
			l.setCopieDisponibili(copieDaRegistrare);
		}
		
		return l.getCopieTotali();
	}
	
	public boolean registraUtente(String nome, String cognome, Biblioteca b){
		
		Utente u= cercaUtente(nome,cognome,b);

		if(u== null){
			u= new Utente(nome,cognome);
			b.getUtenti().add(u);
			return true;
		} else 
			return false;	
	}
	
	public boolean prestaLibro(String titolo, String autore, String nome, String cognome, Biblioteca b){
		
		Libro l= cercaLibro(titolo,autore,b);
		Utente u= cercaUtente(nome,cognome,b);
		
		if((l!=null)&&(u!=null)){
			
			if(l.getCopieDisponibili()==0){
				System.out.println("Attenzione il libro non e' disponibile!");
			}
			
			if(u.getLibriInPrestito().size()<3){
				
				u.getLibriInPrestito().add(l);
				l.setCopieDisponibili((l.getCopieDisponibili())-1);
				Date d = new Date();
				Prestito p = new Prestito(l,u,d,null);
				b.getPrestiti().add(p);
				
			}else 
				System.out.println("Attenzione ho gia 3 libri in prestito, non posso prenderne un altro!");
			
			return true;
			
		} else {
			System.out.println("Attenzione uno tra libro o utente non e' registrato!");
		    return false;
		}

	}
	
	public boolean restituzioneLibro(String titolo, String autore, String nome, String cognome, String dataPrestito, Biblioteca b){
		Libro l= cercaLibro(titolo,autore,b);
		
		Utente u= cercaUtente(nome,cognome,b);
		
		if((l!=null)&&(u!=null)){
			u.getLibriInPrestito().remove(l);
			
			return true;
		} else return false;
	}
	
	public Libro cercaLibro(String titolo,String autore, Biblioteca b){
        Libro l= null;
		
		for(Libro libro :b.getLibri()){
			if((libro.getTitolo().equals(titolo))&&(libro.getAutore().equals(autore))){
		        l=libro;
			
			}
		}
		return l;
	}
	
	public Utente cercaUtente(String nome, String cognome,Biblioteca b){
		Utente u= null;
		
		for(Utente utente : b.getUtenti()){
			if((utente.getNome().equals(nome))&&(utente.getCognome().equals(cognome))){
				u= utente;
			}
		}
		return u;
	}

}
