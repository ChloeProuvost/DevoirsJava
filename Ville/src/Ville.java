//************************************************
//* Classe Ville 		Auteur : Chloé PROUVOST
//************************************************
public class Ville implements Comparable <Ville> {
	
			// Initialisation des variables d'instance
	private String nom;
	private boolean typeUniv;
	private String pays;
	private int nb_habitants; 
	
			// Constructeur de la classe Ville
	public Ville (String unNom, boolean uneUniversitee, String unPays, int nbHabitant )
	{
		nom = unNom;
		typeUniv = uneUniversitee;
		pays = unPays;
		nb_habitants = nbHabitant;
	}
	
			// Mutateur pour le nombre d'habitants
	public void setNb_habitant(int nv_nbHabitant)
	{
		nb_habitants = nv_nbHabitant;
	}

			//Accesseur au statut universitaire
	public boolean StatutUniv()
	{
		return typeUniv;
	}
	
			//Redéfinition de la méthode compareTo
	
	@Override public int compareTo(Ville v){
		return this.nb_habitants-v.nb_habitants;	
	}
	
	public String Comparer(Ville v){
		if (this.compareTo(v) == 0){
			return "il y a autant d'habitants" ;
		}
		if (this.compareTo(v) < 0){
			return "il y a moins d'habitants";
		}
		if (this.compareTo(v) > 0){
			return "il y a plus d'habitants";
		} else {
			return "";
		}
	}
	
			//Redéfinition de la méthode equals
	@Override public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		Ville other = (Ville)obj;
		if (nom != other.nom){
			return false;
		}
		if (typeUniv != other.typeUniv){
			return false;
		}
		if (pays != other.pays){
			return false;
		}
		if (nb_habitants != other.nb_habitants){
			return false;
		}
		return true;
		
	}
	
			//Méthode toString
	public String toString()
	{
		if (this.StatutUniv()){
			return "le nom de la ville1 est " + nom + ", il y a " + nb_habitants + " habitants et elle se trouve en : " 
					+ pays + ". C'est une ville universitaire";}
		else {
			return "le nom de la ville1 est " + nom + ", il y a " + nb_habitants + " habitants et elle se trouve en : " 
					+ pays + ". Ce n'est pas une ville universitaire";
		}
	}
	
}