import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int index = 0; index < n; index++)
       {
           arr[index] = sc.nextInt();
       }
       for(int i = 0; i <n ; i++)
       {int k=i;
         for(int j=i+1;j<n;j++)
         {
           if(arr[k]<arr[j])
           {
             System.out.println(arr[i]+","+arr[j]);
           k=j;  
           }
         }
       }
   }  
}