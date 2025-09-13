//final keyword
class Main
{

//1 check final varibale intilization;

//final int a;  // <--1 not possible


final int a =10; //<--2. this is possible


final int b;     //<-- 3. using constructor this is possible

 Main() // by using constrctor 
{
 b = 10;

}


final int c ;    // <--4.inside instance block. this is possible

{
c=100;
}


final int d;    // <-- 5. inside method is not possible.

//void m1()
{

d =100;
}

public static void main(String args[])
{

Main obj = new Main();

obj.d=1000;  // reassign the final value <-- it is not possible
System.out.println(obj.d);

}

}

// -------------------------------------------------------------- 