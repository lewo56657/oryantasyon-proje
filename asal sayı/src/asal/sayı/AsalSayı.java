 package asal.sayı;
import java .util.Scanner;
public class AsalSayı{
   public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = scan.nextInt();
        
        int i= 2;
        int sayac= 0;
        while (i<sayi)
        { 
            if(sayi% i==0)
            { 
                sayac++;
            }
                i++;   
        }
        if (sayi==31&sayac==0)
        {
            System.out.println("knk banyo time "+"[konudan saptık asal sayıdır]");
        
        } 
        if(sayac==0)
        {
                System.out.println("asal sayıdır");
        } 
        else
        {
                System.out.println("asal sayı değildir");
        }  
    }
}

  
           
            
       
    
    
