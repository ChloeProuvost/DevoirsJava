public class Prouvost_Chloe_test_ville {

	public static void main(String[] args) {
		
		
		Ville ville1 = new Ville("Toulouse", true, "France", 300000);
		Ville ville2 = new Ville("Paris", false, "France", 12);
		Ville ville3 = new Ville("Paris", false, "France", 12);
		
		System.out.println("Ville 1 : " + ville1);
		System.out.println("Ville 2 : " + ville2);
		
		ville1.setNb_habitant(1000000);
		System.out.println("Ville 1 : " + ville1);
		
		System.out.println("La ville 1 est une ville universitaire : " + ville1.StatutUniv());
		System.out.println("La ville 2 est une ville universitaire : " + ville2.StatutUniv());
		
		System.out.println("La ville 2 est la même que la ville 3 : " + ville2.equals(ville3));
		System.out.println("La ville 1 est la même que la ville 3 : " + ville1.equals(ville3));
		
		System.out.println("Dans la ville 1 " + ville1.Comparer(ville3) + " que dans la ville 3.");
		System.out.println("Dans la ville 2 " + ville2.Comparer(ville3) + " que dans la ville 3.");
		System.out.println("Dans la ville 3 " + ville3.Comparer(ville1) + " que dans la ville 1.");
		
	}

}

