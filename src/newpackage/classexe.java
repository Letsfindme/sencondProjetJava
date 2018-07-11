package newpackage;

public class classexe {
	static String prenom = "Fadi ";
	static String nom = "NOUFAL ";
	static int fst = 74;
	static int scd = 36;
	static int thr = 5;
	static int fth = 10;
	static int sth = 15;
	static int svth = 10;
	static double div1 = 50;
	static double div2 = 3;
	static double div3 = 32;
	static int ef = 8;
	static int epf = 0;

	public static void affichage (String s, String w ) {
		System.out.println("Welcome "+ " \n"+ s + w);
	}

	public static void addition (int a, int b, int c, int d, int e, int f) {
		System.out.println(a+b+c+d+e+f);
	}

	public static void division (double divv, double divv2) {
		System.out.println(divv/divv2);
	}
	public static void division2 (double divv, double divv2) {
		System.out.println(divv + "/"+ divv2 + "=" + divv/divv2);
	}
	public static void modulo1(int mod1, int mod2) {
		int modd = mod1 % mod2;
		System.out.println(mod1 + "%"+ mod2 + "=" + modd);
	}
	public static void eight(int ef, int i) {
		int eightloop = 0 ;
		while (i < 10) {
			i++;
			eightloop= ef*i;
			System.out.println(eightloop);
		}
		
		
	}
	public static void average(double av1, double av2, double av3) {
		double average = av1+av2+av3/3;
		System.out.println(average);
	}
	public static void swapp(int swap1,int swap2) {
		int swap3 = swap1;
		swap1 = swap2;
		swap2 = swap3;
		System.out.println(swap1+ " "+ swap2);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * 
		 */


		affichage (prenom, nom);
		addition(fst, scd, thr, fth, sth, svth);
		division(div1,div2);
		division2(div1,div2);
		modulo1(fst,fth);
		eight(ef, epf);
		average(div1,div2,div3);
		swapp(fst,scd);
	}

}
