import javax.swing.*;



public class Factorial
{
	public static void main(String[] args)
		{
		int result = 1;
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para verificar su factorial"));
		
		int i = num;
		while (i > 0)
			{
			result *= i;
			
			i--;
			}
		
		System.out.println("El factorial de " + num + " es: " + result);
		}
}
