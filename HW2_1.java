import java.io.*;
import java.util.*;

class Hw2_1
{
	public static void main(String[] args)
	{
		String name;
		int[] date = new int[3];
		Scanner temp = new Scanner(System.in);
		System.out.println("�п�J�m�W");
		name = temp.nextLine();
		System.out.println("�X�ͦ褸�~:");
		date[0] = temp.nextInt();
		System.out.println("�X�ͤ��:");
		date[1] = temp.nextInt();
		System.out.println("�X�ͤ�:");
		date[2] = temp.nextInt();
		System.out.println("�m�W:" + name);
		System.out.println("�X�ͦ~���" + "����" + (date[0] - 1911) + "�~"+ date[1] + "��" + date[2] + "��");
	}
}