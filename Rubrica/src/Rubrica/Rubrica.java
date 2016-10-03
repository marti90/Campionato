package Rubrica;

import java.util.Map;
import java.util.TreeMap;

public class Rubrica {
	
	private Map<String, Voce> voci =new TreeMap<String, Voce>();

	public Map<String, Voce> getVoci() {
		return voci;
	}

	public void setVoci(Map<String, Voce> voci) {
		this.voci = voci;
	}
	
	public Voce aggiungiVoce(String nome, String cognome, String tel) throws VoceGi‡Esiste{
		
		if(voci.containsKey(nome+" "+cognome)){
			throw new VoceGi‡Esiste("Era gia dentro classe Rubrica metodo aggiungiVoce");
		}
		
		Voce v= new Voce(nome,cognome,tel);
		voci.put(nome+" "+cognome, v);
		
		return v;
	}
}
