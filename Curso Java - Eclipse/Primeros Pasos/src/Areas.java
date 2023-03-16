import java.util.*;
import javax.swing.*;


public class Areas
{
	public static void main(String[] args)
	{
	Scanner entry = new Scanner(System.in);
	int option = 0;
	
	while (option != 27)
		{
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo \n27: SALIRRR");
		option = entry.nextInt();
		
		switch(option) 
			{
			case 1:
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
				
				System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
				break;
			case 2:
				int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
				
				System.out.println("El area del rectangulo es: " + base * altura);
				break;
			case 3:
				base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				
				altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
				
				System.out.println("El area del triangulo es: " + (base*altura) / 2);
				break;
			case 4:
				int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
				
				System.out.print("El area del circulo es: ");
				System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
				break;
			case 27:
				System.out.println("CHAUUUU GRACIAS POR USAR EL PROGRAMITA WUJUUU");
				break;
			default:
				System.out.println("PAJEROOOOO INGRESASTE UNA OPCIONN ERRONEA NOOOO");
				break;
			}
		}
	
	entry.close();
	}
}
