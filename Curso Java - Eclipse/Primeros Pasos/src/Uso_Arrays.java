
public class Uso_Arrays
{
	public static void main(String[] args) 
		{
		//int miMatriz[] = new int [5];
		
		/*
		miMatriz[0] = 5;
		miMatriz[1] = 38;
		miMatriz[2] = -15;
		miMatriz[3] = 92;
		miMatriz[4] = 71;
		*/
		
		int miMatriz[] = {5, 38, -15, 92, 71, 95, 85, 65, 35, 14, 78};
		
		for (int i = 0;i < miMatriz.length;i ++)
			{
			System.out.printf("Posicion %02d: [%02d]\n", i, miMatriz[i]);
			}
		}
}
