import java.util.Scanner;
public class App {
public static void main(String[] args)
{
Scanner tangentbord=new Scanner(System.in);
System.out.println("Skriv in första talet:");
int tal1=tangentbord.nextInt();
System.out.println("Skriv in andra talet:");
int tal2=tangentbord.nextInt();

System.out.println(tal1==tal2);
System.out.println(tal1<tal2);
System.out.println(tal1>tal2);
 }
}
