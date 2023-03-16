import java.util.*;



public class Entrada_ejemplo1 {

	public static void main(String[] args)
		{
		Scanner entry = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("Ingrese su nombre por favor: ");
		name = entry.nextLine();
	
		System.out.print("Ingrese la edad: ");
		age = entry.nextInt();
		
		System.out.println("Hola " + name + ". El ano que viene tendras " + (age + 1) + " anos");
		
		entry.close();
		}

}
