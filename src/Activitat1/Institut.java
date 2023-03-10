package Activitat1;

public class Institut {
	private String nom;
	private Alumne[] llistaAlumnes;
	private int numAlumne;

	public Alumne[] getLlista() {
		return this.llistaAlumnes;
	}
	
	public void afegirAlumne(Alumne alumne) {
		this.llistaAlumnes[numAlumne] = alumne;
		this.numAlumne++;
	}

	public Institut(String nom) {
		this.nom = nom;
		this.llistaAlumnes = new Alumne[100];
		this.numAlumne = 0;
	}

	public Institut(String nom, int max) {
		this.nom = nom;
		this.llistaAlumnes = new Alumne[max];
		this.numAlumne = 0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Alumne[] getLlistaAlumnes() {
		return llistaAlumnes;
	}

	public void setLlistaAlumnes(Alumne[] llistaAlumnes) {
		this.llistaAlumnes = llistaAlumnes;
	}

	

}
