import java.util.Scanner;

public class Adivina_Numero
{
	public static void main(String[] args)
		{
		int aleatory = (int) (Math.random() * 100);

		Scanner entry = new Scanner(System.in);
		
		int num = 0;
		int intentos = 0;
		
		System.out.println("Ingrese un numero: ");
		
		while (num != aleatory)
			{
			num = entry.nextInt();
			
			if (aleatory < num)
				{
				System.out.println("Ingresa un numero mas bajo");
				}
			else
				{
				System.out.println("Ingresa un numero mas alto");
				}
			
			intentos++;
			}
		
		System.out.println("Acertaste el numero con " + intentos + " intentos totales.");
		
		entry.close();
		}
}
