import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
    int num=n;
		for(int row_no = 1; row_no <= n; row_no++) {
		  
		if (row_no==1||row_no==n){
                  for(int i=1;i<=n;i++)
                  System.out.print("*");
                }
        else{
              for(int i=1;i<=n;i++)
              if (i==1||i==n)
                  System.out.print("*");
              else
              System.out.print(" ");
            }
			System.out.print("\n");
			
	}
}
}