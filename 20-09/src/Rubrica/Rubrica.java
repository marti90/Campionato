package Rubrica;
import java.util.ArrayList;
import java.util.List;


public class Rubrica {
	
	private String nomeProprietario;
	
	private List<Voce> voci= new ArrayList<Voce>();
	
	public Rubrica() {
		
	}
	
	public Rubrica(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	//ritorna la lista di voci
	public List<Voce> getVoci() {                    
		return voci;
	}
	
	//metodo per aggiungereuna voce alla lista
	public void setVoce(Voce v){
		voci.add(v);
	}
	
	//metodo per trovare il numero di telefono dati Nome e Cognome del contatto
	String str;
	public String trovaNum(String n, String c){
		for(Voce v : voci){
			if(v.getNome().equals(n) && v.getCognome().equals(c)){
				str= v.getTel();
			} else
				str="Contatto non presente";
		}
		return str;
		
	}

}
