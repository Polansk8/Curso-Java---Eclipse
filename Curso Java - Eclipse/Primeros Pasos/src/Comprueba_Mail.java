import javax.swing.JOptionPane;



public class Comprueba_Mail
{
	public static void main(String[] args)
		{
		String mail = "";
		int arroba = 0;
		boolean point = false;
		
		mail = JOptionPane.showInputDialog("Ingrese el mail para verificar");
		
		for (int i = 0;i < mail.length();i++)
			{
			if (mail.charAt(i) == '@')
				{
				arroba ++;
				}
			
			if (mail.charAt(i) == '.')
				{
				point = true;
				}
			}
		
		
		if (arroba == 1 && point)
			{
			System.out.println("EL MAIL ES VALIDO");
			}
		else 
			{
			System.out.println("EL MAIL NO ES VALIDO");
			}
		}
}
