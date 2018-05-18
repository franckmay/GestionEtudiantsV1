/**
 * 
 */

import java.util.Scanner;
/**
 *  interface entre utilisateur  et le programme
 * @author MICHEL
 *
 */
public class Acceuil {

	/**
	 * 
	 */
	private static Scanner sc;
	
	public Acceuil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Traitement traitement= new Traitement();//Creation de l'objet traitements(via cet objet nous pourrons au besoin faire appel à un savoir faire de la classe Traitement)
		traitement.pageAccueil();
		
		Etudiant etudiant = new Etudiant();
		sc = new Scanner(System.in);
		
		etudiant.setNumCoupon(0000001);
		sc = new Scanner(System.in);
		System.out.print("PRENOM:");
		etudiant.setPrenom(sc.nextLine());
		System.out.print("NOM:");
		etudiant.setNom(sc.next());
		
		System.out.print("Faculte:");
		etudiant.setFaculte(sc.next());
		
		System.out.print("Filiere:");
		etudiant.setFiliere(sc.next());
		
		etudiant.setNiveau(1);		
		
		System.out.print("Age:");
		etudiant.setAge(sc.next());
		
		System.out.print("ADRESSE:");
		etudiant.setAdresse(sc.next());
		
		System.out.print("E-MAIL:");
		etudiant.setEmail(sc.next());	
		
		traitement.genererMatricule(etudiant);
		System.out.println("Le matricule de l'etudiant "+etudiant.getNumCoupon()+" est: "+etudiant.getMatricule()+'\n');
		
		ServiceScolarite servicesSc = new ServiceScolarite();
		servicesSc.setNumPoste(2);
		
		System.out.println(etudiant.getPrenom() +" "+etudiant.getNom()+" est enregistré à la:"+traitement.serviceScolaire(servicesSc)+'\n');

		System.out.println("Année 2018");
		
		traitement.afficheEtudiant(etudiant);
	}

}
