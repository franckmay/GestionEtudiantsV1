/**
 * 
 */

/**
 * Classe qui traite les savoir faire  dont l'utilisateur fait appel
 * @author MICHEL
 *
 */
public class Traitement {

	/**
	 * 
	 */
	public Traitement() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * afficher un message de bienvenue
	 */
	public void pageAccueil(){ 
		
		System.out.println ("Bienvenue dans l application de gestion des etudiants");
		System.out.println ("veuillez saisir les donn�es de l etudiant");
		
	}
	
	/**
	 * M�thode qui g�n�re le matricule 
	 * le patient donn� en param�tre
	 * @param etudiant
	 * @return etudiant.getMatricule()
	 */
	public String genererMatricule(Etudiant etudiant){
				
		if(etudiant.getNom().length()<2){
			etudiant.setMatricule(etudiant.getNumCoupon()+etudiant.getNom());			
		}else{
			etudiant.setMatricule(etudiant.getNumCoupon()+etudiant.getNom().substring(0,2));
		}
		return etudiant.getMatricule();
	}
	
	/**
	 * Methode qui retourne le nom du service
	 * donn� en param�tre
	 * @param servicesSc
	 * @return servicesSc.getNomService()
	 * 
	 */
	
	
	
	public String serviceScolaire(ServiceScolarite servicesSc) {
			switch(servicesSc.getNumPoste()){
				case 1:
					servicesSc.setNomScolarite("Scolarit� A   poste1");				
				break;
				case 2:
					servicesSc.setNomScolarite("Scolarit� A   poste2");	
							
				break;
				case 3:
					servicesSc.setNomScolarite("Scolarit� B   poste1");
									
				break;
				case 4:
					servicesSc.setNomScolarite("Scolarit� B   poste2");
									
				break;
				default:
					servicesSc.setNomScolarite("INEXISTANTE");										
			} 		
		return servicesSc.getNomScolarite();
	}
	

	public void afficheEtudiant(Etudiant p ){ 
		String[] etudiant={p.getNumCoupon()+"","matricule ----  "+p.getMatricule(),"prenom  ----  "+p.getPrenom(),
				"nom   ----  "+p.getNom(),"faculte  ----  "+p.getFaculte()+"","filiere  ----  "+p.getFiliere()+"",
				"niveau ----  "+p.getNiveau()+"","age   ----  "+p.getAge()+"","telephone ----  "+p.getTelephone()+"",
				"adresse ----  "+p.getAdresse(),"email ----  "+p.getEmail()};
		
		System.out.println("-----------------------------------");
		
		System.out.println("--           FICHE ETUDIANT        --");
		
		System.out.println("-----------------------------------");
		for(int i=0; i<etudiant.length; i++){
			System.out.println("--      "+etudiant[i]);
			System.out.println("-----------------------------------");
		}
	}
	
	

}
