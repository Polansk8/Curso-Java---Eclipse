package poo;

import java.util.*;


public class Uso_Empleado
{
	public static void main(String[] args)
		{
		/*Employee emp1 = new Employee ("Paco Gomez", 85000, 1990, 12, 17);
		Employee emp2 = new Employee ("Ana Lopez", 95000, 1995, 06, 02);
		Employee emp3 = new Employee ("Maria Martin", 105000, 2002, 03, 15);
		
		emp1.raiseSalary(5);
		emp2.raiseSalary(5);
		emp3.raiseSalary(5);
		
		System.out.println("Nombre: " + emp1.getName() + " - Salario: $" + emp1.getSalary()
						   + " - Fecha de alta: " + emp1.getAlta());
		System.out.println("Nombre: " + emp2.getName() + " - Salario: $" + emp2.getSalary()
						   + " - Fecha de alta: " + emp2.getAlta());
		System.out.println("Nombre: " + emp3.getName() + " - Salario: $" + emp3.getSalary()
						   + " - Fecha de alta: " + emp3.getAlta());*/
		
		Employee emps[] = new Employee[3];
		
		emps[0] = new Employee ("Paco Gomez", 85000, 1990, 12, 17);
		emps[1] = new Employee ("Ana Lopez", 95000, 1995, 06, 02);
		emps[2] = new Employee ("Maria Martin", 105000, 2002, 03, 15);
		
		for (Employee e:emps)
			{
			e.raiseSalary(5);
			}
		
		for (Employee e: emps)
			{
			System.out.println("Nombre: " + e.getName() + " - Salario: " + e.getSalary() + 
								" - Fecha de alta: $" + e.getSalary());
			}
		}
}





class Employee
{
	private String name;
	private double salary;
	private Date altaContrato;
	
	
	
	public Employee (String name, double sal, int year, int month, int day)
		{
		this.name = name;
		
		this.salary = sal;
		
		GregorianCalendar calendary = new GregorianCalendar(year, (month - 1), day);
		this.altaContrato = calendary.getTime();
		}
	
	
	public String getName ()
		{
		return this.name;
		}
	
	public double getSalary ()
		{
		return this.salary;
		}
	
	public Date getAlta ()
		{
		return altaContrato;
		}
	
	
	public void raiseSalary (double porc)
		{
		double increase = (this.salary * porc) / 100;
		
		this.salary += increase;
		}
}