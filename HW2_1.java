import java.io.*;
import java.util.*;

class Hw2_1
{
	public static void main(String[] args)
	{
		String name;
		int[] date = new int[3];
		Scanner temp = new Scanner(System.in);
		System.out.println("請輸入姓名");
		name = temp.nextLine();
		System.out.println("出生西元年:");
		date[0] = temp.nextInt();
		System.out.println("出生月份:");
		date[1] = temp.nextInt();
		System.out.println("出生日:");
		date[2] = temp.nextInt();
		System.out.println("姓名:" + name);
		System.out.println("出生年月日" + "民國" + (date[0] - 1911) + "年"+ date[1] + "月" + date[2] + "日");
	}
}