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