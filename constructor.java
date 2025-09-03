class Main

{

int modelYear;
String modelname;


Main(int year, String name)

{
modelYear =year; 
modelname =name;
}


Main()
{
System.out.println("this is scond constructor");

}
public static void main(String args[])

 {

Main obj = new Main(2025,"suzaki");

System.out.println(obj.modelYear);


Main obj1 = new Main();



}
}






/*
class Main

{

  int id ;
  String name;
  String college;
  int age;

 Main(int id,String name , String college, int age)
 {
 
    this.id = id;
    this.name = name;
    this.college = college;
    this.age = age;

 }







public static void main(String args[])

{

 Main obj = new Main(21,"radha","dmssvh",22);

System.out.println(obj.id);





}

}

*/






/*
class Main

{

int x;

Main(int y)
{

x=y;
}



public static void main(String args[])

 {

 Main obj = new Main(5);
System.out.println(obj.x);

 



}



}

*/









/*
 class Main {
 
 int x;

 Main()
{
 System.out.println("this is constructor" + x);
  x = 5;

}






    public static void main(String[] args) {

     Main m = new Main();
    System.out.println(m.x);
              
}

}

*/



