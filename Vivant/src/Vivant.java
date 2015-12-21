enum milieuDeVie {eau, terre, eauTerre}

abstract public class Vivant implements Comparable<Vivant>
{
	protected String Nom;
	protected milieuDeVie TypeMilieu;
	protected int complexite;
		
	public Vivant (String name, String Milieu, int complex) throws ComplexiteIncorrecte
	{
		if (complex < 1 || complex > 10 )
		{
			throw new ComplexiteIncorrecte();
		} else {
			Nom = name;
			TypeMilieu = milieuDeVie.valueOf(Milieu);
			complexite = complex;
		}
	}
	
	abstract String modeDeplacement();
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vivant other = (Vivant) obj;
		if (Nom == null) {
			if (other.Nom != null)
				return false;
		} else if (!Nom.equals(other.Nom))
			return false;
		return true;
	}

	@Override
	public int compareTo(Vivant o) 
	{
		return this.complexite - o.complexite;
	}
		
	public String toString()
	{
		return "Mon nom est " + this.Nom + " je suis de la famille des "+ this.getClass() + "." +"\n" +
				"Mon milieu de vie est " + this.TypeMilieu + " et ma complexité est " + this.complexite+ ". ";
	}	
}