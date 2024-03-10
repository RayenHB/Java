package tp2;

import java.util.ArrayList;
import java.util.List;

public class Etudiant implements Istatisticable,Comparable<Etudiant> {
	
	private String matricule;
	private String nom;
	private List<Note> Lnotes;
	
	public Etudiant(String matricule, String nom) {
		this.matricule = matricule;
		this.nom = nom;
		this.Lnotes = new ArrayList<>();
	}
	
	
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Note> getLnotes() {
		return Lnotes;
	}
	public void setLnotes(List<Note> lnotes) {
		Lnotes = lnotes;
	}
	
	public void addNote(Note note)
	{
		Lnotes.add(note);
	}


	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", Lnotes=" + Lnotes + "]";
	}


	@Override
	public double getValue() {
		double moy = 0;
		for (Note i : Lnotes) {
			moy = moy + i.getNote();
		}
		return moy/Lnotes.size();
	}
	
	public double getMax() {
		Note max = Lnotes.get(0);
		for (Note i : Lnotes) {
			if (i.getNote()>max.getNote()) {
				max = i;
			}
		}
		return max.getNote();
	}
	
	public double getMin() {
		Note min = Lnotes.get(0);
		for (Note i : Lnotes) {
			if (i.getNote()<min.getNote()) {
				min = i;
			}
		}
		return min.getNote();
	}
	
	public int compareTo(Etudiant E) {
		return (int) (this.getValue() - E.getValue());
	}


	
	
	
}
