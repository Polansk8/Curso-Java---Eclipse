package poo;


import javax.swing.*;

public class Uso_Coche
{
	public static void main(String[] args)
		{
		Coche vehicle = new Coche();
		
		vehicle.set_color(JOptionPane.showInputDialog("Ingrese el color del vehiculo"));
		vehicle.set_up_seats(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
		vehicle.set_air_conditioner(JOptionPane.showInputDialog("Tiene climatizador?"));
		
		System.out.println(vehicle.get_data());
		System.out.println(vehicle.get_color());
		System.out.println(vehicle.get_seats());
		System.out.println(vehicle.get_peso_coche());
		System.out.println(vehicle.get_air_conditioner());
		System.out.println("El precio final del coche es: U$S " + vehicle.vehicle_price() + ".");
		}
}
