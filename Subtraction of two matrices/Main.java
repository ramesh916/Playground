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
    int transpose[][] = new int[r][c];
    for(int i = 0; i <= r-1; i++){
      for(int j = 0; j <= c-1; j++){
        transpose[i][j] = matrix[i][j]-matrix1[i][j]; 
      }
    }
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        System.out.print(transpose[i][j] + " ");
      }
      System.out.println();
    }
  }
}