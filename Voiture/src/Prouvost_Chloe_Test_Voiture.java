import java.util.*;

public class Prouvost_Chloe_Test_Voiture {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menu;
		Voiture[] tabVoiture = new Voiture[50];
		
		String marqueVoiture;
		int anneeConstruction;
		String color;
		
		//int cmpt=0;	
		
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
	
			if (menu == 1)
			{
				//cmpt += 1;
				System.out.println("Vous voulez créer une nouvelle voiture. Quelle est la marque?");
				marqueVoiture = scan.next();
				System.out.println("Quelle est l'année de construction?");
				anneeConstruction = scan.nextInt();
				boolean res;
				
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
				
				Voiture voiture1 = new Voiture(marqueVoiture, anneeConstruction, color);

				tabVoiture[Voiture.nbObjCréés()-1] = voiture1;
						
				
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
				int sup;
				do
				{
					System.out.println("Quelle voiture voulez vous supprimer?");
					
					for (int i=0; i < Voiture.nbObjCréés(); i++)
					{
						System.out.println((i+1)+ " : " + tabVoiture[i].GetMarque());
					}
					sup = scan.nextInt();
				}
				while (sup > Voiture.nbObjCréés());
				
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
		} while (menu != 6);
		
	}

}
