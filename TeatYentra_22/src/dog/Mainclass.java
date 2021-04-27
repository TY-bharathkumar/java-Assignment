package dog;

import java.util.Scanner;

import java.util.Scanner;

class Dog {


public void speak()
{
System.out.println("this dog say boooo");
}

}
 class Lab extends Dog
 {
String color ="white+black+dots";
Double height = 5.5;
public void speak()
{
System.out.println("lk");
}
 }
 class GreatDale extends Dog
 {
Double height = 4.5;
String owner ="ck";
public void speak()
{
System.out.println("dal");
}
 }
 class Spring
 {
public Dog create(String str)
{
if(str.equalsIgnoreCase("lab"))
{
Lab l1 = new Lab();
return l1;
}
else if(str.equalsIgnoreCase("greatdale"))
{
GreatDale g1 = new GreatDale();
return g1;
}
else
{
Dog d1 = new Dog();
return d1;
}
}
 }
public class Mainclass
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter type of dog :");
String str = sc.next();
Spring s = new Spring();
Dog d1 = s.create(str);
d1.speak();

}
}
