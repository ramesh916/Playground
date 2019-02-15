import java.util.Scanner; 
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix[i][j] = in.nextInt();
      }
    }
    int matrix1[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix1[i][j] = in.nextInt();
      }
    }
    int a=0,b=0;
    for(int i = 0; i <= r - 1; i++){
      a=0;
      for(int j = 0; j < c; j++){
       if(matrix[i][j]==matrix1[i][j])
         a++;
      }
      if(a==2)
        b++;
    }
    if(b==2)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
