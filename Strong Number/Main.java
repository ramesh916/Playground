import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a= in.nextInt();
      int s=a;
      int i,j,k,p=0;
      while(a>0)
      {
        i=a%10;
        k=1;
        for(j=1;j<=i;j++)
        {
          k=k*j;
        }
        p=p+k;
        a=a/10;
      }
      if (p==s)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}