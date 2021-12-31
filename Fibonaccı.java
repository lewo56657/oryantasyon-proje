
package fibonaccı;
import java.util.Scanner;
public class Fibonaccı {
    public static void main(String[] args ) {
        Scanner Lewo= new Scanner(System.in);
        System.out.println("lütfen dizinin rakam sayısını giriniz");
        int girilensayi= Lewo.nextInt(); 
      int birincisayi=1;
        System.out.println(birincisayi);
        int ikincisayi=1;
        System.out.println(ikincisayi);     
      int yenisayi;
        for (int i=2; i<girilensayi;i=i+1)
        {
             yenisayi=birincisayi+ikincisayi;
             System.out.println(yenisayi);
             birincisayi= ikincisayi;
             ikincisayi=yenisayi;
        }
        
     }
       
}
    

