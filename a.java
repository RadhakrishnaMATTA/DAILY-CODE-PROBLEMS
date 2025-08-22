
class Main {
    public static void main(String[] args) {
              
       
    
         Demo  demo = new Demo(); 
      
        //demo.number_of_words();  
         
          StringBuffer d = demo.buffer();
          
          System.out.println(d);



   }

     
}






class Demo
{

  
StringBuffer buffer()
 {

   StringBuffer s = new StringBuffer("madam is wow");


   s.reverse();
   //System.out.println(s);

 return s;
       
//reverse 




}


void chek_plindrom( )
{


 


}
    




void  number_of_words( )
   {

    String s = new String("hi ra mava how are you");
   
    String arr[] = s.split(" "); 
  
   System.out.println(arr.length);
    
   }









}      
           
         
   


