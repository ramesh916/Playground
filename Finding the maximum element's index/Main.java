import java.util.Scanner;
class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int list[] = new int[n];
for(int index = 0; index < n; index++)
{
list[index] = sc.nextInt();
}
perfect_batch(list, n);
}

public static void perfect_batch(int list[], int n)
{
  int i ,j,k=0;
  for(i=0;i<1;i++)
  {
    for(j=1;j<n;j++)
    {
      if(list[i]<list[j]){
     list[i]=list[j];
        k=j;}
    }
  }
  System.out.println(k);
}
}