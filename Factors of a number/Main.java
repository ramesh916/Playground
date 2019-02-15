import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a= in.nextInt();
      int i;
      for(i=1;i<=a;i++)
      {
      if(a%i==0)
        System.out.println(i);
      }
	}
}