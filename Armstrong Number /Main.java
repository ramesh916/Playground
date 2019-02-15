import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner in = new Scanner(System.in);
      int a= in.nextInt();
      int p=a;
      int i=0,j=0,k=0;
      while(a>0)
      {
        k=a%10;
        j=k*k*k;
        i=i+j;
        a=a/10;
      }
      if(i==p)
        System.out.println("Armstrong Number");
      else
         System.out.println("Not a Armstrong Number");
	}
}