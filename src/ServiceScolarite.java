/**
 * 
 */


/**
 * @author MICHEL
 *
 */
public class ServiceScolarite {

	/**
	 * 
	 */
	private int numPoste;
	private String nomScolarite;
	
	
	public ServiceScolarite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ServiceScolarite(int numPoste, String nomScolarite) {
		super();
		this.numPoste = numPoste;
		this.nomScolarite = nomScolarite ;
		
	}


	public int getNumPoste() {
		return numPoste;
	}


	public void setNumPoste(int numPoste) {
		this.numPoste = numPoste;
	}


	public String getNomScolarite() {
		return nomScolarite;
	}


	public void setNomScolarite(String nomScolarite) {
		this.nomScolarite = nomScolarite;
	}
	
	

}
