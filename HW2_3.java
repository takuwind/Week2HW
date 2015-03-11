import java.io.*;
import java.util.*;

class Hw2_3
{
	public static void main(String[] args)
	{
		int year, row = 0;
		Scanner temp = new Scanner(System.in);
		System.out.println("西元年份:");
		year = temp.nextInt();
		for(int i = 1; i < year; i++)
		{
			if((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0))
			{
				System.out.print(i + "\t");
				row++;
				if(row == 5)
				{
					System.out.println("\n");
					row = 0;
				}
			}
		}
	}
}
