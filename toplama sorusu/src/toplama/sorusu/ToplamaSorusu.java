package toplama.sorusu;
import java.util.Scanner;
public class ToplamaSorusu {
 public static void main(String[] args) {
     Scanner klavye=new Scanner(System.in);
     int Rsayi1= (int)(Math.random()*10);
     int Rsayi2= (int)(Math.random()*10);
        System.out.println(Rsayi1+ "+" +Rsayi2 +"= kaçtır ?" );
        int Gsayi=klavye.nextInt();
        int toplam= Rsayi1+ Rsayi2;
        while(toplam!=Gsayi)
       {
            System.out.println("yanlış cevap"+"  tekrar deneyiniz");
         Gsayi=klavye.nextInt();
       }
        System.out.println("buldunuz");
}
    }