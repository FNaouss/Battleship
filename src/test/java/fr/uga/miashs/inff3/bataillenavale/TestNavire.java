package fr.uga.miashs.inff3.bataillenavale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestNavire {
	private static Coordonnee c1=new Coordonnee("C1");
	private static Coordonnee c2=new Coordonnee("C2");
	private static Coordonnee c3=new Coordonnee("C3");
	private static Coordonnee d1=new Coordonnee("D1");
	private static Coordonnee b1=new Coordonnee("B1");
	private static Coordonnee c4=new Coordonnee("C4");
	private static Coordonnee e1=new Coordonnee("E1");
	private static Coordonnee f1=new Coordonnee("F1");
	
@Test
public void testNewNavireVertical() {
	Navire n =new Navire(c1,3,true);
	assertEquals(n.getDebut(), c1);
	assertEquals(n.getFin(), c3);
	
	assertTrue(n.contient(c1));
	assertTrue(n.contient(c2));
	assertTrue(n.contient(c3));
	
	assertFalse(n.contient(b1));
	assertFalse(n.contient(d1));
	assertFalse(n.contient(c4));
	
	//assertFalse(n.estCoule);//
}
}
