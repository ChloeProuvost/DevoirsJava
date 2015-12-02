enum Couleur {Bleue, Rouge, Verte, Noire, Grise, Violette}


public class Voiture implements Comparable <Voiture>
{
	
	private String Marque;
	private int Annee;
	private Couleur couleur_voiture;
	private static int compteur=0;

	
	
	public Voiture (String Mrq, int annee, String color, int cmpt)
	{
		Marque = Mrq;
		Annee = annee;
		couleur_voiture = Couleur.valueOf(color);
		compteur = cmpt;
		
	}
	
	public Voiture (String Mrq, int annee, String color)
	{
		Marque = Mrq;
		Annee = annee;
		couleur_voiture = Couleur.valueOf(color);
		compteur +=1; 
		
	}
	
	public int GetAnnee()
	{
		return Annee;
	}
	
	public String GetMarque()
	{
		return Marque;
	}
	
	public static int nbObjCréés()
	{
		return compteur;
	}
	
	public static int supObj()
	{
		compteur -= 1;
		return compteur;
	}
	
	@Override
	public int compareTo(Voiture o)
	{
		return this.Annee - o.Annee;
	}
	
	public String Comparer(Voiture v){
		if (this.compareTo(v) == 0){
			return " est de la même année que " ;
		}
		if (this.compareTo(v) < 0){
			return " est moins récente que ";
		}
		if (this.compareTo(v) > 0){
			return " est plus récente que ";
		} 
		return null;
	}
	
	public String toString()
	{
		return "La voiture est une " + Marque + ", elle a été construite en " + Annee + " et elle est " + 
					couleur_voiture;
	}
	
		

	
	
	
	
}

