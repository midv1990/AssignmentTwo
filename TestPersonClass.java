

public class TestPerson
{
	//Testing Floats
	public void gettingFat() throws Exception
	{
		//Person (String n, String sn, int a, double w, boolean gender)
		Person p1 = new Person("Ihsaan","de Villiers",26,50.5,true);
		p1.pickedUpWeight();
		assertEquals(52.00, p1.getWeight());
	}
	
	//Test Int
	public void getttingOld() throws Exception
	{
		Person p2 = new Person("Fatigah","Fataar",26,45.0,false);
		p1.incrementAge();
		assertEquals(27, p1.getAge());
	}
	
	//test object Identity
	public void sameIdentity() throws Exception
	{
		Person p3 = new Person("Rahmah","de Villiers",5,20.5,false);
		Person p4 = p3;
		assertSame(p3,p4);
	}
	
	//test equality
	public void sameSame() throws Exception
	{
		Person p5 = new Person("Muhammad Nur","de Villiers",0,1.5,true);
		Person p6 = new Person("Muhammad Nur","de Villiers",0,1.5,true);
		assertTrue(Person.checkEquality(p5,p6));
	}
	
	//test Truth and False
	public void trueLies() throws Exception
	{
		Person p7 = new Person("Abu-Bakr","Ahmad",2,10.35,true);
		assertTrue(p7.getGender());
		
		p7.setGender(false);
		assertFalse(p7.getGender());
	}
	
	//test NULL & NOTNULL
	public void FullOfNothing() throws Exception
	{
		Person p8 = new Person();
		assertNotNull(p8);
		
		p8 = null;
		assertNull(p8);
		
	}
	
	
}