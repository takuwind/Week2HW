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
		return "圓形";
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
		return "橢圓形";
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
		return "三角形";
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
		return "矩形";
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
			System.out.println("請輸入 1)新增圖形 2)查看所有圖形 -1)離開 : ");
			option = scan.nextInt();
			switch(option)
			{
				case 1:
					System.out.println("請選擇 1)圓形 2)橢圓形 3)矩形 4)三角形 -1)回上層 : ");
					option2 = scan.nextInt();
					switch(option2)
					{
						case 1:
							try
							{
								System.out.println("請輸入半徑 : ");
								temp = scan.next();
								if(Double.parseDouble(temp) > 0)
								{
									shapes[count] = new Circle(Double.parseDouble(temp));
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
							try
							{
								System.out.println("請輸入半長軸 : ");
								temp = scan.next();							
								System.out.println("請輸入半短軸 : ");
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
										System.out.println("錯誤!半長軸須大於等於半短軸!");
									}
								}
								else
								{
									System.out.println("錯誤!半長(短)軸須大於0");
								}
							}
							catch(Exception e)
							{
								System.out.println("錯誤 : " + e);
							}
							break;
						case 3:
							try
							{
								System.out.println("請輸入長 : ");
								temp = scan.next();
								System.out.println("請輸入寬 : ");
								temp2 = scan.next();
								if(Double.parseDouble(temp) > 0 && Double.parseDouble(temp2) > 0)
								{
									shapes[count] = new Rectangle(Double.parseDouble(temp), Double.parseDouble(temp2));
									count++;	
								}
								else
								{
									System.out.println("錯誤!長(寬)須大於0!");
								}
							}
							catch(Exception e)
							{
								System.out.println("錯誤 : " + e);
							}
							break;
						case 4:
							try
							{
								System.out.println("請輸入底 : ");
								temp = scan.next();
								System.out.println("請輸入高 : ");
								temp2 = scan.next();
								if(Double.parseDouble(temp) > 0 && Double.parseDouble(temp2) > 0)
								{
									shapes[count] = new Triangle(Double.parseDouble(temp), Double.parseDouble(temp2));
									count++;	
								}
								else
								{
									System.out.println("錯誤!底(高)須大於0!");
								}
							}
							catch(Exception e)
							{
								System.out.println("錯誤 : " + e);
							}
							break;
						case -1:
							break;
						default:
							System.out.println("無此選項!");
							break;
					}
					break;
				case 2:
					System.out.println("編號\t形狀\t面積");
					for(int i = 0; i < count; i++)
					{
						System.out.println((i + 1) + "\t" + shapes[i].name() + "\t" + nf.format(shapes[i].area()));	
					}
					break;
				case -1:
					leave = 1;
					break;
				default:
					System.out.println("無此選項!");
					break;
			}
			if(leave == 1)
			{
				break;
			}
		}
	}
}
