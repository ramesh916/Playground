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
    int p=0;
    for(int i = 0; i <r ; i++){
      int j=i;
        System.out.print(matrix[j][i] + " ");
    }
    int i,j=1,k;
    for(i=0;i<r;i++)
    {
     if(j<c)
       System.out.print(matrix[i][j]+" ");
      j++;
    }
    j=2;
    for(i=0;i<r-2;i++)
    {
      if(j<c)
        System.out.print(matrix[i][j]+" ");
    } 
  }
}
