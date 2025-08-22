class Main
{

public static void main(String args[])

{

 /*  //extraction digit by digit
      int a = 123,temp=0;
      
      while(a!=0)
     {

       temp=a%10;
       System.out.println(temp);
        a/=10;
     } 

*/

     /*  boolean b = true;
       while(b)
       {
          System.out.println("hlo");
          b = false;
       }

*/


/*
     reverse the number      
 int  a =510,rev = 0;
       int copy = a;

      while(a!=0)
      {
 
       rev=rev*10+a%10;
       a/=10;

      }
     
      System.out.println(rev);

*/  

/* extract digit add one to every digit

         int a= 123,temp=0;
         while(a!=0)
         {

         temp=a%10+1;
          System.out.println(temp);
         a/=10;
    
         }
*/

/*
// palindrom number means a nuber is revers is called palindrom number 121 , 232
      int a= 222,temp=0;
      int copy = a;
      while(a!=0)
      {
       
       temp=temp*10+a%10; 
       a/=10;
      
      }//a=0
      System.out.println(copy + " " + temp);
      System.out.println((copy==temp)?"palindrom":"not palindrom");      
           
*/

// amstrong number means 123= 123

/*
     int  a = 222,temp=0 ,total=0,copy = a,total1=0;

     while(a!=0)   
  {

      temp = a%10;
      total = total +  temp*temp*temp;     // this logic for amstrong like multiople the exatract digit 
      total1 = total1*10+a%10; //this logic for palindrom are not
       
      a/=10;    
  }  
      System.out.println(total1 == copy? "palindrom":"not palindrom");
      System.out.println(copy == total?"amstromg":"not amstrong");      
      
      

   */ 


/*  
     int a = 6750,r,rev=ev1=0;
    
     while(a!=0)      //t       //t         ///t
    {
     
     rev=rev*10+a%10; //rev=5    //rev=57     //570+6 rev=576
     
     a/=10;          // a =67    //a=6        //a=0
     
    } 
    System.out.println(rev);//576
    
    while(rev !=0)         //true 
   {

     rev1= rev%10;         //6
     rev/=10;   
    switch(rev1)
     {

    case 5:
     System.out.println("five");
     break;
   
    case 6:
     System.out.println("six");
     break;
    case 7:
    System.out.println("seven");
    break;
    default:
    System.out.println("others");
     
    }


     }
     

*/
  

/*

      int n = 12000,rev=0,rev1=0;

          while(n!=0)       //t         //t      //t       //t        //t
          {
                                         
          rev=rev*10+n%10;    //rev=0   //rev=0   //rev=0    //rev=2   //2*10+1
          

            n/=10;             //n=1200  //n=120    //n=12       //n=1   //n=0
           

            }
             System.out.println(rev);

            while(rev!=0)
            {

            rev1 = rev%10;

            rev/=10;
           
             }

           // System.out.println(rev);
            System.out.println(rev1);                

*/
  /*
        int a =5 ;
        
         double d = Math.pow(a,3);
         System.out.println(d);
 


*/

/*
        int a = 154;
        int copy = a;
         double dup =0;

         while(a!=0)
         {

        int temp = a%10;
      
        double d = Math.pow(temp,3);
        dup += d;
         a/=10;


          }
          
System.out.println(copy==dup?"amstrong":"not amstrong");
           
*/
       /*        
            int a = 153,count=0,temp=0;
            int copy =a; 
            double temp1=0;
            int copy = a;
             while(a!=0)            //t    //t  //t //f
             {

             count++;               //1    //2   //3
             a/=10;                 //15   //1    //0

             } 
            System.out.println(count);  //comt =3
            
                         
             //copy =a;  //
 
             while(copy!=0) //t
               {
  
                 temp=copy%10;  //3
                  
                 double d = Math.pow(temp,count);
                 temp1+=d;

                a/=10;                  
                 

              }
            System.out.println(a+ ""+temp1);

             System.out.println(copy==temp1?"amstrong":"not amstrong");

          */

/*------------------------------------------------------------------------------------------------------------------------------*/


/*

             int n = 123456789,count=0,product=1,product1=1;
             while( n!=0)
              {
             
               count++;

                 if (count ==1 || count==7 || count==6 || count==5)

                   {
                      product *=n%10;

                   }
                   else
                    
                   product1 *=n%10;

                          
                n/=10;
               }      
               System.out.println(product);
               System.out.println(product);
 




*/

/*
// take number and extract it specifiy the number in certain range-1-4 ,5,6> find the count vale based on this range
                int a = 912345678,temp=0,min=0,max=0,nom=0;

                while(a !=0)

                   { 

                     temp=a%10;
                     
                     if(temp>=1 && temp<=4)
                               //System.out.println("min");
                                 min++;

                      else if(temp==5)
                           // System.out.println("max");
                              max++;

                      else
                          // System.out.println("no ");
                            nom++;

                      a/=10;
                    }

                   System.out.println(min+""+max+""+nom);


*/


//extract the digit and count the how many even number or and odd numbers

/*                 int n = 12345678,temp=0,even=0,odd=0;
                  while(n!=0)
                  {
                   temp= n%10; 
                  
                     if(temp%2==0)
                        even++;
                     else
                      odd++;
                    n/=10; 
                  }
                   System.out.println(even +""+ odd);

*/

/* 
//find the number based on specific postion nuber no we print 

    int a = 123456789,count=0;

      while(a!=0)
      { 
       
       count++;
       if(count==1 || count==4 || count==3)
        System.out.println(a%10);

        a/=10;       
     
       } 

 
*/



 int a= 1234, count=0,sum=0,sum1=0;
 while(a!=0)
 {
   count++;
   
   
  if(count%2==0)
  {
      sum =sum+a%10;
      
      
  }
   else
    
    sum1+=a%10;
    
a/=10;
 }
  System.out.println(sum + "      \t"+sum1);




        
}


}