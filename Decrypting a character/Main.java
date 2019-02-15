import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
   int key=in.nextInt();
    ch=(char)(ch-key);
    if(ch<97&&ch>=96)
      ch=(char)(ch+26);
    System.out.print(ch);
  }
}

