import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		int length=input.length();
		int index;
    
		if(length%2==0)
		 index=length/2-1;
		else
		  index=length/2;
		
        for(int i=0;i<length;i++)
        {

            int start=index;
            int end=0;

            for(int j=length-1;j>=0;j--)
            {
                if(j<=i)
                {
                    if(start<length)
                    {
                      System.out.print(input.charAt(start));
                      start++;
                    }
                    else
                    {
                      System.out.print(input.charAt(end));
                      end++;
                    }
                }
                else
                {
                  System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
