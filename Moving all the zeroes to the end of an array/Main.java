import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int index = 0; index <= (arr_size - 1); index++)
        {
            arr[index] = in.nextInt();
        }
        int i,j=0,k=0;    
    for(int index = 0; index <= (arr_size - 1); index++)
        {
            if(arr[index]>0){
            System.out.print(arr[index]+" ");
            j++;
              }}
      for(i=0;i<arr_size-j;i++)
        System.out.print(k+" ");
        
    }
}