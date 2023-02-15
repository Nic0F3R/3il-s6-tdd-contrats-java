package exo1_2;

public class BonjourAmi {

	public static String bonjourAmi(String ...pfNom) {
		
		String res = "";
		String listeNom = "";
		
		if(pfNom == null) {
			res = "Bonjour, ami.";
		} else {
		
			if(pfNom.length == 1) {// Si un seul nom est envoyé en paramètres
					
				if(pfNom == null) {
					res = "Bonjour, ami.";
				} else {
					
					// Teste si le nom est tout en majuscules
					if(pfNom[0].equals(pfNom[0].toUpperCase())) {
						res = "BONJOUR, " + pfNom[0] + " !";
					} else {
						res = "Bonjour, " + pfNom[0] + ".";
					}
					
				}
					
			} else { // Si plusieurs noms sont envoyés en paramètres
			
				for(String nom : pfNom) {
					listeNom += nom + " et ";
				}
				
				listeNom = listeNom.substring(0, (listeNom.length() - 4));
				
				res = "Bonjour, " + listeNom + ".";
				
			}
			
		}
		
		return res;
		
	}
	
}
