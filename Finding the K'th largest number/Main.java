import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int l=in.nextInt();
      int i,j,k;
      for(i=0;i<n;i++)
      {
        for(j=i+1;j<n;j++)
        {
          if(a[i]<a[j])
          {
            k=a[i];
            a[i]=a[j];
            a[j]=k;
          }
        }
      }
      System.out.println(a[l-1]);
    }   
}