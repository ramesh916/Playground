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
       int is =arr_size-1;
       int r = 0;
       for (int index_1 = 0; index_1 < arr_size/2; index_1++)
       {      
           if(arr[index_1]==arr[is])
           {
               is--;
               r++;
           }
       }
     if(r==arr_size/2)
       System.out.println("Yes");
     else
       System.out.println("No");
   }
}