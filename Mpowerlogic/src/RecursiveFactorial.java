import java.util.Scanner;
public class RecursiveFactorial
{
    private static Scanner s;
	public static void main(String[] args) 
    {
        int n, mul;
        s = new Scanner(System.in);
        n = s.nextInt();
        RecursiveFactorial obj = new RecursiveFactorial();
        mul = obj.fact(n);
        System.out.println(mul);
    }
    int fact(int x)
    {
        if(x > 1)
        {
            return(x * fact(x - 1));
        }
        return 1;
    }
}