
public class Ejemplo_Array_2D
{
	public static void main(String[] args)
		{
		double acumulado;
		double interes = .10;
		
		double saldo [][] = new double [6][5];
		
		for (int i = 0;i < 6;i ++) 
			{
			saldo[i][0] = 10000;
			acumulado = 10000;
			
			for (int j = 1;j < 5;j ++)
				{
				acumulado += (acumulado * interes);
				
				saldo [i][j] = acumulado;
				}
			
			interes += .01;
			}
		
		System.out.printf("\n______________________________________________________\n");
		for (double fila[]:saldo)
			{
			for (double pija:fila)
				{
				System.out.printf("%1.2f | ", pija);
				}
			
			System.out.printf("\n______________________________________________________\n");
			}
		}
}
