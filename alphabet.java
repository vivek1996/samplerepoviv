import java.util.*;
public class alp
{
public static void main(String args[])
{
char ch;
Scanner scan = new Scanner(System.in);
System.out.print("enter a Character : ");
ch = scan.next().charAt(0);
if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') 
{
System.out.print(ch + " is an Alphabet");
}
else{
System.out.print(ch + " is not an Alphabet");
}}}
