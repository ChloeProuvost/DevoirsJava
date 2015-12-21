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