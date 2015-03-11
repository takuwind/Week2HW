import java.io.*;
import java.util.*;

class Hw2_4
{
	public static void main(String[] args)
	{
		int option, count = 0, num , leave = 0;
		String[] name = new String[100];
		int[] grade = new int[100];
		Scanner temp = new Scanner(System.in);
		while(true)
		{
			System.out.println("Option 1)Input new data 2)Output all data 3)Search by number  -1)leave : ");
			option = temp.nextInt();
			switch(option)
			{
				case 1:
					try
					{
						System.out.println("Enter name :");
						name[count] = temp.next();
						System.out.println("Enter grade :");
						grade[count] = Integer.parseInt(temp.next());
						count++;
					}
					catch(Exception e)
					{
						System.out.println("ERROE :" + e);
					}
					break;
				case 2:
					System.out.println("Number\tName\tGrade");
					for(int i = 0; i < count; i++)
					{
						System.out.println((i + 1) + "\t" + name[i] + "\t" + grade[i]);
					}
					break;
				case 3:
					System.out.println("Enter the number:");
					num = temp.nextInt();
					if(num > 0 && num <= count)
					{
						System.out.println("NO." + num + "\tName :" + name[num - 1] + "\tGrade :" + grade[num - 1]);
					}
					else
					{
						System.out.println("No Data !!");
					}
					break;
				case -1:
					leave = 1;
					break;
				default:
					System.out.println("ERROR!!");
					break;
			}
			if(leave== 1 )
			{
				break;
			}
		}
	}
}