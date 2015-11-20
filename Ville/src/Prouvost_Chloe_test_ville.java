import java.util.*;

public class Prouvost_Chloe_test_ville {

	public static void main(String[] args) {
		
		List<Ville> villes;
		villes = new ArrayList<Ville>();
		Scanner scan = new Scanner (System.in);
		int menu;
		String Nom = new String();
		boolean Univ;
		String Pays = new String();
		int Hab;
		
		System.out.println("Que voulez vous faire?");
		System.out.println("1 : Créer une ville");
		System.out.println("2 : Accéder aux informations d'une ville");
		System.out.println("3 : Comparer la population entre deux villes");
		System.out.println("4 : Accéder au statut universitaire d'une ville");
		System.out.println("5 : Changer le nombre d'habitant d'une ville");
		System.out.println("6 : Regarder si deux villes sont les mêmes");
		System.out.println("7 : Quitter");
		System.out.println("Entrez votre choix");
		
		menu = scan.nextInt();
		
		while (menu < 7)
		{
		
			if (menu == 1)
			{
				System.out.println("Vous voulez créer une nouvelle ville. Rentrez le nom de votre ville : ");
				Nom = scan.next();
				
				System.out.println(Nom + " est-elle universitaire? Rentrez oui ou non.");
				String typeU;
				typeU = scan.next();
				if (typeU.equals("oui"))
				{
					Univ = true;
				} else {
					Univ = false;
				}
				
				System.out.println("Dans quel pays est votre ville?");
				Pays = scan.next();
				
				System.out.println("Combien y'a t'il d'habitants?");
				Hab = scan.nextInt();
				
				Ville ville = new Ville(Nom,Univ,Pays,Hab);
				System.out.println(ville);
				villes.add(ville);	
			}
			
			if (menu == 2)
			{
				if(villes.size() == 0)
				{
					System.out.println("Il faut créer une ville pour pouvoir accéder à ses informations");
				} else {
					System.out.println("À quelle ville souhaitez vous accéder pour avoir les informations?");
					int v;
					
					for (int i=0; i < villes.size(); i++)
					{
						System.out.println(i+1 + ": " + villes.get(i).nomVille());
					}
					
					v = scan.nextInt();
					System.out.println(villes.get(v-1));
				}
			}
				
			if (menu == 3)
			{
				if(villes.size() == 0 || villes.size() == 1)
				{
					System.out.println("Il vous faut créer 2 villes pour les comparer.");
				} else {
					
					System.out.println("Quelles villes voulez vous comparer entre elle?");
					int v1, v2;
					
					for (int i=0; i < villes.size(); i++)
					{
						System.out.println(i+1 + ": " + villes.get(i).nomVille());
					}
					
					v1 = scan.nextInt();
					System.out.println("et?");
					v2 = scan.nextInt();
					
					System.out.println("À " + villes.get(v1-1).nomVille() + " " + 
							villes.get(v1-1).Comparer(villes.get(v2-1)) + " " + "que à " + villes.get(v2-1).nomVille());
				}
			}
			
			
			if (menu == 4)
			{
				if (villes.size() == 0)
				{
					System.out.println("Il faut créer une ville pour pouvoir accéder à un statut universitaire");
				} else {
					System.out.println("Quelle ville voulez vous savoir si elle est universitaire?");
					int v;
					
					for (int i=0; i < villes.size(); i++)
					{
						System.out.println(i+1 + ": " + villes.get(i).nomVille());
					}
					
					v = scan.nextInt();
					if (villes.get(v-1).StatutUniv())
					{
						System.out.println(villes.get(v-1).nomVille() + " est un ville universitaire");
					} else {
						System.out.println(villes.get(v-1).nomVille() + " n'est pas un ville universitaire");
					}
				}
			}
			
			
			if (menu == 5)
			{
				if(villes.size() == 0)
				{
					System.out.println("Il faut créer une ville pour pouvoir changer le nombre d'habitant");
				} else {
					
					System.out.println("À quelle ville faut-il changer le nombre d'habitants?");
					int v;
					
					for (int i=0; i < villes.size(); i++)
					{
						System.out.println(i+1 + ": " + villes.get(i).nomVille());
					}
					
					v = scan.nextInt();
					System.out.println("Entrez le nombre d'habitants : ");
					int hab;
					hab = scan.nextInt();
					villes.get(v-1).setNb_habitant(hab);
					System.out.println("Il y a maintenant " + hab + " habitants à " + villes.get(v-1).nomVille());
				}
			}
			
			if (menu == 6)
			{
				if(villes.size() == 0 || villes.size() == 1)
				{
					System.out.println("Il vous faut créer 2 villes pour vérifier si ce sont les mêmes.");
				} else {
					
					System.out.println("Quelles villes voulez vous comparer entre elle?");
					int v1, v2;
					
					for (int i=0; i < villes.size(); i++)
					{
						System.out.println(i+1 + ": " + villes.get(i).nomVille());
					}
					
					v1 = scan.nextInt();
					System.out.println("et?");
					v2 = scan.nextInt();
					
					if (villes.get(v1-1).equals(villes.get(v2-1)))
					{
						System.out.println("Les villes sont les mêmes");
					} else {
						System.out.println("Les villes sont différentes");
					}		
				}
			}
			
			System.out.println();
			System.out.println("Que voulez vous faire?");
			System.out.println("1 : Créer une ville");
			System.out.println("2 : Accéder aux informations d'une ville");
			System.out.println("3 : Comparer la population entre deux villes");
			System.out.println("4 : Accéder au statut universitaire d'une ville");
			System.out.println("5 : Changer le nombre d'habitant d'une ville");
			System.out.println("6 : Regarder si deux villes sont les mêmes");
			System.out.println("7 : Quitter");
			System.out.println("Entrez votre choix");
			menu = scan.nextInt();
			}
		
		}
	}

