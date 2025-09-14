 final class A
{

void m1()
{
System.out.println("parent class");
}


}

class B extends A
{

void m2()
{
System.out.println("chlid class");
}

}

final class Main
{

public static void main(String args[])
{

B b = new B();
b.m2();

}

}