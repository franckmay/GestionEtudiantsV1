/**
 * 
 */


/**
 * @author MICHEL
 *
 */
public class Etudiant {

	/**
	 * 
	 */
	private int numCoupon;
	private String matricule;
	private String prenom;
	private String nom;
	private String faculte;
	private String filiere;
	private int niveau;
	private String age;
	private int telephone;
	private String adresse;
	private String email;
	
	public Etudiant() {
	super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(int numCoupon, String matricule, String prenom, String nom,String faculte, String filiere, int niveau, String age, int telephone, String adresse, String email) {
		super();
		this.numCoupon = numCoupon;
		this.matricule = matricule;
		this.prenom = prenom;
		this.nom = nom;
		this.faculte = faculte;
		this.filiere = filiere;
		this.niveau = niveau;
		this.age = age;
		this.telephone = telephone;
		this.adresse = adresse;
		this.email = email;
	}
	public int getNumCoupon() {
		return numCoupon;
	}
	public void setNumCoupon(int numCoupon) {
		this.numCoupon = numCoupon;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getFaculte() {
		return faculte;
	}
	
	public void setFaculte(String faculte) {
		this.faculte = faculte;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String string) {
		this.age = string;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}


