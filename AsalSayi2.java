 
package asal.sayi.pkg2;
import java.util.Scanner;

public class AsalSayi2 {

   
    public static void main(String[] args) {
     Scanner levo= new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi= levo.nextInt();
        int i=2;
        int sayac=0;
        while(sayi>i)
        {
             if(sayi%i==0)
             {
               sayac++;
             }
              
              
              i= i+1;
               
             
        }
        if (sayac==0)
        {
        System.out.println("asal sayıdır");
        }
        
        else
        {
        System.out.println("asal sayı değildir");
         }       
}
    }