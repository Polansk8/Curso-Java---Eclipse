package poo;


public class Coche
{
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean leatherSeats;
	private boolean airConditioner;
	
	
	
	public Coche()
		{
		this.ruedas = 4;
		
		this.largo = 2000;
		
		this.ancho = 100;
		
		this.motor = 1600;
		
		this.pesoPlataforma = 500;
		}
	
	
	public void set_color(String newColor)
		{
		this.color = newColor;
		}
	
	public void set_up_seats (String leatherSeats)
		{
		if (leatherSeats.equalsIgnoreCase("si"))
			{
			this.leatherSeats = true;
			}
		else
			{
			this.leatherSeats = false;
			}
		}
	
	public void set_air_conditioner (String airConditioner)
		{
		if (airConditioner.equalsIgnoreCase("si"))
			{
			this.airConditioner = true;
			}
		else
			{
			this.airConditioner = false;
			}
		}
	
	
	public String get_air_conditioner ()
		{
		String result = new String();
		
		if (this.airConditioner)
			{
			result = "El coche incorpora cimatizador";
			}
		else
			{
			result = "El coche lleva aire acondicionado";
			}
		
		return result;
		}
	
	public String get_seats()
		{
		String result = new String();
		
		if (this.leatherSeats)
			{
			result = "El coche tiene asientos de cuero";
			}
		else 
			{
			result = "El coche tiene asientos de serie";
			}
		
		return result;
		}
	
	
	public String get_peso_coche ()
		{
		int pesoCarroceria = 500;
		
		this.pesoTotal = this.pesoPlataforma + pesoCarroceria;
		
		if (this.leatherSeats)
			{
			this.pesoTotal += 50;
			}
		
		if (this.airConditioner)
			{
			this.pesoTotal += 20;
			}
		
		return "El peso del coche es: " + this.pesoTotal + "kg.";
		}
	
	public int vehicle_price ()
		{
		int finalPrice = 10000;
		
		if (this.leatherSeats)
			{
			finalPrice += 2000;
			}
		
		if (this.airConditioner)
			{
			finalPrice += 1500;
			}
		
		return finalPrice;
		}
	
	public String get_data ()
		{
		return "La plataforma del vehiculo tiene " + this.ruedas + " ruedas. Mide " + 
		(this.largo / 1000) + " metros con un ancho de " + this.ancho + " cm y un peso"
		+ " de plataforma de " + this.pesoPlataforma + ".";
		}
	
	public String get_color()
		{
		return "Tu coche es de color: " + this.color + ".";
		}
	
	public String get_ruedas()
		{
		return "Tu coche tiene " + this.ruedas + " ruedas.";
		}
	
	public String get_largo() 
		{
		return "Tu coche tiene " + this.largo + " de largo.";
		}
	
	public String get_ancho() 
		{
		return "Tu coche tiene " + this.ancho + " de ancho.";
		}
	
	public String get_motor() 
		{
		return "El motor de tu coche es: " + this.motor + ".";
		}
}