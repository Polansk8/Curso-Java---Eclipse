import javax.swing.JOptionPane;

public class Acceso_aplicacion
{

	public static void main(String[] args)
		{
		String pass = "Mariano";
		String entryPass = "";
		
		while (!pass.equals(entryPass)) 
			{
			entryPass = JOptionPane.showInputDialog("Ingrese la contraseñaaaa");
			
			if (!pass.equals(entryPass))
				{
				System.out.println("CONTRASENA INCORRECTA");
				}
			}
		
		System.out.println("CONTRASENA CORRECTA, ACCESO PERMITIDO");
		}
}
