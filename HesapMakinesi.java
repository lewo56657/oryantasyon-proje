package hesap.makinesi;
import java.util.Scanner;
public class HesapMakinesi {
 int sayi1;
 int sayi2;
    
     private HesapMakinesi(int sayi1, int sayi2)
  {
 this.sayi1 = sayi1;
 this.sayi2= sayi2;  
  }
     public int toplam()
  {
 int toplam = sayi1 + sayi2;
 return toplam;
  }
     public int carpma()
  {
    int sonuc = sayi1*sayi2;
    return sonuc;  
  }
     public int cıkarma()
  {
    int fark = sayi1-sayi2;
    return fark;
  }

     public double bolme()
  {
    double bolum = sayi1/sayi2;
    return bolum;
  }
    public static void main(String[] args) {
     Scanner klavye = new Scanner(System.in);
    
        System.out.println("1.sayıyı giriniz");
        int say1 = klavye.nextInt();
        System.out.println("2. sayıyı giriniz");
        int say2= klavye.nextInt();
        System.out.println("işlem seçiniz");
        String islem = klavye.next();
         HesapMakinesi makine1= new HesapMakinesi(say1,say2);
        if (islem.equals("+"))
        {
            System.out.println(makine1.toplam());   
        }
        else if(islem.equals("-"))
        {
            System.out.println(makine1.cıkarma());
        }
        else if(islem.equals("x")||islem.equals("*"))
        {
            System.out.println(makine1.carpma());  
        }
       else if(islem.equals("/"))
        {
            System.out.printf("%f.2",makine1.bolme());   
        }else
        {
            System.out.println("idonun taaa... Adam ol");
        }
        
    }
    
}
