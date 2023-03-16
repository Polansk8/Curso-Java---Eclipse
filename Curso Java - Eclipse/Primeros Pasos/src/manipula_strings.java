
public class manipula_strings
{
	public static void main(String[] args)
		{
		String name = "La concha de tu vieja";
		
		System.out.println("Mi name es " + name);
		
		System.out.println("Mi name tiene " + name.length() + " letras");
		
		System.out.println("La primera letra de " + name + " es la letra " + name.charAt(0));
		
		System.out.println("La ultima letra de " + name + " es la letra " + name.charAt((name.length() - 1)));
		}
}
