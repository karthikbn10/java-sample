class Fizz
{
public static void main(String args[])
{
for(int i=1; i<=50 ; i++)
{
if(i%10 == 1)
System.out.println();
if(i%3 == 0 && i%5 == 0)
{
System.out.print("Fizzbuzz ");
}
else if(i%3 == 0)
{
System.out.print("Fizz ");
}
else if(i%5 == 0)
{
System.out.print("buzz ");
}
else
{
System.out.print(i + " ");
}
}}}