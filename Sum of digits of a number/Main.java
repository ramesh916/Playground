import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int a= in.nextInt();
      int c=0,b=0;
      while(a>0)
      {
        c=a%10;
        b=b+c;
        a=a/10;
      }
      System.out.println(b);
	}
}