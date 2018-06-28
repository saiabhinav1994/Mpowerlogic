//Task 5

class Person {
	int age;
	public Person(int initialAge)
	{
		if(initialAge>=0)
		{
			age=initialAge;
		}
		else
		{
		  age=0;
		  System.out.println("Age is not valid");
		}
		 
	}
	
	public void yearPasses()
	{
		age++;
	}
	public void amIOld()
	{
		if(age<13)
		{
			System.out.println("You are young");
		}
		else if(age<18)
		{
			System.out.println("You are teenager");
		}
		else
		{
			System.out.println("You are old");
		}
	}

	
}

