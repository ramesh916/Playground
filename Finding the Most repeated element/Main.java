import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       
int n = sc.nextInt();
       int arr[] = new int[n];
       for(int index = 0; index <n; index++)
       {
           arr[index] = sc.nextInt();
       }
     int a[]=new int[10];
     int i,j,l=0,k;
     for(i=0;i<n;i++)
     {k=0;
       for(j=0;j<n;j++)
       {
         if(i==arr[j])
           k++;
       }
      a[l]=k;
      l++;
     }
     for(i=0;i<1;i++)
       for(j=i+1;j<l;j++)
       {
         if(a[i]<a[j])
         {
           k=a[i];
           a[i]=a[j];
           a[j]=k;
         }
       }
     if(a[0]>1)
     System.out.println(a[0]); 
     else
       System.out.println(arr[0]);
     
   }
}