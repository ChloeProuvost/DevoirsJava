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

class Humain extends Vivant
{
	private int numero;
	
	public Humain(String name, String Milieu, int complex, int num) throws ComplexiteIncorrecte
	{
			super(name, Milieu, complex);
			this.numero = num;
	}
	
	public int GetNum()
	{
		return this.numero;
	}
	
	public String modeDeplacement()
	{
		return "L'humain est un bipède et il pourrait nager.";
	}
	
	public String toString()
	{
		String result = super.toString();
		result += "Mon numéro est " + this.numero + ". " + this.modeDeplacement(); 
		return result;
	}
}

class Animal extends Vivant
{
	private boolean domestique;
	private boolean mammifère;
	
	public Animal(String name, String Milieu, int complex, boolean domest, boolean mam) throws ComplexiteIncorrecte
	{
		super(name, Milieu, complex);
		this.domestique = domest;
		this.mammifère = mam;
	}
	

	public String modeDeplacement()
	{
		return "Un animal peut marcher et/ou nager et/ou voler.";
	}
	
	public String toString()
	{
		String result = super.toString();
		
		if (this.domestique)
		{
			result += " Je suis un animal dommestique";
		} else {
			result += " Je ne suis pas un animal domestique";
		}
		if (this.mammifère)
		{
			result += " et je suis un mammifère.";
		} else {
			result += " et je ne suis pas un mammifère.";
		}
		
		return result + " "+ this.modeDeplacement();
	}	
}

class Plante extends Vivant
{
	private boolean comestible;
	
	public Plante(String name, String Milieu, int complex, boolean comes) throws ComplexiteIncorrecte
	{
		super(name, Milieu, complex);
		this.comestible = comes;
	}
	
	public String modeDeplacement()
	{
		return "Une plante ne se déplace pas.";
	}
	
	public String toString()
	{
		String result = super.toString();
		if (this.comestible)
		{
			result += " Je suis une plante comestible.";
		} else {
			result += " Je ne suis pas une plante comestible.";
		}
		
		return result+ " "+ this.modeDeplacement();
	}	
}
