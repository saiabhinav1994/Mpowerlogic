import java.util.Scanner;

public class PersonTestClass {

	public static void main(String[] args) {
		int t;
		Scanner st=new Scanner(System.in);
		System.out.println("Enter number of inputs");
		t=st.nextInt();
		int ageArray[] = new int[t];
		
		for(int i=0;i<t;i++)
		{
			int a;
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			ageArray[i] = a;
			
		}
		for(int i=0;i<t;i++)
		{
			Person p=new Person(ageArray[i]);
			p.amIOld();
			p.yearPasses();
			p.yearPasses();
			p.yearPasses();
			p.amIOld();
		}
	}

}
