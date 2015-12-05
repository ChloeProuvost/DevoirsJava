/********************************************************
 *  Devoir : 4			Auteur : PROUVOST Chloé         *
 * 	A rendre le 7/12/15                                 *
 *  Programme de test                                   *
 ********************************************************/

import java.util.*;

public class Prouvost_Chloe_Test_Voiture {

	public static void main(String[] args) {
		
		// Importation du scanner
			Scanner scan = new Scanner(System.in);
		
		//Declaration des variables
			int menu;
			ArrayList<Voiture> tabVoiture1 = new ArrayList<Voiture>();
			String marqueVoiture;
			int anneeConstruction;
			String color;

		// Affichage du menu. Tant que l'utilisateur ne veut pas quitter on lui demande ce qu'il veut faire.	
			do 
			{
				System.out.println("Que voulez vous faire?");
				System.out.println("1 : Créer une voiture");
				System.out.println("2 : Afficher le nombre de voitures créées");
				System.out.println("3 : Comparer les deux premières voitures du tableau");
				System.out.println("4 : Enlever une voiture du tableau");
				System.out.println("5 : Afficher les voitures contenues dans le tableau");
				System.out.println("6 : Quitter");
				System.out.println("Entrez votre choix");
				
				menu = scan.nextInt();
		
				// Creation d'une voiture
					if (menu == 1)
					{
						System.out.println("Vous voulez créer une nouvelle voiture. Quelle est la marque?");
						marqueVoiture = scan.next();
						System.out.println("Quelle est l'année de construction?");
						anneeConstruction = scan.nextInt();
						boolean res;
						
						// On boucle jusqu'a ce que la couleur corresponde a une de l'enumeration.
							do
							{
								res = false;
								
								System.out.println("Quelle est la couleur de la voiture?");
							
								for (Couleur c : Couleur.values())
								{
									System.out.println(c);
								}
								
								color = scan.next();
								
								for (int i = 0; i < Couleur.values().length; i++)
								{
									res = res || color.equals(String.valueOf(Couleur.values()[i]));
								}
							} while (!res);
						
						// Creation d'un objet Voiture
							Voiture voiture = new Voiture(marqueVoiture, anneeConstruction, color);
		
						// Insertion de la voiture dans le ArrayList tabVoiture1
							tabVoiture1.add(voiture);
									
					}
				
				// Affiche le nombre de voiture creees
					if (menu == 2)
					{
						System.out.println("Vous avez créez " + Voiture.nbObjCréés() + " voiture(s)");
					}
				
				// Compare les deux premières voitures du tableau
					if (menu == 3)
					{
						if(Voiture.nbObjCréés() < 2)
						{
							System.out.println("Il vous faut créer 2 voitures pour pouvoir les comparer");
						} else {
		
							System.out.println("La " + tabVoiture1.get(0).GetMarque() + tabVoiture1.get(0).Comparer(tabVoiture1.get(1)) + 
								"la "+ tabVoiture1.get(1).GetMarque());
						}
					}
				
				// Enleve une voiture du tableau a l'indice entré par l'utilisateur
					if (menu == 4)
					{
						int sup;
						do
						{
							System.out.println("Quelle voiture voulez vous supprimer?");
							
							for (int i=0; i < Voiture.nbObjCréés(); i++)
							{
								System.out.println((i+1)+ " : " + tabVoiture1.get(i).GetMarque());
							}
							sup = scan.nextInt();
						}
						while (sup > Voiture.nbObjCréés());
							
						tabVoiture1.remove(tabVoiture1.indexOf(tabVoiture1.get(sup-1)));
						Voiture.supObj();
						
					}
				
				// Affiche les voitures contenues dans le tableau
					if (menu == 5)
					{
						for (int i=0; i < Voiture.nbObjCréés(); i++)
						{
							System.out.println((i+1) + " : " + tabVoiture1.get(i));
						}
					}
				
				// Si l'utilisateur ne rentre pas un des numeros du menu, on redemande ce qu'il veut faire
					if (menu > 6)
					{
						System.out.println("Nous ne pouvons pas traiter votre demande. On refait : ");
					}
					System.out.println();
			} while (menu != 6);
		
	}

}
