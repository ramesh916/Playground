import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int index = 0;index < n; index++)
    {
      list[index] = sc.nextInt();  
    }
    int i,j,k;
    for(i=0;i<n/2;i++)
    {
      for(j=i+1;j<n/2;j++)
      {
        if(list[i]>list[j])
        {
          k=list[i];
          list[i]=list[j];
          list[j]=k;
        }
      }
    }
    for(i=0;i<n;i++){
      System.out.print(list[i]);
      if(i!=n-1)
        System.out.print(" ");}
  }
}