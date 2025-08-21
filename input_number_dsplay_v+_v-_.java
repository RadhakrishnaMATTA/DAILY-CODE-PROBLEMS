import java.util.Scanner;
class Main{

public static void main(String args[])

{
int count=0,count1=0,count2=0;
Scanner sc = new Scanner(System.in);
System.out.println("eneter no");
int n = sc.nextInt();

if(n>0)
{
count++;
System.out.println("positive"+count);
 }
else if(n<0)
{
 count1++;
System.out.println("negative"+count1);

}
else {
count2++;
System.out.println("zero"+count2);
}


}

}

