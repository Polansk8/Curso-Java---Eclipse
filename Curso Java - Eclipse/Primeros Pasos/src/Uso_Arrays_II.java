
public class Uso_Arrays_II
{
	public static void main(String[] args)
		{
		int arrayAleatory[] = new int [150];
		
		for (int i = 0;i < arrayAleatory.length;i ++)
			{
			arrayAleatory[i] = (int) Math.round(Math.random() * 100);
			}
		
		int i = 0;
		for (int num:arrayAleatory)
			{
			if (i % 20 == 0)
				{
				System.out.println();
				}
			System.out.printf("[%02d]~", num);
			i ++;
			}
		}
}
