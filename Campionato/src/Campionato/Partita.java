package Campionato;

import java.util.Date;

public class Partita{
	
	private Date d=null;
	private Squadra sCasa;
	private Squadra sOspite;
	private int retiCasa=0;
	private int retiOspite=0;
	private char risultato;
	
	
	public Partita(){
		
	}
	
	public Partita(Date d, Squadra sCasa, Squadra sOspite, int retiCasa,
			int retiOspite) {
		
		this.d = d;
		this.sCasa = sCasa;
		this.sOspite = sOspite;
		this.retiCasa = retiCasa;
		this.retiOspite = retiOspite;
		
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public Squadra getsCasa() {
		return sCasa;
	}

	public void setsCasa(Squadra sCasa) {
		this.sCasa = sCasa;
	}

	public Squadra getsOspite() {
		return sOspite;
	}

	public void setsOspite(Squadra sOspite) {
		this.sOspite = sOspite;
	}

	public int getRetiCasa() {
		return retiCasa;
	}

	public void setRetiCasa(int retiCasa) {
		this.retiCasa = retiCasa;
	}

	public int getRetiOspite() {
		return retiOspite;
	}

	public void setRetiOspite(int retiOspite) {
		this.retiOspite = retiOspite;
	}

	public char getRisultato() {
		return risultato;
	}

	public void setRisultato(char risultato) {
		this.risultato = risultato;
	}
	
	public String toString(){
		return d+" "+sCasa+" "+sOspite+" "+retiCasa+"-"+retiOspite+" \nRisultato "+risultato;
	}

}
