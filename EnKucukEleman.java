
package en.kucuk.eleman;
import java.util.Scanner;

public class EnKucukEleman {

    
    public static void main(String[] args) {
       int sayilar[]={5,8,6,4,7,3,1};
     int i=0;
     int j=i+1;
     int EK=sayilar[0];
     int gecici;
       for(i=0;i<sayilar.length;j++)
       {
    
   
     for( i=j+1;i<sayilar.length+1;i++)
     {
     if(EK>sayilar[i])
     {
      gecici=EK;
      EK=sayilar[i];
      sayilar[i]=gecici;
     }
     }
          int s[]=new int[8];
       int h=0;
       for(h=0;h<s.length;h++)
       {
      sayilar[i]=s[h];
        System.out.println(s[h]);
}

      
     }
        
     } 
       
}    
       
       
    
    
 
    