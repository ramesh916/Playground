import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    int n2=0;
    int i,j=1;
     for(i=1;i<=n;i++)
     {
       n2=0;
       for(j=1;j<=i;j++){
       if(i%j==0)
         n2++;
       }
     if(n2==2)
    System.out.println(i);
     }
   }
}