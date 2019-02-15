import java.util.Scanner;
class Main{
public static void main(String args[]){
    Scanner in = new Scanner(System.in);
  int a=in.nextInt();
  int arr[]= new int[a];
      for(int i=0;i<a;i++){
    arr[i] = in.nextInt();}
  int b= in.nextInt();
  int c= in.nextInt();
  int j=0,k=0,m=-1;
    for(int i =0; i < a; i++)
    {
     j++;
      if(b==arr[i])
        break;
    }
 for(int i =0; i < a; i++)
    {
     k++;
      if(c==arr[i])
        break;
   }
    if(j<a)
   System.out.println(--j);
  else
    System.out.println(m);
   if(k<a)
   System.out.println(--k);
  else
    System.out.println(m);
}
}