package tp2;

import java.util.Iterator;
import java.util.List;

public class Stats { 
	
	public void afficherStats(List <Etudiant> e) {
		
		Iterator<Etudiant>it=e.iterator();
		
		while(it.hasNext()) {
			Etudiant E = it.next();
			System.out.println(E.getValue());
			System.out.println(E.getMin());
			System.out.println(E.getMax());
		}
	}
}
