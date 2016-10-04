import java.util.List;
import java.util.Map;


import esUtente.*;



		public class EsMain {

			public static void main(String[] args) {
			
				Facebook f=new Facebook();
				
				
				Utente u1 = new Utente("aaaa","aaaa",18,'M',"aaaa@alfa.com");
				
				Utente u2 = new Utente("bbbb","bbbb",18,'M',"bbbb@alfa.com");
				
				Utente u3= new Utente("cccc","cccc",28,'f',"cccc@alfa.com");
				
				Utente u4=new Utente("dddd","dddd",28,'F',"dddd@alfa.com");
				
				Utente u5=new Utente("eeeee","eeee",28,'F',"eeeee@alfa.com");
				
				
				f.registraUtente("aaaa","aaaa",18,'M',"aaaa@alfa.com");
				f.registraUtente("bbbb","bbbb",18,'M',"bbbb@alfa.com");
				f.registraUtente("cccc","cccc",28,'f',"cccc@alfa.com");
				f.registraUtente("dddd","dddd",28,'F',"dddd@alfa.com");
				f.registraUtente("eeeee","eeee",28,'F',"eeeee@alfa.com");
				
				
				
				f.aggiungiAmici(u1.getNome()+" "+u1.getCognome(),u2.getNome()+" "+u2.getCognome());
				f.aggiungiAmici(u1.getNome()+" "+u1.getCognome(),u3.getNome()+" "+u3.getCognome());
				f.aggiungiAmici(u1.getNome()+" "+u1.getCognome(),u4.getNome()+" "+u4.getCognome());
				f.aggiungiAmici(u1.getNome()+" "+u1.getCognome(),u5.getNome()+" "+u5.getCognome());
				f.aggiungiAmici(u2.getNome()+" "+u2.getCognome(),u3.getNome()+" "+u3.getCognome());
				f.aggiungiAmici(u3.getNome()+" "+u3.getCognome(),u5.getNome()+" "+u5.getCognome());
				f.aggiungiAmici(u4.getNome()+" "+u4.getCognome(),u3.getNome()+" "+u3.getCognome());
				f.aggiungiAmici(u5.getNome()+" "+u5.getCognome(),u2.getNome()+" "+u2.getCognome());
				
				
				
				System.out.println(f.getAmiciDiUnUtente("aaaa","aaaa"));
				
				
				System.out.println(f.getAmiciDiAmici("eeeee","eeee"));
				
				System.out.println(f.amiciInComune("aaaa aaaa","bbbb bbbb"));
				
				f.creaGruppo("Java", u1);
				f.aggiungiUtenteAGruppo("Java", u2);
				f.aggiungiUtenteAGruppo("Java", u3);
				f.creaGruppo("Palestra", u4);
				f.aggiungiUtenteAGruppo("Palestra", u5);
				
				for(Map.Entry<String, List<Utente>> e : f.getGruppiFacebook().entrySet()){
					
					System.out.println(e.getKey()+":");
					for(Utente u: f.getGruppiFacebook().get(e.getKey())){
						System.out.println(u);
					}
				}
			}

	}


