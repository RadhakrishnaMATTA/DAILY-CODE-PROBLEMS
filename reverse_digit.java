      

class Main {
    public static void main(String[] args) {
       
       int n =419,temp=0,rev=0,rev1=0;
       int copy=n;
       
       while(n!=0)
       
       {
           rev1 = (rev1*10)+n%10;
           
           n/=10;
           
       }
       System.out.println(rev1);
       
       n=rev1;
       while(n!=0)
       {
           
           int digit = n%10; //9  //1 //1
           
            temp = (digit+1) %10;  //0  //2   1
           
            rev = rev *10+temp;   //rev=10 //12 //12*10+1 121   
           
           n/=10;
       }
       
       System.out.println(rev);
       
       
    }
}
