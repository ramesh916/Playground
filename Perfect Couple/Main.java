import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code he
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int i,j,l,m,k;
      for(i=0;i<n;i++)
        a[i]=in.nextInt();
      int b=in.nextInt();
      for(i=0;i<n;i++)
      {
        for(j=i+1;j<n;j++)
        {
          k=a[i]+a[j];
          if(b==k)
            System.out.println(a[i]+", "+a[j]);
        }
      }
        
    }
}