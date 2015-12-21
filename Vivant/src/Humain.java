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
