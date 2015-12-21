import java.util.ArrayList;
import java.util.Scanner;




public class Prouvost_Chloe_test_vivant {

	private static ArrayList<Vivant> tabVivant = new ArrayList<Vivant>();
	
	public static void main(String[] args) {
		
		int menu;
		Scanner scan = new Scanner(System.in);
		do
		{
				//Affichage du menu
			System.out.println("Que voulez vous faire?");
			System.out.println("0 : Remplir le tableau de Vivants grace aux Vivants pré-défini");
			System.out.println("1 : Créer un humain");
			System.out.println("2 : Créer un animal");
			System.out.println("3 : Créer une plante");
			System.out.println("4 : Afficher le tableau de Vivants");
			System.out.println("5 : Trie le tableau");
			System.out.println("6 : Rechercher un nom dans le tableau");
			System.out.println("7 : Quitter");
			System.out.println("Entrez votre choix");
			 
			menu = scan.nextInt();
			
				//Création de vivants pré-définis
			if(menu==0)
			{
				CreerVivantsPreDef();
			}
			
				//Création d'un humain
			if (menu == 1)
			{
				String nom;
				String milieu;
				int complex;
				int numero;
				
				System.out.println("Quel est le nom de votre humain?");
				nom = scan.next();
				
				System.out.println("Quel est son milieu de vie? eau, terre, eauTerre?");
				milieu = scan.next();
				
				System.out.println("Quel est sa complexité?");
				complex = scan.nextInt();
				
				System.out.println("Quel est son numéro?");
				numero = scan.nextInt();
				
				creerHumain(nom, milieu, complex, numero);
				System.out.println();
			}
	
				//Création d'une animal
			if (menu == 2)
			{
				String nom;
				String milieu;
				int complex;
				String truefalse;
				boolean domest;
				boolean mam;
				
				System.out.println("Quel est le nom de votre animal?");
				nom = scan.next();
				
				System.out.println("Quel est son milieu de vie? eau, terre, eauTerre?");
				milieu = scan.next();
				
				System.out.println("Quel est sa complexité?");
				complex = scan.nextInt();
				
				System.out.println("Est t'il un animal domestique? oui ou non");
				truefalse = scan.next();
				
				if (truefalse.equals("oui"))
				{
					domest=true;
				} else
				{
					domest= false;
				}
				
				System.out.println("Est t'il un mamifère? oui ou non");
				truefalse = scan.next();
				
				if (truefalse.equals("oui"))
				{
					mam=true;
				} else
				{
					mam= false;
				}
				
				creerAnimal(nom, milieu, complex, domest, mam);	
				System.out.println();
			}
			
				//Création d'une plante
			if (menu == 3)
			{
				String nom;
				String milieu;
				int complex;
				boolean comest;
				String truefalse;
				
				System.out.println("Quel est le nom de votre animal?");
				nom = scan.next();
				
				System.out.println("Quel est son milieu de vie? eau, terre, eauTerre?");
				milieu = scan.next();
				
				System.out.println("Quel est sa complexité?");
				complex = scan.nextInt();
				
				System.out.println("Est t'elle comestible?");
				truefalse = scan.next();
				
				if (truefalse.equals("oui"))
				{
					comest=true;
				} else
				{
					comest= false;
				}
				
				creerPlante(nom, milieu, complex, comest);
				System.out.println();
				
			}
			
				//Affichage du tableau
			if (menu == 4)
			{
				System.out.println("Affichage des élements du tableau :");
				System.out.println();
					
				for (int i=0; i < tabVivant.size(); i++)
				{
					System.out.println((i+1) + " : " +tabVivant.get(i));
				}
				
				System.out.println();
			}
			
				//Tri du tableau + affichage
			if (menu == 5)
			{
				System.out.println("Tableau Trié");
				int min;
			    Vivant temp;

			    for (int index = 0; index < tabVivant.size()-1; index++)
			    {
			       min = index;
			       for (int j = index+1; j < tabVivant.size(); j++)
			       {
			          if (tabVivant.get(j).compareTo(tabVivant.get(min)) < 0)
			          {
			             min = j;
			          }
			       }
			       temp = tabVivant.get(min);
			       tabVivant.set(min, tabVivant.get(index));
			       tabVivant.set(index, temp);
			       
			    }
			    
			    for (int i=0; i < tabVivant.size(); i++)
				{
					System.out.println((i+1) + " : " +tabVivant.get(i));
				}
				
				System.out.println();
				
			}
			
				//Recherche dans le tableau
			if (menu == 6)
			{
				System.out.println("Quel nom voulez vous chercher dans le tableau?");
				String nom;
				nom = scan.next();
			
				int index = 0;
			    boolean found = false;
			    
			    while (!found && index < tabVivant.size())
			    {
			    	if (tabVivant.get(index).Nom.equals(nom))
			    	{
			    		found = true;
			    	}
			    	else
			    	{
			    		index++;
			    	}
			    }

			    if (found)
			   	{
			   		System.out.println("L'element a été trouvé. Il est à la " + (index+1) + "ième place du tableau");
			   	}
			   	else
		    	{
		    		System.out.println("L'élement recherché n'est pas le tableau");
		    	}
			    System.out.println();
			}
			
		} while (menu<7);
		
		System.out.println();
	}

		//Méthode statique pour créer des vivants pré-définis
	static void CreerVivantsPreDef()
	{
		Vivant humain = null; 
		Vivant humain1 = null;
		Vivant animal = null;
		Vivant plante = null;
		try
		{
			humain = new Humain("Chloe", "terre", 4, 34);	
		} catch (ComplexiteIncorrecte c) {}
		finally
		{
			if (humain != null)
			{	
				tabVivant.add(humain); 
			}
		}
		
		try
		{
			humain1 = new Humain("Nico", "eau", 9, 123);
		} catch (ComplexiteIncorrecte c) {}
		finally
		{
			if (humain1 != null)
			{
				tabVivant.add(humain1);
			}
		}
		
		try
		{
			animal = new Animal("Bouboule", "terre", 8, true, true);
		} catch (ComplexiteIncorrecte c) {}
		finally
		{
			if (animal != null)
			{
				tabVivant.add(animal);
			}
		}
		
		try
		{
			plante = new Plante("Jonquille", "eauTerre", 5, false);
		} catch (ComplexiteIncorrecte c) {}
		finally
		{
			if(plante != null)
			{
				tabVivant.add(plante);
			}
		}

	}
	
		//Méthode statique pour créer un humain	
	static void creerHumain(String nom,String  milieu, int complexite, int numero)
	{
		Vivant humain = null;
		try
		{
			
			humain = new Humain(nom, milieu, complexite, numero);
		
		} catch (ComplexiteIncorrecte c) { System.out.println("Probleme : " + c.getMessage());}
		finally
		{
			if(humain != null)
			{
				tabVivant.add(humain);
			}
		}
		
	}
	
		//Méthode statique pour créer un animal
	static void creerAnimal(String nom, String milieu, int complexite, boolean domest, boolean mam)
	{
		Vivant animal=null;
		try
		{
			animal = new Animal(nom, milieu, complexite, domest, mam);
			

		} catch (ComplexiteIncorrecte c) { System.out.println("Probleme : " + c.getMessage());}
		finally
		{
			if(animal != null)
			{
				tabVivant.add(animal);
			}
		}
	}

		//Méthode statique pour créer une plante
	static void creerPlante(String nom, String milieu, int complexite, boolean comes)
	{
		Vivant plante=null;
		try
		{
			plante = new Plante(nom, milieu, complexite, comes);
			

		} catch (ComplexiteIncorrecte c) { System.out.println("Probleme : " + c.getMessage());}
		finally
		{
			if(plante != null)
			{
				tabVivant.add(plante);
			}
		}
		
	}
}

