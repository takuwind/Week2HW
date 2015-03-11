class Hw1_2
{
	public static void main(String[] args)
	{
		int[] array = {10, 20, 30, 40, 50, 60, 70};
		int sum = 0;
		double average;
		for(int i : array)
		{
			sum = sum + i;
		}
		average = sum / array.length;
		System.out.println("sum : " + sum);
		System.out.println("average : " + average);
	}
}