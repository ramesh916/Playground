import java.util.Scanner; 
class Main
{ 
 public static void main (String[] args)
 {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int str_len = str.length();
    int n=str_len/2;
   int i,j,l=0,k,a;
   for(i=1;i<=str_len;i++)
   {a=n;
     for(j=0;j<=str_len-i-1;j++)
       System.out.print(" ");
     for(j=0;j<i;j++)
     {
       if(a<str_len)
       System.out.print(str.charAt(a));
       a++;
     } 
    if(i>str_len/2)
    {l++;
     
      for(k=0;k<l-1;k++)
        System.out.print(str.charAt(k));
    }
    if(i!=str_len)
    System.out.println();
   }
   
 }
}