import java.util.Scanner;
class Main
{
 public static void main(String args[]) 
 {
   Scanner in = new Scanner(System.in);
   String str = in.nextLine();
   int a = in.nextInt();
   int n =str.length();
   int i,j,k;
   for(i=0;i<n;i++)
   {
     if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
     j=str.charAt(i)-'A' ;
     k=j-a;
     char ch=(char)(k+65);
     System.out.print(ch);}
     if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
     j=str.charAt(i)-'a' ;
     k=(j-a);
       if(k<0)
         k=k+26;
     char ch=(char)(k+97);
     System.out.print(ch);}
   if(str.charAt(i)==' ')
     System.out.print(" ");
   }
 }
}
