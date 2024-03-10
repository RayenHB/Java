package tp2;

import java.util.Collections;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Note n1 = new Note("java",(double) 18);
		Note n2 = new Note("C",(double) 17);
		Etudiant e1 = new Etudiant("22","rayen");
		e1.addNote(n1);
		e1.addNote(n2);
		Note n3 = new Note("python",(double) 16);
		Note n4 = new Note("C",(double) 15);
		Etudiant e2 = new Etudiant("11","hbili");
		e1.addNote(n1);
		e1.addNote(n2);
		e2.addNote(n4);
		e2.addNote(n3);
		System.out.println(e1.toString());
		Vector <Etudiant>V1 =new Vector<>();
		V1.add(e1);
		V1.add(e2);
		
		Stats s1 = new Stats();
		
		s1.afficherStats(V1);
		System.out.println("tri par moy: ");
		Collections.sort(V1);
		s1.afficherStats(V1);
		System.out.println("tri par mat: ");
		Matcomparator C = new Matcomparator();
		Collections.sort(V1,C);
		s1.afficherStats(V1);

	}

}
