package yıilin.hangi.gunu;
import java.util.Scanner;
public class YıilinHangiGunu {
    public static void main(String[] args) {
        Scanner klavye= new Scanner(System.in);
        
        String  HF[] ={"pazartesi","salı","çarşamba","perşembe","cuma","cumartesi","pazar"};
        System.out.println("1 ile 365 arasında bir gün seçiniz");
        int gun=klavye.nextInt();
        int b = gun%7;
        if (b!=0)
        {
            b= b-1;
        }
        
        System.out.println("bugün günlerden:"+HF[b]);
        
        System.out.println("kaç gün sonrasını öğrenmek istersiniz");
        int gun2=klavye.nextInt();
        int T =gun +gun2;
        T =T%7;
        if (T!=0) 
        {
            T--;
        }
        System.out.println(gun2+" gün sonra :"+HF[T]);
    }
}    