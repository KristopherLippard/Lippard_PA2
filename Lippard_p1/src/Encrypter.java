public class Encrypter {
	public static int encrypt(int n) {

		 
		   int d1 = n / 1000;
		   int d2 = (n % 1000) / 100;
		   int d3 = (n % 100) / 10;
		   int d4 = n % 10;
		   
		   d1 = (d1 + 7) % 10;
		   d2 = (d2 + 7) % 10;
		   d3 = (d3 + 7) % 10;
		   d4 = (d4 + 7) % 10;
		   return (d3 * 1000 + d4 * 100 + d1 * 10 + d2); 
	}
}