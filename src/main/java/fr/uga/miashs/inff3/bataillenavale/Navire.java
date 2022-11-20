package fr.uga.miashs.inff3.bataillenavale;

public class Navire {
	 private Coordonnee debut;
	 private Coordonnee fin;
	 private Coordonnee[] partiesTouchees;
	 private int nbTouchees;
	 
	 public Navire(Coordonnee debut, int longueur, boolean estVertical) {
		 this.debut=debut;
		 partiesTouchees=new Coordonnee[longueur];
		 nbTouchees=0;
		 if(estVertical) {
			 fin=new Coordonnee(debut.getLigne()+longueur-1,debut.getColonne());
		 } else {
			 fin=new Coordonnee(debut.getLigne(),debut.getColonne()+longueur-1);
		 }
	 }
	 public String toString() {
		 String touchees=new String();
		 for(int i=0;i<nbTouchees;i++) {
			 touchees+=" "+partiesTouchees[i].toString();
		 }
		 return "Début : "+debut.toString()+" - Fin : "+fin.toString()+" - Parties touchees : "+touchees;
	 }
	 
	 public Coordonnee getDebut() {
		 return debut;
	 }
	 
	 public Coordonnee getFin() {
		 return fin;
	 }
	 
	 public boolean contient(Coordonnee c) {
		 return ((c.getLigne()<=fin.getLigne() && c.getLigne()>=debut.getLigne()) && (c.getColonne()<=fin.getColonne() && c.getColonne()>=debut.getColonne()));
	 }
	 private static boolean intersectionNonVide(int d1, int f1, int d2, int f2) {
		 return !(d1>f2||f1<d2);
	 }
	 public boolean chevauche(Navire n) {
		 boolean n1= intersectionNonVide(getDebut().getColonne(), getFin().getColonne(), n.getDebut().getColonne(), n.getFin().getColonne());
		 boolean n2=intersectionNonVide(getDebut().getLigne(), getFin().getLigne(), n.getDebut().getLigne(), n.getFin().getLigne());
		 return n1&&n2;
	 }
	 /*public boolean touche(Navire n) {
		 return (intersectionNonVide(getDebut().getColonne(), getFin().getColonne(), n.getDebut().getColonne(), n.getFin().getColonne())&&getDebut().getLigne()==n.getFin().getLigne()+1||getFin()
	 }*/
	 
}