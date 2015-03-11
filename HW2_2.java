import java.io.*;
import java.util.*;

class Hw2_2
{
	public static void main(String[] args)
	{
		float f1, f2;
		int option;
		Scanner temp = new Scanner(System.in);
		System.out.println("請輸入第一個浮點數:");
		f1 = temp.nextFloat();
		System.out.println("請輸入第二個浮點數:");
		f2 = temp.nextFloat();
		System.out.println("選擇運算子 1)+ 2)- 3)* 4)/");
		option = temp.nextInt();
		switch(option)
		{
			case 1:
				System.out.println(f1 + "+" + f2 + "=" + (f1 + f2));
				break;
			case 2:
				System.out.println(f1 + "-" + f2 + "=" + (f1 - f2));
				break;
			case 3:
				System.out.println(f1 + "*" + f2 + "=" + (f1 * f2));
				break;
			case 4:
				if(f2 == 0)
				{
					System.out.println("除數不能為零!!");
				}
				else
				{
					System.out.println(f1 + "/" + f2 + "=" + (f1 / f2));
				}
				break;
			default:
				System.out.println("Error!!");
				break;
		}
	}
}