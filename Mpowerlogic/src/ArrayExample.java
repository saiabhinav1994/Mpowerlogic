import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter size of Array");
		Scanner sf=new Scanner(System.in);
		n=sf.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
		{
			
			a[i]=sf.nextInt();
			
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}

}
