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
			System.out.println("�п�J 1)�s�W��� 2)�d�ݩҦ���� 3)�d�ݮ��Ω����έ��n -1)���} : ");
			option = s.nextInt();
			switch(option)
			{
				case 1:
					try
					{
						System.out.println("�п�J�b�| : ");
						temp = s.next();
						if(Double.parseDouble(temp) > 0)
						{
							c[count] = new Circle(Double.parseDouble(temp));
							count++;
						}
						else
						{
							System.out.println("���~!�b�|���j��0!");
						}
					}
					catch(Exception e)
					{
						System.out.println("���~ : " + e);
					}
					break;
				case 2:
					System.out.println("�s��\t�b�|");
					for(int i = 0 ; i < count; i++)
					{
						System.out.println((i + 1) + "\t" + c[i].r);
					}
					break;
				case 3:
					System.out.println("�п�J�s�� : ");
					num = s.nextInt();
					if(num <= count && num > 0)
					{
						System.out.println("�п�J���� : ");
						d = s.nextInt();
						if(d > 0 && d <= 360)
						{
							System.out.println("�s��\t�b�|\t����\t���Ω���\t���έ��n");
							System.out.println(num + "\t" + c[num - 1].r + "\t" + d + "\t" + nf.format(c[num - 1].Arc(d)) + "\t\t" + nf.format(c[num - 1].Pie(d)));
						}
						else
						{
							System.out.println("���׿��~!");
						}
					}
					else
					{
						System.out.println("�d�L���!");
					}
					break;
				case -1:
					exit = true;
					break;
				default:
					System.out.println("�L���ﶵ!");
					break;
			}
			if(exit)
			{
				break;
			}
		}
	}
}
