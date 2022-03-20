package ebob;
import java.util.Scanner;
public class Ebob {
    public static void main(String[] args) {
      Scanner klavye=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int S1=klavye.nextInt();
        System.out.println("2. sayıyı giriniz");
        int S2=klavye.nextInt();
        int ebob =1;
        for(int i=1;i<S1;i++)
          {     
        if(S1%i==0 && S2%i==0)
        {
         ebob =i;   
        }
          }
          System.out.println(ebob);
}
    }