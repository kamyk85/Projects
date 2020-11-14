package course;

import java.util.Scanner;

public class ProjektPKB2 
{

	public static void showAve (int [] pkb)
	{
		double ave = 0;
		int sum = 0;
		
		for (int i=0; i < pkb.length; i++)
		{
			sum = sum + pkb[i];
		}
		ave = sum / pkb.length;
		System.out.println ("The average pkb per person value:" + ave);
	}
	
	
	public static void showMin (int [] pkb)
	{
		int min = pkb[0];
		int year = 0;
		
		for (int i=1; i < pkb.length; i++)
		{
			if (pkb[i] < min)
			{
				min = pkb[i];
				year = i;
			}
				
		}
		System.out.println ("Lowest pkb per person value: " + min + "in year 200" + year);
	}
	
	
	public static void showMax (int [] pkb)
	{
		int max = 0;
		int year = 0;
		
		for (int i=0; i < pkb.length; i++)
		{
			if (pkb[i] > max)
			{
				max = pkb[i];
				year = i;
			}
				
		}
		System.out.println ("Highest pkb per person value: " + max + "in year 200" + year);
	}
	
	
	public static void showAll(int [] pkb)
	{
		for (int i=pkb.length-1; i >= 0; i--)
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
		int pkb [] = {19527, 20391, 21203, 22148, 24438, 25955, 28056, 31158, 22741, 35966};
		
		int a = 0;
		boolean start = true;
		Scanner read = null;
		
			try
			{
				read = new Scanner(System.in);
				
				while (start)
				{
					System.out.println ("PKB menu:");
					System.out.println ("1. Show all pkb per person  values from years 2000-2009");
					System.out.println ("2. Show pkb per person value from the selected year");
					System.out.println ("3. Show min pkb per person value from years 2000-2009");
					System.out.println ("4. Show max pkb per person value from years 2000-2009");
					System.out.println ("5. Show the average pkb per person value from years 2000-2009");
					System.out.println ("6. EXIT");
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
						showAve(pkb);
					}
					else if (a == 6)
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
//		showAve(pkb);
		
	}

}
