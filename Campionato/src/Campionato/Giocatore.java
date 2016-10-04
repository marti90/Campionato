package Campionato;

public class Giocatore implements Comparable<Giocatore>{
	
	private String nome="";
	private String cognome="";
	private String ruolo="";
	private int età=0;
	private int ammonizioni=0;
	private int espulsioni=0;
	private int reti=0;
	private int assist=0;
	private String cf="";
	
	public Giocatore(){
		
	}
	
	public Giocatore(String nome, String cognome, String cf) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public int getEtà() {
		return età;
	}

	public void setEtà(int età) {
		this.età = età;
	}

	public int getAmmonizioni() {
		return ammonizioni;
	}

	public void setAmmonizioni(int ammonizioni) {
		this.ammonizioni = ammonizioni;
	}

	public int getEspulsioni() {
		return espulsioni;
	}

	public void setEspulsioni(int espulsioni) {
		this.espulsioni = espulsioni;
	}

	public int getReti() {
		return reti;
	}

	public void setReti(int reti) {
		this.reti = reti;
	}

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}
	
	public boolean isValid() {
		boolean res=false;
		if((!nome.isEmpty() && nome!=null)&&(!cognome.isEmpty() && cognome!=null)&&(!cf.isEmpty() && cf!=null)){
			res=true;
		}
		return res;
	}
	
	public String toString(){
		return nome+" "+cognome+" "+cf;
	}

	@Override
	public int compareTo(Giocatore altro) {
		
		int diffReti= -(this.getReti()-altro.getReti());
		if(diffReti!= 0){
			return diffReti;
		} else {
			int diffAmmonizioni = this.getAmmonizioni()-altro.getAmmonizioni();
			if(diffAmmonizioni!=0){
				return diffAmmonizioni;
			} else
				return this.getEspulsioni()-altro.getEspulsioni();
		}
	}
	
}
