import java.util.Scanner;

public class Application{
public static void main(String []args){
Scanner integer=new Scanner(System.in);
    int n;
   System.out.println("Enter a number: ");
   n=integer.nextInt();
   System.out.println("The encrypted number is: "+Encrypter.encrypt(n));
   System.out.println("the decrypted number is: "+Decrypter.decrypt(Encrypter.encrypt(n)));
}








}              


