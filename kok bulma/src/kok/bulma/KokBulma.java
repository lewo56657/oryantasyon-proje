package kok.bulma;
import java.util.Scanner;
public class KokBulma {
 public static void main(String[] args) {
       Scanner klavye= new Scanner(System.in);
       System.out.println("x^2nin katsayısını giriniz");
      double A = klavye.nextDouble();
       System.out.println("x katsayısı giriniz");
       double B= klavye.nextDouble();
       System.out.println("sabit sayı giriniz");
  double C= klavye.nextDouble();
      double D;
      D= (B*B)-(4*A*C);
       System.out.println(A+"X^2"+"+"+B+"X"+"+"+C);
       if(  D>0)
       {
          
     System.out.println((-B-Math.sqrt(D))/(2*A));
     System.out.println((-B+Math.sqrt(D))/(2*A));
     
      }
       else if(D==0)
       { 
      System.out.println(-B/2*A);
      }
       
    else
       {
           
     System.out.println("Gerçek kökö bulunmaz");
      }
}
}