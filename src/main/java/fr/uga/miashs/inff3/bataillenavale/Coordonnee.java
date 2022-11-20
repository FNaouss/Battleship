package fr.uga.miashs.inff3.bataillenavale;

public class Coordonnee {
	private int ligne;
	private int colonne;
	public Coordonnee(String s) {
		 char c=s.charAt(0);
		if(c>='a'&&c<='z') {
			colonne=s.charAt(0)-'a';
		}
		else {
			colonne = s.charAt(0)-'A';
		}
		ligne=Integer.parseInt(s.substring(1))-1;
	}
	
	public Coordonnee(int l, int c) {
		ligne = l;
		colonne = c;
	}
	
	public int getLigne() {
		
		return ligne;
	}
	
	public int getColonne() {
		
		return colonne;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Coordonnee) {
			Coordonnee c = (Coordonnee) o;
			return colonne==c.colonne && ligne==c.ligne;
		}
		return false;
	}
	
	public boolean voisine(Coordonnee c) {
		return(((c.ligne==ligne+1)||(c.ligne==ligne-1))&&c.colonne==colonne)||(((c.colonne==colonne+1)||(c.colonne==colonne-1))&&(c.ligne==ligne));
	}
	
	public int compareTo(Coordonnee c) {
		if(ligne==c.ligne)return colonne-c.colonne;
		return ligne-c.ligne;
	}
	
	public String toString() {
	   return ""+(char)('A'+colonne)+(ligne+1);
	}
}