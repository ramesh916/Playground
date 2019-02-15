import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
   int i=0,j=0,k=0;
    int n= str1.length();
    for(i=n-1;i>=n/2;i--)
    {
      char a= str1.charAt(i);
      char b= str1.charAt(j);
      if(a!=b)
        break;
      else
        k++;
      j++;
    }
    if(k>=n/2)
      System.out.println("Yes");
    else
      System.out.println("No");
  } 
}