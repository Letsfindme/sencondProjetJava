
public class showhello {

	public static String w = "world";
	
	public static int addition ( int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static void affichage (String s ) {
		System.out.println("Welcome"+ s);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w1 = "Hello";
		int var1 = 10;
		int var2 = 10;
		int somme;
		somme = addition(var1, var2);
		affichage (w1 + w);
		System.out.println(somme);
		
	}

}
