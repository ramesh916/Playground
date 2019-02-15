import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a[]=new int[n];
      int b=in.nextInt();
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int i,j,k;
      for(i=1;i<=b;i++)
      {k=0;
        for(j=0;j<n;j++)
        {
          if(i==a[j])
            k++;
        }
      System.out.println(i+" "+k);
      }
    }   
}