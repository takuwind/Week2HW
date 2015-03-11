import java.io.*;
import java.util.*;
import java.text.*;

abstract class Shape
{
	abstract double area();
	abstract String name();
}
class Circle extends Shape
{
	double r;
	public Circle(double r)
	{
		this.r = r;
	}
	public double area()
	{
		return 3.14 * r * r;
	}
	public String name()
	{
		return "���";
	}
}
class Oval extends Shape
{
	double a, b;
	public Oval(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	public double area()
	{
		return 3.14 * a * b;
	}
	public String name()
	{
		return "����";
	}
}
class Triangle extends Shape
{
	double bottom, height;
	public Triangle(double b, double h)
	{
		this.bottom = b;
		this.height = h;
	}
	public double area()
	{
		return bottom * height / 2;
	}
	public String name()
	{
		return "�T����";
	}
}
class Rectangle extends Shape
{
	double width, height;
	public Rectangle(double w, double h)
	{
		this.width = w;
		this.height = h;
	}
	public double area()
	{
		return width * height;
	}
	public String name()
	{
		return "�x��";
	}
}
class Hw4_2
{
	public static void main(String[] args)
	{
		NumberFormat nf = NumberFormat.getInstance(); 
		nf.setMaximumFractionDigits( 2 );
		Shape[] shapes = new Shape[100];
		int option, option2, count = 0 , leave = 0;
		Scanner scan = new Scanner(System.in);
		String temp, temp2;
		while(true)
		{
			System.out.println("�п�J 1)�s�W�ϧ� 2)�d�ݩҦ��ϧ� -1)���} : ");
			option = scan.nextInt();
			switch(option)
			{
				case 1:
					System.out.println("�п�� 1)��� 2)���� 3)�x�� 4)�T���� -1)�^�W�h : ");
					option2 = scan.nextInt();
					switch(option2)
					{
						case 1:
							try
							{
								System.out.println("�п�J�b�| : ");
								temp = scan.next();
								if(Double.parseDouble(temp) > 0)
								{
									shapes[count] = new Circle(Double.parseDouble(temp));
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
							try
							{
								System.out.println("�п�J�b���b : ");
								temp = scan.next();							
								System.out.println("�п�J�b�u�b : ");
								temp2 = scan.next();
								if(Double.parseDouble(temp) > 0 && Double.parseDouble(temp2) > 0)
								{
									if(Double.parseDouble(temp) >= Double.parseDouble(temp2))
									{
										shapes[count] = new Oval(Double.parseDouble(temp), Double.parseDouble(temp2));
										count++;
									}	
									else
									{
										System.out.println("���~!�b���b���j�󵥩�b�u�b!");
									}
								}
								else
								{
									System.out.println("���~!�b��(�u)�b���j��0");
								}
							}
							catch(Exception e)
							{
								System.out.println("���~ : " + e);
							}
							break;
						case 3:
							try
							{
								System.out.println("�п�J�� : ");
								temp = scan.next();
								System.out.println("�п�J�e : ");
								temp2 = scan.next();
								if(Double.parseDouble(temp) > 0 && Double.parseDouble(temp2) > 0)
								{
									shapes[count] = new Rectangle(Double.parseDouble(temp), Double.parseDouble(temp2));
									count++;	
								}
								else
								{
									System.out.println("���~!��(�e)���j��0!");
								}
							}
							catch(Exception e)
							{
								System.out.println("���~ : " + e);
							}
							break;
						case 4:
							try
							{
								System.out.println("�п�J�� : ");
								temp = scan.next();
								System.out.println("�п�J�� : ");
								temp2 = scan.next();
								if(Double.parseDouble(temp) > 0 && Double.parseDouble(temp2) > 0)
								{
									shapes[count] = new Triangle(Double.parseDouble(temp), Double.parseDouble(temp2));
									count++;	
								}
								else
								{
									System.out.println("���~!��(��)���j��0!");
								}
							}
							catch(Exception e)
							{
								System.out.println("���~ : " + e);
							}
							break;
						case -1:
							break;
						default:
							System.out.println("�L���ﶵ!");
							break;
					}
					break;
				case 2:
					System.out.println("�s��\t�Ϊ�\t���n");
					for(int i = 0; i < count; i++)
					{
						System.out.println((i + 1) + "\t" + shapes[i].name() + "\t" + nf.format(shapes[i].area()));	
					}
					break;
				case -1:
					leave = 1;
					break;
				default:
					System.out.println("�L���ﶵ!");
					break;
			}
			if(leave == 1)
			{
				break;
			}
		}
	}
}
