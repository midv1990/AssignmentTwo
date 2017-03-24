public class Person
{
	private String name;
	private String surname;
	private int age;
	private double weight;
	private boolean isMale;
	
	
	public Person()
	{}
	
	public Person (String n, String sn, int a, double w, boolean gender)
	{
		this.name = n;
		this.surname = sn;
		this.age = a;
		this.weight = w;
		this.isMale = gender;
	}
	
	//Methods To help with the annotation testing
	public void incrementAge()
	{
		this.age++;
	}
	
	public void pickedUpWeight()
	{
		this.weight += 1.50;
	}
	
	public static boolean checkEquality(Person p1, Person p2)
	{
		boolean isEqual = false;
		
		if(p1.getName() != p2.getName())
		{
			isEqual=false;
		}
		else
		{
			if(p1.getSurname() != p2.getSurname())
			{
				isEqual=false;
			}
			else if(p1.getAge()!= p2.getAge())
			{
				isEqual=false;
			}
			else if(p1.getWeight() != p2.getWeight())
			{
				isEqual=false;
			}
			else if (p1.getGender() != p2.getGender())
			{
				isEqual=false;
			}
			else
			{
				isEqual=true;
			}
		}
			
		return isEqual;		
	}
	
	
	//gets and sets
	public String getName()
	{
		return this.name;
	}
	public void setName(String n)
	{
		this.name= n;
	}
	
	public String getSurname()
	{
		return this.surname;
	}
	public void setSurname(String sn)
	{
		this.surname=sn;
	}
	
	public int getAge()
	{
		return this.age;
	}
	public void setAge(int a)
	{
		this.age = a;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	public void setWeight(double w)
	{
		this.weight=w;
	}
	
	public boolean getGender()
	{
		return this.isMale;
	}
	public void setGender(boolean g)
	{
		this,isMale = g;
	}
	
	public String toString()
	{
		return("Name: \t"+name"\nSurname: \t"+surname+"\nAge: \t"+age+"\nWeight: \t"+weight+"\nGender: \t"+isMale+"\n")
	}
}