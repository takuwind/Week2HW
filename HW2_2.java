import java.io.*;
import java.util.*;

class Hw2_2
{
	public static void main(String[] args)
	{
		float f1, f2;
		int option;
		Scanner temp = new Scanner(System.in);
		System.out.println("�п�J�Ĥ@�ӯB�I��:");
		f1 = temp.nextFloat();
		System.out.println("�п�J�ĤG�ӯB�I��:");
		f2 = temp.nextFloat();
		System.out.println("��ܹB��l 1)+ 2)- 3)* 4)/");
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
					System.out.println("���Ƥ��ର�s!!");
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