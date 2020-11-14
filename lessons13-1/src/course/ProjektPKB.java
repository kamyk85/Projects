package course;

import java.util.Scanner;

public class ProjektPKB 
{

	public static void showMin (int [] pkb)
	{
		int min = pkb[0];
		
		for (int i=1; i < pkb.length; i++)
		{
			if (pkb[i] < min)
				min = pkb[i];
		}
		System.out.println ("Lowest pkb value: " + min);
	}
	
	
	public static void showMax (int [] pkb)
	{
		int max = 0;
		
		for (int i=0; i < pkb.length; i++)
		{
			if (pkb[i] > max)
				max = pkb[i];
		}
		System.out.println ("Highest pkb value: " + max);
	}
	
	
	public static void showAll(int [] pkb)
	{
		for (int i=0; i < pkb.length; i++)
		{
			System.out.println("200" + i + ": " + pkb[i]);
		}
	}
	
	
	public static void showOne(int [] pkb)
	{
		Scanner read = null;
//		try
//		{
			read = new Scanner(System.in);
			
			System.out.println("Select year: 200");
			int year = read.nextInt();
			
			if (year <=9)
			{
				System.out.println ("200" + year + ": " + pkb[year]);
			}
			else
			{
				System.out.println ("Wrong value");
			}
//		}
//		finally
//		{
//			if (read != null)
//				read.close();
//		}
	}
	
	
	public static void main(String[] args) 
	{
		int pkb [] = {747032, 779975, 810617, 845930, 933062, 990463,
				1069815, 1187599, 1286063, 1372201};
		
		int a = 0;
		boolean start = true;
		Scanner read = null;
		
			try
			{
				read = new Scanner(System.in);
				
				while (start)
				{
					System.out.println ("PKB menu:");
					System.out.println ("1. Show all pkb values from years 2000-2009");
					System.out.println ("2. Show pkb value from the selected year");
					System.out.println ("3. Show min pkb value from years 2000-2009");
					System.out.println ("4. Show max pkb value from years 2000-2009");
					System.out.println ("5. EXIT");
					a = read.nextInt();
					
					if (a == 1)
					{
						showAll(pkb);
					}
					else if (a == 2)
					{
						showOne(pkb);
					}
					else if (a == 3)
					{
						showMin(pkb);
					}
					else if (a == 4)
					{
						showMax(pkb);
					}
					else if (a == 5)
					{
						start = false;
					}
					else
					{
						System.out.println ("Wrong value");
					}
				}
			}
			finally
			{
				if (read != null)
					read.close();
			}
		
		
//		showAll(pkb);
//		showOne(pkb);
//		showMin(pkb);
//		showMax(pkb);
		
	}

}
