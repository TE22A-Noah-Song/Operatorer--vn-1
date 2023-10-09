import java.util.Scanner;
public class App {
public static void main(String[] args)
{
// Scanner tangentbord=new Scanner(System.in);
// System.out.println("Skriv in första talet:");
// int tal1=tangentbord.nextInt();
// System.out.println("Skriv in andra talet:");
// int tal2=tangentbord.nextInt();

// System.out.println(tal1==tal2);
// System.out.println(tal1<tal2);
// System.out.println(tal1>tal2);

// int fält[]={4,5,2};
// System.out.println((fält[0]>fält[1])+" "+(fält[0]>fält[2]));
// System.out.println((fält[0]<fält[1])+" "+(fält[0]<fält[2]));
// System.out.println((fält[0]==fält[1])+" "+(fält[0]==fält[2]));


Scanner tangentbord=new Scanner(System.in);
System.out.println("Skriv in ett tal:");
int x=tangentbord.nextInt();
int xreserv=x;
x+=7;
x*=2;
x-=6;
x/=2;
x+=3;
x-=xreserv;
System.out.println(x);
System.out.println(x==7);
 }
}
