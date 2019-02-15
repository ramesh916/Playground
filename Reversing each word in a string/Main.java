import java.util.Scanner;
class Main
{
public static void main(String args[])
 {
  int i,j,p=0;
  Scanner sc = new Scanner(System.in);
  String str = sc.nextLine();
  for(i=0;i<str.length();i++)
  {
    char ch=str.charAt(i);
    if(ch==' ')
    {
      for(j=i-1;j>=p;j--)
        System.out.print(str.charAt(j));
      p=i+1;
      System.out.print(" ");
    }
  }
  for(i=str.length()-1;i>=p;i--)
    System.out.print(str.charAt(i));
 }
}

