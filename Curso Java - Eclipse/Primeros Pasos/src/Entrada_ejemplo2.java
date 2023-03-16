

import javax.swing.*;


public class Entrada_ejemplo2 {

	public static void main(String[] args) 
	{
	String nameUser = JOptionPane.showInputDialog("Ingrese su nombre, por favor");
	
	int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad, por favor"));
	age ++;
	
	System.out.println("Hola " + nameUser + ". Tendras " + age + " anos.");
	
	
	}

}
