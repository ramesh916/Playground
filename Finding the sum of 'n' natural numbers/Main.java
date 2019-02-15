import java.util.Scanner;
class Main{
  public static void main(String args[]){
  Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int i=0;
    while(n>=1)
    {
    i=i+n;
      n=n-1;
    }
    System.out.print(i);
  }
}