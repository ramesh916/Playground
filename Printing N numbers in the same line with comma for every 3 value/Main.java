import java.util.Scanner;
class Main{	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p =0;
		for(int starcount = 1 ; starcount <= n ; starcount++) {
			System.out.print(starcount);
          p++;
			if(p%3==0)
    			System.out.print(",");			
		}
	}
}