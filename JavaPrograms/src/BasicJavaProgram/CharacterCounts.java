package BasicJavaProgram;

import java.util.Scanner;

public class CharacterCounts 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.print("Please enter String:");
		Scanner str = new Scanner(System.in);
		String sent = str.nextLine();
		int count=0;
		System.out.println("Input String is: "+sent);
		
		for(int i=0; i<sent.length();i++)
		{
			if(sent.charAt(i)!= ' ')
			{
				count++;
			}
		}
		System.out.println("Total count is: "+count);

	}

}
