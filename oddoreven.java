import java.util.Scanner;
class A
{
public static void main(String args[])
{
int x;
System.out.println("Enter an integer ");
Scanner in = new Scanner(System.in);
x = in.nextInt();
 if ( x % 2 == 0 )
 System.out.println("even number.");
 else
 System.out.println("odd number.");
}
}
