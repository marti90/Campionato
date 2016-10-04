import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Campionato.*;


public class TestMain {

	public static void main(String[] args) throws ParseException {
		
		ServizioCampionato sc = new ServizioCampionato();
		Campionato c= new Campionato("Champions League");
		
		Giocatore g1= sc.registraGiocatore(c, "Luca", "Toni", "LTN");
		Giocatore g2= sc.registraGiocatore(c, "Alessandro", "Del Piero", "WHG");
		Giocatore g3= sc.registraGiocatore(c, "Steven", "Gerrard", "STV");
		Giocatore g4= sc.registraGiocatore(c, "Pavel", "Nedved", "NDV");
		Giocatore g5= sc.registraGiocatore(c, "Luca", "Toni", "LTN");
		Giocatore g6= sc.registraGiocatore(c, "Javier", "Zanetti", "ZNT");
		Giocatore g7= sc.registraGiocatore(c, "Gary", "Medel", "MDL");
		Giocatore g8= sc.registraGiocatore(c, "Mauro", "Icardi", "CRD");
		Giocatore g9= sc.registraGiocatore(c, "Piccolo", "Coutinho", "CTN");
		Giocatore g10= sc.registraGiocatore(c, "Paolo", "Maldini", "MLD");
		Giocatore g11= sc.registraGiocatore(c, "Alessandro", "Nesta", "NST");
		Giocatore g12= sc.registraGiocatore(c, "Pippo", "Inzaghi", "ZNG");
		Giocatore g13= sc.registraGiocatore(c, "Lionel", "Messi", "MSS");
		Giocatore g14= sc.registraGiocatore(c, "Andres", "Iniesta", "NST");
		Giocatore g15= sc.registraGiocatore(c, "Frank", "Lampard", "LMP");
		Giocatore g16= sc.registraGiocatore(c, "Mario", "Balotelli", "BLT");
		Giocatore g17= sc.registraGiocatore(c, "Cristiano", "Ronaldo", "RNL");
		
		for(Giocatore g:c.getGiocatoriCampionato().values()){
			
			System.out.println(g);
		}
		
		System.out.println();
		
		Squadra s1= sc.registraSquadra(c, "Juventus");
		Squadra s2= sc.registraSquadra(c, "Inter");
		Squadra s3= sc.registraSquadra(c, "Liverpool");
		Squadra s4= sc.registraSquadra(c, "Inter");
		Squadra s5= sc.registraSquadra(c, "Milan");
		Squadra s6= sc.registraSquadra(c, "Barcellona");
		Squadra s7= sc.registraSquadra(c, "Chealse");
		Squadra s8= sc.registraSquadra(c, "Nizza");
		Squadra s9= sc.registraSquadra(c, "Real Madrid");
		
        for(Squadra s:c.getSquadreCampionato().values()){
			
			System.out.println(s);
		}
        
        System.out.println();
        
        sc.assegnaGiocatoreASquadra(c, g2, s1);
        sc.assegnaGiocatoreASquadra(c, g4, s1);
        sc.assegnaGiocatoreASquadra(c, g1, s1);
        sc.assegnaGiocatoreASquadra(c, g5, s1);
        sc.assegnaGiocatoreASquadra(c, g3, s3);
        sc.assegnaGiocatoreASquadra(c, g6, s2);
        sc.assegnaGiocatoreASquadra(c, g6, s4);
        sc.assegnaGiocatoreASquadra(c, g7, s2);
        sc.assegnaGiocatoreASquadra(c, g8, s2);
        sc.assegnaGiocatoreASquadra(c, g9, s3);
        sc.assegnaGiocatoreASquadra(c, g10, s5);
        sc.assegnaGiocatoreASquadra(c, g11, s5);
        sc.assegnaGiocatoreASquadra(c, g12, s5);
        sc.assegnaGiocatoreASquadra(c, g13, s6);
        sc.assegnaGiocatoreASquadra(c, g14, s6);
        sc.assegnaGiocatoreASquadra(c, g15, s7);
        sc.assegnaGiocatoreASquadra(c, g16, s8);
        sc.assegnaGiocatoreASquadra(c, g17, s9);
        
        for(Giocatore g: s1.getGiocatoriSquadra().values()){
			
			System.out.println(g);
		}
        
        System.out.println();
        
        List<Giocatore> retiFatte = new ArrayList<Giocatore>();
        List<Giocatore> ammoniti = new ArrayList<Giocatore>();
        List<Giocatore> espulsi = new ArrayList<Giocatore>();
        
        retiFatte.add(g1);
        retiFatte.add(g2);
        retiFatte.add(g6);
        retiFatte.add(g2);
        retiFatte.add(g1);
        
        ammoniti.add(g2);
        ammoniti.add(g6);
        ammoniti.add(g1);
       
        
        espulsi.add(g4);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = "02/10/2016";
        Date data = sdf.parse(dateInString);
		Partita p1= sc.registraPartita(c, s1, s2, 4, 1, data , retiFatte, espulsi, ammoniti);
		
		List<Giocatore> retiFatte1 = new ArrayList<Giocatore>();
        List<Giocatore> ammoniti1 = new ArrayList<Giocatore>();
        List<Giocatore> espulsi1 = new ArrayList<Giocatore>();
		
        retiFatte1.add(g8);
		retiFatte1.add(g8);
		ammoniti1.add(g7);
		String dateInString2 = "25/09/2016";
        Date data2 = sdf.parse(dateInString2);
		Partita p2= sc.registraPartita(c, s2, s1, 2, 0, data2 , retiFatte1, espulsi1, ammoniti1);
		
		List<Giocatore> retiFatte2 = new ArrayList<Giocatore>();
        List<Giocatore> ammoniti2 = new ArrayList<Giocatore>();
        List<Giocatore> espulsi2 = new ArrayList<Giocatore>();
        
		retiFatte2.add(g10);
		retiFatte2.add(g10);
		retiFatte2.add(g10);
		ammoniti2.add(g4);
		ammoniti2.add(g10);
		ammoniti2.add(g12);
		Partita p3= sc.registraPartita(c, s5, s1, 3, 0, data , retiFatte2, espulsi2, ammoniti2);
	
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	
		System.out.println(s1.getPunti());
		System.out.println(s2.getPunti());
		
		System.out.println();
		
		System.out.println(sc.getCapocannoniere(c));
		
		System.out.println();
		
		System.out.println(sc.getCampione(c));
		
	}

}
