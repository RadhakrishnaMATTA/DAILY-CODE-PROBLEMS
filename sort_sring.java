class Main{

public static void main(String args[])

{

String s = "madam";

StringBuffer sb = new  StringBuffer(s);


String rev = sb.reverse().toString();

if(s .equals(rev))
{

 System.out.println(s);

}

}
}