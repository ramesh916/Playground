import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
    int num=n;
		for(int row_no = 1; row_no <= n; row_no++) {
		int  p=row_no;
		if (row_no%2==1){
                  for(int i=1;i<n;i++)
                  System.out.print(row_no);
          System.out.print(++row_no);
                }
        else{
             System.out.print(++row_no);
          row_no--;
              for(int i=1;i<=n-1;i++)
                  System.out.print(row_no);
              
            }
			System.out.print("\n");
			row_no=p;
	}
}
}