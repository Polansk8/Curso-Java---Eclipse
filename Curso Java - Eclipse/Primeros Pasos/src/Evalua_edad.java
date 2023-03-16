
import java.util.*;


public class Evalua_edad
{
	public static void main(String[] args)
		{
		Scanner entry = new Scanner(System.in);
		
		System.out.print("Introduce tu edad por favor: ");
		int age = entry.nextInt();
		
		if (age < 18) 
			{
			System.out.println("Eres adolescente");
			}
		else if (age < 40) 
			{
			System.out.println("Eres joven");
			}
		else if (age < 65) 
			{
			System.out.println("Eres adulto");
			}
		else 
			{
			System.out.println("CUIDATE MASTER");
			}
		
		entry.close();
		}
	
}
