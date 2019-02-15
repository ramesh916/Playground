import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int a= in.nextInt();
      int i,j=0;
      for(i=1;i<=a;i++)
      {
       j=j+i;
      }
      System.out.println(j);
	}
}