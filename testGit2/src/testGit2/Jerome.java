package testGit2;

public class Jerome {
	
	//petite modification dans mon code !!!
	protected String nom;
	protected String prenom;
	
	public Jerome() {
	}

	public Jerome(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public void coucou(){
		System.out.println("hello tout le monde ! ");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
	
	
	
	
}
