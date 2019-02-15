import java.util.Scanner;
class Main{
public static void main(String args[]){
    Scanner in = new Scanner(System.in);
  int a=in.nextInt();
  int arr[]= new int[a];
      for(int i=0;i<a;i++){
    arr[i] = in.nextInt();}
  int j=0,k=0,m=-1;
    for(int i =0; i < a; i++)
    {
      for(j=1;j<a;j++)
      {
      if(arr[i]<arr[j])
        arr[i]=arr[j];
        }
    }
 System.out.println(arr[0]);
    
}
}