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
       int i,j=0,k=0;
       int is_first_repetition = 0;
       for (int index_1 = 1; index_1 <= arr_size; index_1++)
       {i=0;
        for (int index_2 = 0; index_2 < arr_size; index_2++)      
           {
               if(index_1==arr[index_2])
                 i++;
           }
        if(i==0)
          System.out.println(index_1);
          
          
       }
   }
}