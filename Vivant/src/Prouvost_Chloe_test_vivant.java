import java.util.ArrayList;

public class Prouvost_Chloe_test_vivant {

	public static void main(String[] args) {
		
		ArrayList<Vivant> tabVivant = new ArrayList<Vivant>();
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
			animal = new Animal("Bouboule", "terre", 11, true, true);
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
		
		
			//Affichage du tableau
		System.out.println("Affichage des élements du tableau :");
		System.out.println();
			
		for (int i=0; i < tabVivant.size(); i++)
		{
			System.out.println((i+1) + " : " +tabVivant.get(i));
		}
		
		System.out.println();
		
		
			//Trie le tableau en fonction de la complexité
		int min;
	    Vivant temp;

	    for (int index = 0; index < tabVivant.size()-1; index++)
	    {
	       min = index;
	       for (int scan = index+1; scan < tabVivant.size(); scan++)
	       {
	          if (tabVivant.get(scan).compareTo(tabVivant.get(min)) < 0)
	          {
	             min = scan;
	          }
	       }
	       temp = tabVivant.get(min);
	       tabVivant.set(min, tabVivant.get(index));
	       tabVivant.set(index, temp);
	       
	    }
		
	    
	    System.out.println("Affichage des élements du tableau trié :");
	    System.out.println();
	 		//Affiche le tableau trié
		for (int i=0; i < tabVivant.size(); i++)
		{
			System.out.println((i+1) + " : " +tabVivant.get(i));
			
		}
			
		
		//Recherche dans le tableau
		
		System.out.println();	
	     int index = 0;
	     boolean found = false;
	     
	     while (!found && index < tabVivant.size())
	     {
	        if (tabVivant.get(index).Nom.equals("Bouboule"))
	           found = true;
	        else
	           index++;
	     }

	     if (found)
	     {
	       System.out.println("L'element a été trouvé. Il est à la " + (index+1) + "ième place du tableau");
	     }
	     else
	     {
         System.out.println("L'élement recherché n'est pas le tableau");
         }

		
		
		
		

	}

}
