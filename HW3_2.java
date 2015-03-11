import java.io.*;
import java.util.*;
import java.text.*;

class Date
{
	int year, month, day;
	Date(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	void judge()
	{
		if((year <= 0) || (month < 1 || month > 12) || (day < 1 || day > 31))
		{
			System.out.println("date format incorrect!");
		}
		else
		{
			if(month == 4 || month == 6 || month == 9 || month == 11)
			{
				if(day > 30)
				{
					System.out.println("date format incorrect!");
				}
				else
				{
					System.out.println("CORRECT!");
					System.out.println("A.D." + year + "/" + month + "/" + day);
				}
			}
			else if(month == 2)
			{
				if((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && day > 29)
				{
					System.out.println("date format incorrect!");
				}
				else if((year % 400 != 0 && (year % 4 != 0 || year % 100 == 0)) && day > 28)
				{
					System.out.println("date format incorrect!");
				}
				else
				{
					System.out.println("CORRECT!");
					System.out.println("A.D." + year + "/" + month + "/" + day);
				}
			}
			else
			{
				System.out.println("CORRECT!");
				System.out.println("A.D." + year + "/" + month + "/" + day);
			}

		}
	}
	public static void main(String[] args)
	{
		String y, m, d;
		Scanner temp = new Scanner(System.in);
		try
		{
			System.out.println("input year(A.D.) : ");
			y = temp.next();
			System.out.println("input month : ");
			m = temp.next();
			System.out.println("input day : ");
			d = temp.next();
			Date date = new Date(Integer.parseInt(y), Integer.parseInt(m), Integer.parseInt(d));
			date.judge();
		}
		catch(Exception e)
		{
			System.out.println("error : " + e);
		}
		
	}
}