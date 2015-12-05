/********************************************************
 *  Devoir : 4			Auteur : PROUVOST Chloé         *
 * 	A rendre le 7/12/15                                 *
 *  Classe Voiture                                      *
 ********************************************************/

enum Couleur {Bleue, Rouge, Verte, Noire, Grise, Violette}


public class Voiture implements Comparable <Voiture>
{
	/*
	 * Declaration des variables d'instances
	 */
	
	private String Marque;
	private int Annee;
	private Couleur couleur_voiture;
	private static int compteur=0;

	
	/*
	 * Constructeurs qui implementent la variable statique;
	 */
	
	public Voiture (String Mrq, int annee, String color)
	{
		this();
		Marque = Mrq;
		Annee = annee;
		couleur_voiture = Couleur.valueOf(color);
		
	}
	
	public Voiture()
	{
		super();
		compteur++;
	}
	
	
	/*
	 * Methode pour acceder a la marque de la voiture 
	 */
	
	public String GetMarque()
	{
		return Marque;
	}
	
	
	/*
	 * Methode statique qui retourne le nombre d'objet créés
	 */
	
	public static int nbObjCréés()
	{
		return compteur;
	}
	
	
	/*
	 * Methode statique qui décrémente le compteur lorsque l'on supprime un objet
	 */
	
	public static int supObj()
	{
		compteur -= 1;
		return compteur;
	}
	
	
	/*
	 * Methode compareTo
	 */
	
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
	
	
	/*
	 * Methode toString
	 */
	
	public String toString()
	{
		return "La voiture est une " + Marque + ", elle a été construite en " + Annee + " et elle est " + 
					couleur_voiture;
	}
}

