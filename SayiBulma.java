
package sayi.bulma;
import java.util.Scanner;
public class SayiBulma {

   
    public static void main(String[] args) {
      Scanner klavye=new Scanner(System.in);    
       int sayi1=(int)(Math.random()*100);
        System.out.println("bir sayı giriniz");
                    int sayi2=klavye.nextInt();

        while(sayi1!=sayi2)
        {
            
            
        if(sayi1>sayi1)
        {
            System.out.println("sayı çok düşük");
            break;
                    
         }
        
        else
        
        {
            System.out.println("sayi çok yüksek");
            break;
        }
        }
        if(sayi1==sayi2)
        {
            System.out.println("buldunuz");
        }   
}
    }