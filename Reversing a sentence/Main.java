import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code her
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
      StringBuilder a=new StringBuilder(str);
    int n = str.length(),p=n-1,i;
      for(i=n-1;i>=1;i--){
        char b=str.charAt(i);
        if(b==' '){
      reverse_string(a,i,p);
       p=i -1  ;
        
        }
      }
      char c=str.charAt(0);
      System.out.println(c);
    
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      for(int j=start_idx+1;j<=end_idx;j++)
      {
        char a= sb.charAt(j);
        System.out.print(a);
      }
       
          System.out.print(" ");
      
    }
}