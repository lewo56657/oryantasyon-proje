package basamak.sever.sayi;
import java.util.Scanner;
public class BasamakSeverSayi {
    public static void main(String[] args) {
        Scanner levo= new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi= levo.nextInt();
        int basamaks=0;
        int sayi2=0;
        while(sayi>0)
        {
           basamaks+=1;
           sayi2=sayi2*10;
           sayi2= sayi2 +sayi%10;
           
           sayi/=10;
        }
        System.out.println(sayi2);
        System.out.println(basamaks);
        if(sayi2%basamaks==0)
        {
            System.out.println("basamak sever sayıdır");
        }
        else
        {
            System.out.println("basamak sever değildir");
        }   
    }
}

