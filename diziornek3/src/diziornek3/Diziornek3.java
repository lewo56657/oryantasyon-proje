
package diziornek3;


public class Diziornek3 {

   
    public static void main(String[] args) {
    int dizi1[][]={{1,2,3},{4,5,6}};
    int dizi2[][]={{7,8,9},{10,11,12}};
    int dizi3[][]=new int[2][3];
   
    for(int i=0;i<2;i++)
    {
    for(int j=0;j<3;j++)
    {
     dizi3[i][j]=dizi1[i][j]+dizi2[i][j];
      System.out.print(dizi3[i][j]+" ");
        
    }
        System.out.println();
    }
       
}
}