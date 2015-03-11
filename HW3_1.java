import java.io.*;
import java.util.*;
import java.text.*;

class Circle
{
	double r;
	
	Circle(double r)
	{
		this.r = r;
	}
	
	double area()
	{
		return 3.14 * r * r;
	}
	
	double Arc(int degree)
	{
		return 3.14 * r * 2 * degree / 360;
	}
	
	double Pie(int degree)
	{
		return 3.14 * r * r * degree / 360;
	}
	
	public static void main(String[] args)
	{
		NumberFormat nf = NumberFormat.getInstance(); 
		nf.setMaximumFractionDigits( 2 );
		boolean exit = false;
		String temp;
		int option, count = 0, num, d;
		Circle[] c = new Circle[100];
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("請輸入 1)新增圓形 2)查看所有圓形 3)查看扇形弧長及面積 -1)離開 : ");
			option = s.nextInt();
			switch(option)
			{
				case 1:
					try
					{
						System.out.println("請輸入半徑 : ");
						temp = s.next();
						if(Double.parseDouble(temp) > 0)
						{
							c[count] = new Circle(Double.parseDouble(temp));
							count++;
						}
						else
						{
							System.out.println("錯誤!半徑須大於0!");
						}
					}
					catch(Exception e)
					{
						System.out.println("錯誤 : " + e);
					}
					break;
				case 2:
					System.out.println("編號\t半徑");
					for(int i = 0 ; i < count; i++)
					{
						System.out.println((i + 1) + "\t" + c[i].r);
					}
					break;
				case 3:
					System.out.println("請輸入編號 : ");
					num = s.nextInt();
					if(num <= count && num > 0)
					{
						System.out.println("請輸入角度 : ");
						d = s.nextInt();
						if(d > 0 && d <= 360)
						{
							System.out.println("編號\t半徑\t角度\t扇形弧長\t扇形面積");
							System.out.println(num + "\t" + c[num - 1].r + "\t" + d + "\t" + nf.format(c[num - 1].Arc(d)) + "\t\t" + nf.format(c[num - 1].Pie(d)));
						}
						else
						{
							System.out.println("角度錯誤!");
						}
					}
					else
					{
						System.out.println("查無資料!");
					}
					break;
				case -1:
					exit = true;
					break;
				default:
					System.out.println("無此選項!");
					break;
			}
			if(exit)
			{
				break;
			}
		}
	}
}
