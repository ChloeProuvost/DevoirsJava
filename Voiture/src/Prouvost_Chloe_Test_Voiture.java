import java.util.*;

public class Prouvost_Chloe_Test_Voiture {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menu;
		Voiture[] tabVoiture = new Voiture[50];
		
		String marqueVoiture;
		int anneeConstruction;
		String color;
		
		int cmpt=0;	
		
		System.out.println("Que voulez vous faire?");
		System.out.println("1 : Créer une voiture");
		System.out.println("2 : Afficher le nombre de voitures créées");
		System.out.println("3 : Comparer les deux premières voitures du tableau");
		System.out.println("4 : Enlever une voiture du tableau");
		System.out.println("5 : Afficher les voitures contenues dans le tableau");
		System.out.println("6 : Quitter");
		System.out.println("Entrez votre choix");
		
		menu = scan.nextInt();
		
		while (menu != 6)
		{
			if (menu == 1)
			{
				cmpt += 1;
				System.out.println("Vous voulez créer une nouvelle voiture. Quelle est la marque?");
				marqueVoiture = scan.next();
				System.out.println("Quelle est l'année de construction?");
				anneeConstruction = scan.nextInt();
				System.out.println("Quelle est la couleur de la voiture?");
				
				for (int i=0; i < 6; i++)
				{
					System.out.println(Couleur.values()[i]);
				}
				color = scan.next();
				
				
				boolean res = false;
				for (int i=0; i < 6; i++)
				{
					res = res || color.equals(String.valueOf(Couleur.values()[i]));
					
				}
				
				if (res)
				{
					//Création de la voiture avec le premier constructeur (avec paramètre)
					//--------------------------------------------------------------------
						
					Voiture voiture1 = new Voiture(marqueVoiture, anneeConstruction, color);
					
					
					//Création de la voiture avec le deuxième constructeur (sans paramètre)
					//---------------------------------------------------------------------
					
					Voiture voiture2 = new Voiture(marqueVoiture, anneeConstruction, color, cmpt);
					
					
					tabVoiture[Voiture.nbObjCréés()-1] = voiture1;
					
					
				} else {
					System.out.println("Vous n'avez pas rentrez la bonne couleur. On refait : ");
				}	
			}
			
			if (menu == 2)
			{
				System.out.println("Vous avez créez " + Voiture.nbObjCréés() + " voiture(s)");
			}
			
			if (menu == 3)
			{
				System.out.println("La " + tabVoiture[0].GetMarque() + tabVoiture[0].Comparer(tabVoiture[1]) + 
						"la "+ tabVoiture[1].GetMarque());
			}
			
			if (menu == 4)
			{
				System.out.println("Quelle voiture voulez vous supprimer?");
				int sup;
				for (int i=0; i < Voiture.nbObjCréés(); i++)
				{
					System.out.println((i+1)+ " : " + tabVoiture[i].GetMarque());
				}
				sup = scan.nextInt();
				tabVoiture[sup-1]=null;
				for (int i=sup-1; i < Voiture.nbObjCréés(); i++)
				{
					tabVoiture[i]=tabVoiture[i+1];
				}
				Voiture.supObj();
				
			}
			
			if (menu == 5)
			{
				for (int i=0; i < Voiture.nbObjCréés(); i++)
				{
					System.out.println((i+1) + " : " + tabVoiture[i]);
				}
			}
			
			if (menu > 6)
			{
				System.out.println("Nous ne pouvons pas traiter votre demande. On refait : ");
			}
			
			System.out.println();
			System.out.println("Que voulez vous faire?");
			System.out.println("1 : Créer une voiture");
			System.out.println("2 : Afficher le nombre de voitures créées");
			System.out.println("3 : Comparer les deux premieres voitures du tableau");
			System.out.println("4 : Enlever une voiture du tableau");
			System.out.println("5 : Afficher les voitures contenues dans le tableau");
			System.out.println("6 : Quitter");
			System.out.println("Entrez votre choix");
			
			menu = scan.nextInt();
			
		}
		

	}

}
