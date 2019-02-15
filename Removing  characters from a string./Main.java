import java.util.Scanner; 
class Main
{ 
 public static void main (String[] args)
 {
    Scanner in = new Scanner(System.in);
    String str1 = in.nextLine();
    String str2 = in.nextLine();
    int str1_len = str1.length();
   int str2_len = str2.length();
   int i,j,l=0,k,a;
   for(i=0;i<str1_len;i++)
   {l=0;
     for(j=0;j<str2_len;j++)
     {
       if(str1.charAt(i)==str2.charAt(j))
         l++;
     }
    if(l==0)
      System.out.print(str1.charAt(i));
   }
   
 }
}