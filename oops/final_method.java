// final method is used to prevent the overrrding.
// def: in java if we declare final keyword to method. it is not 
// possible to overrding the method .so that why final key prevent the 
// overriding

class A
{
  final int gst = 100;

    final void m1()  // not overide method by using the final keyword
    {
    System.out.println("parent A");
    }

}
class B extends A
{
  void m1()
    {
      
    System.out.println("child b"+gst);

    }

}
class Main
{

public static void main(String args[])
{

B obj = new B();
obj.m1();




}


}