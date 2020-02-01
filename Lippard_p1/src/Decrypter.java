public class Decrypter{
public static int decrypt ( int n)
{

	 // obtain digits of number
	   int d1 = n / 1000;
	   int d2 = (n % 1000) / 100;
	   int d3 = (n % 100) / 10;
	   int d4 = n % 10;
	   // Replace each digit with the result of substract 7 to the digit and getting
	   // the remainder after dividing the new value by 10.
	   d1 = (d1 + 3) % 10;
	   d2 = (d2 + 3) % 10;
	   d3 = (d3 + 3) % 10;
	   d4 = (d4 + 3) % 10;
	   return (d3 * 1000 + d4 * 100 + d1 * 10 + d2);
}
}