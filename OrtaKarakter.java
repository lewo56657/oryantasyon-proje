package orta.karakter;
import java.util.Scanner ;
public class OrtaKarakter {
public static String sayilar(String a)
{
   
 if(a.length()%2!=1)
 {
     System.out.println("tek haneli dize giriniz");      
 } 
 else
 {
     System.out.println("dizenin ortanca terimi : "+a.charAt(a.length()/2));     
 }
 return a;
    
}
    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("bir dize giriniz");
        String kullanici= klavye.nextLine(); 
        sayilar(kullanici);
        
    }
    
    
    
}
