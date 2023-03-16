
public class Arrays_Bidimensionales
{
	public static void main(String[] args)
		{
		int matrix[][] = new int [4][5];
		
		for (int i = 0;i < 4;i ++)
			{
			for (int j = 0;j < 5;j ++)
				{
				matrix[i][j] = (int) Math.round(Math.random() * 100);
				}
			}
		
		for (int i = 0;i < 4;i ++)
			{
			for (int j = 0;j < 5;j ++)
				{
				System.out.printf("[%02d]~", matrix[i][j]);
				}
			
			System.out.println();
			}
		
		System.out.printf("\n\n");
		
		for (int fila[]:matrix)
			{
			for (int z:fila)
				{
				System.out.printf("[%02d]~", z);
				}
			
			System.out.println();
			}
		}
}
