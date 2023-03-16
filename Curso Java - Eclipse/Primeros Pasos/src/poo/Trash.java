package poo;

public class Trash
{
	public static void main(String[] args)
		{
		Employeee emp = new Employeee ("Ricardo");
		Employeee emp2 = new Employeee ("Ano");
		Employeee emp3 = new Employeee ("Weeena");
		Employeee emp4 = new Employeee ("Iesoo");
		
		emp.setSection("Programacion");
		
		System.out.printf("%s \n%s \n%s \n%s \n%s", emp.getData(), emp2.getData(), emp3.getData(), 
						  emp4.getData(), Employeee.getNextId());
		
		
		}
}





class Employeee
{
	private final String name;
	private String section;
	private int id;
	private static int nextId = 1;
	
	
	
	public Employeee(String name)
		{
		this.name = name;
		
		this.section = "Administracion";
		
		this.id = nextId;
		
		nextId ++;
		}
	
	
	public static String getNextId ()
		{
		return "El id siguiente es: " + nextId;
		}
	
	
	public void setSection (String section)
		{
		this.section = section;
		}
	
	
	
	public String getName ()
		{
		return this.name;
		}

	public String getSection () 
		{
		return this.section;
		}
	
	public int getId ()
		{
		return this.id;
		}
	
	public String getData ()
		{
		return "El nombre es: " + this.getName() + " con id: " + this.getId() + " y la seccion es: " + this.getSection() + ".";
		}
}