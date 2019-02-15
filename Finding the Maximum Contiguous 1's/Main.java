import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       
int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
       int start_idx = 0;

       for(int index = 0 ; index < arr_size; index++)
       {
           if(arr[index]>0)
           {
             start_idx++;
           }
         else
           break;
       }
      System.out.println(start_idx);
   }
}