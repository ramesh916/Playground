import java.util.Scanner;
class Main
{

	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();//Input String	
		String vow="aeiou";
		for(int k=0;k<input.length();k++)		//Displaying the String without duplicate words	
		{int i=0;
          for(int j=0;j<5;j++){
			if(input.charAt(k)==vow.charAt(j))
			{
				i++;
			}
	     }  
         if(i!=1)
           System.out.print(input.charAt(k));
	}
}
}