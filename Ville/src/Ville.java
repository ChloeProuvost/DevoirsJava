//************************************************
//* Classe Ville 		Auteur : Chloe PROUVOST
//************************************************
public class Ville implements Comparable <Ville> {
	
			//Initialisation des variables d'instance
			
	private String nom;
	private boolean typeUniv;
	private String pays;
	private int nb_habitants; 
	
	public Ville (String unNom, boolean uneUniversitee, String unPays, int nbHabitant )
	{
		nom = unNom;
		typeUniv = uneUniversitee;
		pays = unPays;
		nb_habitants = nbHabitant;
	}
	
			//Accesseur au nom de la ville
	
	public String nomVille()
	{
		return nom;
	}
	
	
			//Mutateur pour le nombre d'habitants
	
	public void setNb_habitant(int nv_nbHabitant)
	{
		nb_habitants = nv_nbHabitant;
	}

			//Accesseur au statut universitaire
	
	public boolean StatutUniv()
	{
		return typeUniv;
	}
	
			//Redefinition de la methode compareTo
	
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
		} 
		return null;
	}
	
			//Redefinition de la methode equals
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ville other = (Ville) obj;
		if (nb_habitants != other.nb_habitants)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (pays == null) {
			if (other.pays != null)
				return false;
		} else if (!pays.equals(other.pays))
			return false;
		if (typeUniv != other.typeUniv)
			return false;
		return true;
	}

			//Methode toString
	
	public String toString()
	{
		String desc = "le nom de la ville est " + nom + ", il y a " + nb_habitants + " habitants et elle se trouve en " 
							+ pays;
		if (this.StatutUniv()){
			return desc + ". C'est une ville universitaire";}
		else {
			return desc + ". Ce n'est pas une ville universitaire";
		}
	}
}