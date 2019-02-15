import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int i,j=1;
     for(i=1;i<=n2;i++)
     {
       j=j*n1;
     }
    System.out.println(j);
   }
}