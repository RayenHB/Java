package tp2;

public class Note {
	private String Nomcours;
	private Double note;
	
	public Note(String nomcours, Double note) {
		Nomcours = nomcours;
		this.note = note;
	}

	public String getNomcours() {
		return Nomcours;
	}

	public void setNomcours(String nomcours) {
		Nomcours = nomcours;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Note [Nomcours=" + Nomcours + ", note=" + note + "]";
	}
	
	
	
}
